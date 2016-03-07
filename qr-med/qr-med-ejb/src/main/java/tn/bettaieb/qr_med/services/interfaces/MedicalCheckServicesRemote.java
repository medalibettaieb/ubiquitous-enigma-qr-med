package tn.bettaieb.qr_med.services.interfaces;

import javax.ejb.Remote;

@Remote
public interface MedicalCheckServicesRemote {
	Boolean createMedicalChek(String diagnostic, Integer idDoctor, Integer idPatient);
}
