package tn.bettaieb.qr_med.persistence;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Embeddable;

@Embeddable
public class MedicalTeatmentId implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer idMedicine;
	private Integer idDoctor;
	private Integer idPatient;
	private Date dateOfPrescription;

	public MedicalTeatmentId() {
	}

	public MedicalTeatmentId(Integer idMedicine, Integer idDoctor, Integer idPatient, Date dateOfPrescription) {
		super();
		this.idMedicine = idMedicine;
		this.idDoctor = idDoctor;
		this.idPatient = idPatient;
		this.dateOfPrescription = dateOfPrescription;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dateOfPrescription == null) ? 0 : dateOfPrescription.hashCode());
		result = prime * result + ((idDoctor == null) ? 0 : idDoctor.hashCode());
		result = prime * result + ((idMedicine == null) ? 0 : idMedicine.hashCode());
		result = prime * result + ((idPatient == null) ? 0 : idPatient.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MedicalTeatmentId other = (MedicalTeatmentId) obj;
		if (dateOfPrescription == null) {
			if (other.dateOfPrescription != null)
				return false;
		} else if (!dateOfPrescription.equals(other.dateOfPrescription))
			return false;
		if (idDoctor == null) {
			if (other.idDoctor != null)
				return false;
		} else if (!idDoctor.equals(other.idDoctor))
			return false;
		if (idMedicine == null) {
			if (other.idMedicine != null)
				return false;
		} else if (!idMedicine.equals(other.idMedicine))
			return false;
		if (idPatient == null) {
			if (other.idPatient != null)
				return false;
		} else if (!idPatient.equals(other.idPatient))
			return false;
		return true;
	}

	public Integer getIdMedicine() {
		return idMedicine;
	}

	public void setIdMedicine(Integer idMedicine) {
		this.idMedicine = idMedicine;
	}

	public Integer getIdDoctor() {
		return idDoctor;
	}

	public void setIdDoctor(Integer idDoctor) {
		this.idDoctor = idDoctor;
	}

	public Integer getIdPatient() {
		return idPatient;
	}

	public void setIdPatient(Integer idPatient) {
		this.idPatient = idPatient;
	}

	public Date getDateOfPrescription() {
		return dateOfPrescription;
	}

	public void setDateOfPrescription(Date dateOfPrescription) {
		this.dateOfPrescription = dateOfPrescription;
	}

}
