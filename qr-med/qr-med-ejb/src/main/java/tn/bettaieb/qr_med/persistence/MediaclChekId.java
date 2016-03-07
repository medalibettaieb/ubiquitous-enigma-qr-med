package tn.bettaieb.qr_med.persistence;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Embeddable;

@Embeddable
public class MediaclChekId implements Serializable {
	/**
		 * 
		 */
	private static final long serialVersionUID = 1L;
	private Integer idPatient;
	private Integer idDoctor;
	private Date dateOfCheck;

	public MediaclChekId() {
		// TODO Auto-generated constructor stub
	}

	public MediaclChekId(Integer idPatient, Integer idDoctor, Date dateOfCheck) {
		super();
		this.idPatient = idPatient;
		this.idDoctor = idDoctor;
		this.dateOfCheck = dateOfCheck;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dateOfCheck == null) ? 0 : dateOfCheck.hashCode());
		result = prime * result + ((idDoctor == null) ? 0 : idDoctor.hashCode());
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
		MediaclChekId other = (MediaclChekId) obj;
		if (dateOfCheck == null) {
			if (other.dateOfCheck != null)
				return false;
		} else if (!dateOfCheck.equals(other.dateOfCheck))
			return false;
		if (idDoctor == null) {
			if (other.idDoctor != null)
				return false;
		} else if (!idDoctor.equals(other.idDoctor))
			return false;
		if (idPatient == null) {
			if (other.idPatient != null)
				return false;
		} else if (!idPatient.equals(other.idPatient))
			return false;
		return true;
	}

	public Integer getIdPatient() {
		return idPatient;
	}

	public void setIdPatient(Integer idPatient) {
		this.idPatient = idPatient;
	}

	public Integer getIdDoctor() {
		return idDoctor;
	}

	public void setIdDoctor(Integer idDoctor) {
		this.idDoctor = idDoctor;
	}

	public Date getDateOfCheck() {
		return dateOfCheck;
	}

	public void setDateOfCheck(Date dateOfCheck) {
		this.dateOfCheck = dateOfCheck;
	}

}
