package tn.bettaieb.qr_med.persistence;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

/**
 * Entity implementation class for Entity: Doctor
 *
 */
@Entity

public class Doctor extends User implements Serializable {

	private String speciality;
	private static final long serialVersionUID = 1L;

	@OneToMany(mappedBy = "doctor")
	private List<MedicalCheck> medicalChecks;

	public Doctor() {
		super();
	}

	public Doctor(String name,String speciality) {
		this.setName(name);
		this.speciality = speciality;
	}

	public String getSpeciality() {
		return this.speciality;
	}

	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}

	public List<MedicalCheck> getMedicalChecks() {
		return medicalChecks;
	}

	public void setMedicalChecks(List<MedicalCheck> medicalChecks) {
		this.medicalChecks = medicalChecks;
	}

}
