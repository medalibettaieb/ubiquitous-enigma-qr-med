package tn.bettaieb.qr_med.persistence;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;

/**
 * Entity implementation class for Entity: Prescription
 *
 */
@Entity

public class Prescription implements Serializable {
	@EmbeddedId
	private PrescriptionId prescriptionId;
	private Integer quantity;
	private static final long serialVersionUID = 1L;

	@ManyToOne
	@JoinColumn(name = "idMedicine", referencedColumnName = "id", insertable = false, updatable = false)
	private Medicine medicine;
	// @ManyToOne
	// @JoinColumns({ @JoinColumn(name = "idPatient", referencedColumnName = "",
	// insertable = false, updatable = false),
	// @JoinColumn(name = "dateOfCheck", referencedColumnName = "", insertable =
	// false, updatable = false),
	// @JoinColumn(name = "idDoctor", referencedColumnName = "", insertable =
	// false, updatable = false), }
	//
	// )
	// private MedicalCheck medicalCheck;

	@ManyToOne
	@JoinColumns({ @JoinColumn(name = "idPatient", referencedColumnName = "idPatient", insertable = false, updatable = false),
			@JoinColumn(name = "dateOfCheck", referencedColumnName = "dateOfCheck", insertable = false, updatable = false),
			@JoinColumn(name = "idDoctor", referencedColumnName = "idDoctor", insertable = false, updatable = false), }

	)
	private MedicalCheck medicalCheck;

	public Prescription() {
		super();
	}

	public Integer getQuantity() {
		return this.quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public PrescriptionId getPrescriptionId() {
		return prescriptionId;
	}

	public void setPrescriptionId(PrescriptionId prescriptionId) {
		this.prescriptionId = prescriptionId;
	}

	public Medicine getMedicine() {
		return medicine;
	}

	public void setMedicine(Medicine medicine) {
		this.medicine = medicine;
	}

	public MedicalCheck getMedicalCheck() {
		return medicalCheck;
	}

	public void setMedicalCheck(MedicalCheck medicalCheck) {
		this.medicalCheck = medicalCheck;
	}

}
