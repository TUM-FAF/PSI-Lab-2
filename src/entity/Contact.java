package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Contact {
	private Integer id;
	private String contact;
	private Integer orphanageId;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	@Column(name = "contact")
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	
	@Column(name = "orphanage_id")
	public Integer getOrphanageId() {
		return orphanageId;
	}
	public void setOrphanageId(Integer orphanageId) {
		this.orphanageId = orphanageId;
	}
	
}
