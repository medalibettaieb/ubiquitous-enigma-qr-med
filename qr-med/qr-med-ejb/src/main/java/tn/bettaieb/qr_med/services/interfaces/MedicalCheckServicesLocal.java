package tn.bettaieb.qr_med.services.interfaces;

import javax.ejb.Local;

@Local
public interface MedicalCheckServicesLocal {
	Boolean createMedicalChek(String diagnostic, Integer idDoctor, Integer idPatient);
}
