package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "activities")
public class Activitie {
	private Integer id;
	private String name;
	private String description;
	private String pictureLink;
	private Integer orphanageId;
	private Orphanage orphanage;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	@Column(name = "name")
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Column(name = "description")
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	@Column(name = "picture_link")
	public String getPictureLink() {
		return pictureLink;
	}
	public void setPictureLink(String pictureLink) {
		this.pictureLink = pictureLink;
	}
	
	@Column(name = "orphanage_id")
	public Integer getOrphanageId() {
		return orphanageId;
	}
	public void setOrphanageId(Integer orphanageId) {
		this.orphanageId = orphanageId;
	}
	@ManyToOne(fetch = FetchType.LAZY )
	public Orphanage getOrphanage() {
		return orphanage;
	}
	public void setOrphanage(Orphanage orphanage) {
		this.orphanage = orphanage;
	}
	
	
	
	
}
