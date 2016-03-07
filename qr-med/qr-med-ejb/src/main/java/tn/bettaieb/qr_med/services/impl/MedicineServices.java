package tn.bettaieb.qr_med.services.impl;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import tn.bettaieb.qr_med.persistence.Medicine;
import tn.bettaieb.qr_med.services.interfaces.MedicineServicesLocal;
import tn.bettaieb.qr_med.services.interfaces.MedicineServicesRemote;

/**
 * Session Bean implementation class MedicineServices
 */
@Stateless
public class MedicineServices implements MedicineServicesRemote, MedicineServicesLocal {
	@PersistenceContext
	private EntityManager entityManager;

	/**
	 * Default constructor.
	 */
	public MedicineServices() {
	}

	@Override
	public Boolean addMedicine(Medicine medicine) {
		Boolean b = false;
		try {
			entityManager.persist(medicine);
			b = true;
		} catch (Exception e) {
		}
		return b;
	}

	@Override
	public Boolean deleteMedicineById(Integer id) {
		Boolean b = false;
		try {
			entityManager.remove(findMedicineById(id));
			b = true;
		} catch (Exception e) {
		}
		return b;
	}

	@Override
	public Boolean updateMedicine(Medicine medicine) {
		Boolean b = false;
		try {
			entityManager.merge(medicine);
			b = true;
		} catch (Exception e) {
		}
		return b;
	}

	@Override
	public Medicine findMedicineById(Integer id) {
		return entityManager.find(Medicine.class, id);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Medicine> findAllMedicines() {
		String jpql = "select m from Medicine m";
		Query query = entityManager.createQuery(jpql, Medicine.class);
		return query.getResultList();
	}

}
