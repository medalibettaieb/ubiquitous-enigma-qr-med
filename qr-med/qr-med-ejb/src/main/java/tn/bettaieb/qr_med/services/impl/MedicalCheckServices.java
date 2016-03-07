package tn.bettaieb.qr_med.services.impl;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import tn.bettaieb.qr_med.persistence.Doctor;
import tn.bettaieb.qr_med.persistence.MedicalCheck;
import tn.bettaieb.qr_med.persistence.Patient;
import tn.bettaieb.qr_med.services.interfaces.MedicalCheckServicesLocal;
import tn.bettaieb.qr_med.services.interfaces.MedicalCheckServicesRemote;
import tn.bettaieb.qr_med.services.interfaces.UserServicesLocal;

/**
 * Session Bean implementation class MedicalCheckServices
 */
@Stateless
public class MedicalCheckServices implements MedicalCheckServicesRemote, MedicalCheckServicesLocal {
	@PersistenceContext
	private EntityManager entityManager;
	@EJB
	private UserServicesLocal userServicesLocal;

	/**
	 * Default constructor.
	 */
	public MedicalCheckServices() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Boolean createMedicalChek(String diagnostic, Integer idDoctor, Integer idPatient) {
		Boolean b = false;
		try {
			Patient patient = (Patient) userServicesLocal.findUserById(idPatient);
			Doctor doctor = (Doctor) userServicesLocal.findUserById(idDoctor);
			MedicalCheck medicalCheck = new MedicalCheck(diagnostic, doctor, patient);
			entityManager.persist(medicalCheck);
			b = true;
		} catch (Exception e) {
		}
		return b;
	}

}
