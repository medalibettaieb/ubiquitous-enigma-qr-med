package tn.bettaieb.qr_med.services.interfaces;

import java.util.List;

import javax.ejb.Local;

import tn.bettaieb.qr_med.persistence.Medicine;

@Local
public interface MedicineServicesLocal {
	Boolean addMedicine(Medicine medicine);

	Boolean deleteMedicineById(Integer id);

	Boolean updateMedicine(Medicine medicine);

	Medicine findMedicineById(Integer id);

	List<Medicine> findAllMedicines();
}
