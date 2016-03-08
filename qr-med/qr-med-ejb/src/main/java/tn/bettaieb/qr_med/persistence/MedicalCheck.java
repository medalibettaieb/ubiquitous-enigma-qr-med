package tn.bettaieb.qr_med.persistence;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 * Entity implementation class for Entity: MedicalCheck
 *
 */
@Entity

public class MedicalCheck implements Serializable {
	@EmbeddedId
	private MediaclChekId mediaclChekId;
	private String diagnostic;
	private static final long serialVersionUID = 1L;

	@OneToMany(mappedBy = "medicalCheck")
	private List<MedicalTreatment> medicalTreatments;

	@ManyToOne
	@JoinColumn(name = "idDoctor", referencedColumnName = "id", insertable = false, updatable = false)
	private Doctor doctor;
	@ManyToOne
	@JoinColumn(name = "idPatient", referencedColumnName = "id", insertable = false, updatable = false)
	private Patient patient;

	public MedicalCheck() {
		super();
	}

	public MedicalCheck(String diagnostic, Doctor doctor, Patient patient) {
		super();
		this.mediaclChekId = new MediaclChekId(patient.getId(), doctor.getId(), new Date());
		this.diagnostic = diagnostic;
		this.doctor = doctor;
		this.patient = patient;
	}

	public String getDiagnostic() {
		return this.diagnostic;
	}

	public void setDiagnostic(String diagnostic) {
		this.diagnostic = diagnostic;
	}

	public MediaclChekId getMediaclChekId() {
		return mediaclChekId;
	}

	public void setMediaclChekId(MediaclChekId mediaclChekId) {
		this.mediaclChekId = mediaclChekId;
	}

	public List<MedicalTreatment> getPrescriptions() {
		return medicalTreatments;
	}

	public void setPrescriptions(List<MedicalTreatment> medicalTreatments) {
		this.medicalTreatments = medicalTreatments;
	}

	public Doctor getDoctor() {
		return doctor;
	}

	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}

	public Patient getPatient() {
		return patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}

}
