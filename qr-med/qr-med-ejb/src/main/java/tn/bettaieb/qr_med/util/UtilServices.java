package tn.bettaieb.qr_med.util;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Singleton;
import javax.ejb.Startup;

import tn.bettaieb.qr_med.persistence.Doctor;
import tn.bettaieb.qr_med.persistence.Medicine;
import tn.bettaieb.qr_med.persistence.Patient;
import tn.bettaieb.qr_med.services.interfaces.MedicineServicesLocal;
import tn.bettaieb.qr_med.services.interfaces.UserServicesLocal;

/**
 * Session Bean implementation class UtilServices
 */
@Singleton
@LocalBean
@Startup
public class UtilServices {
	@EJB
	private UserServicesLocal userServicesLocal;
	@EJB
	private MedicineServicesLocal medicineServicesLocal;

	/**
	 * Default constructor.
	 */
	public UtilServices() {
		// TODO Auto-generated constructor stub
	}

	@PostConstruct
	public void initDb() {
		Patient patient = new Patient("bessem", 12);
		Patient patient2 = new Patient("hadj", 13);
		Patient patient3 = new Patient("karray", 14);

		Doctor doctor = new Doctor("imed", "dhab7");
		Doctor doctor2 = new Doctor("sana", "marj");

		Medicine medicine = new Medicine("ECLARAN 5 gel p appl loc");
		Medicine medicine2 = new Medicine("PRADAXA 110 mg gél");

		userServicesLocal.addUser(doctor);
		userServicesLocal.addUser(doctor2);
		userServicesLocal.addUser(patient);
		userServicesLocal.addUser(patient2);
		userServicesLocal.addUser(patient3);

		medicineServicesLocal.addMedicine(medicine);
		medicineServicesLocal.addMedicine(medicine2);

	}
}
