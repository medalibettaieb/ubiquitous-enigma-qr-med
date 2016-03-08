package tn.bettaieb.qr_med.persistence;

import java.io.Serializable;
import java.lang.Integer;
import java.lang.String;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Medicine
 *
 */
@Entity

public class Medicine implements Serializable {

	   
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private String name;
	private static final long serialVersionUID = 1L;
	
	@OneToMany(mappedBy="medicine")
	private List<MedicalTreatment> medicalTreatments;

	public Medicine() {
		super();
	}   
	
	public Medicine(String name) {
		super();
		this.name = name;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}   
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public List<MedicalTreatment> getPrescriptions() {
		return medicalTreatments;
	}
	public void setPrescriptions(List<MedicalTreatment> medicalTreatments) {
		this.medicalTreatments = medicalTreatments;
	}
   
}
