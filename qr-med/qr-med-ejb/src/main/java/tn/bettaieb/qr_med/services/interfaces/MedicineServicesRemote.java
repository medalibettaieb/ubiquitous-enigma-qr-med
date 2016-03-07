package tn.bettaieb.qr_med.services.interfaces;

import java.util.List;

import javax.ejb.Remote;

import tn.bettaieb.qr_med.persistence.Medicine;

@Remote
public interface MedicineServicesRemote {
	Boolean addMedicine(Medicine medicine);

	Boolean deleteMedicineById(Integer id);

	Boolean updateMedicine(Medicine medicine);

	Medicine findMedicineById(Integer id);

	List<Medicine> findAllMedicines();

}
