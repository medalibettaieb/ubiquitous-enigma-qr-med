package tn.bettaieb.qr_med.persistence;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

/**
 * Entity implementation class for Entity: Patient
 *
 */
@Entity

public class Patient extends User implements Serializable {

	private Integer age;
	private static final long serialVersionUID = 1L;
	@OneToMany(mappedBy = "patient")
	private List<MedicalCheck> medicalChecks;

	public Patient() {
		super();
	}

	public Patient(String name, Integer age) {
		this.setName(name);
		this.age = age;
	}

	public Integer getAge() {
		return this.age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public List<MedicalCheck> getMedicalChecks() {
		return medicalChecks;
	}

	public void setMedicalChecks(List<MedicalCheck> medicalChecks) {
		this.medicalChecks = medicalChecks;
	}

}
