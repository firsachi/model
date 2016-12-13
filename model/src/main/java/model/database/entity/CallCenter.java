package model.database.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(schema = "public", name = "call_center")
public class CallCenter implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@SequenceGenerator (name = "id_call_center", allocationSize = 1)
	@GeneratedValue (strategy = GenerationType.SEQUENCE)
	@Basic(optional = false)
	@Column (name = "id", nullable = false)
	private Integer id;
	
	@Basic(optional = false)
	@Column(name = "number", nullable = false)
	private String numberTreatment;
	
	@Basic(optional = false)
	@Column(name = "date_treatment", nullable = false)
    @Temporal(TemporalType.DATE)
	private Date date;
	
	@Basic(optional = false)
    @Column(name = "correspondent", nullable = false, length = 2147483647)
	private String citizen;
	
	@Basic(optional = false)
    @Column(name = "content", nullable = false, length = 2147483647)
	private String Treatment;
	
	public CallCenter() {
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNumberTreatment() {
		return numberTreatment;
	}
	public void setNumberTreatment(String numberTreatment) {
		this.numberTreatment = numberTreatment;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getCitizen() {
		return citizen;
	}
	public void setCitizen(String citizen) {
		this.citizen = citizen;
	}
	public String getTreatment() {
		return Treatment;
	}
	public void setTreatment(String treatment) {
		Treatment = treatment;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Treatment == null) ? 0 : Treatment.hashCode());
		result = prime * result + ((citizen == null) ? 0 : citizen.hashCode());
		result = prime * result + ((date == null) ? 0 : date.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((numberTreatment == null) ? 0 : numberTreatment.hashCode());
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
		CallCenter other = (CallCenter) obj;
		if (Treatment == null) {
			if (other.Treatment != null)
				return false;
		} else if (!Treatment.equals(other.Treatment))
			return false;
		if (citizen == null) {
			if (other.citizen != null)
				return false;
		} else if (!citizen.equals(other.citizen))
			return false;
		if (date == null) {
			if (other.date != null)
				return false;
		} else if (!date.equals(other.date))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (numberTreatment == null) {
			if (other.numberTreatment != null)
				return false;
		} else if (!numberTreatment.equals(other.numberTreatment))
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return "TreatmentCall [id=" + id + ", numberTreatment=" + numberTreatment + ", date=" + date + ", citizen="
				+ citizen + ", Treatment=" + Treatment + "]";
	}
}
