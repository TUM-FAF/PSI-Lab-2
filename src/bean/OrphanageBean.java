package bean;

import java.util.List;

import javax.faces.bean.ManagedBean;

import entity.Orphanage;
import service.OrphanageService;


@ManagedBean
public class OrphanageBean {
	
	private Orphanage newOrphanage;
	private List<Orphanage> orphanages;
	private OrphanageService orphanageService = new OrphanageService();
	
	
	public Orphanage getNewOrphanage() {
		return newOrphanage;
	}
	public void setNewOrphanage(Orphanage newOrphanage) {
		this.newOrphanage = newOrphanage;
	}
	public List<Orphanage> getOrphanages() {
		System.out.println("in getter bean");
		return orphanageService.getOrphanages();
		 
	}
	public void setOrphanages(List<Orphanage> orphanages) {
		this.orphanages = orphanages;
	}
	
	public void addOrphanage(){
		orphanageService.addOrphanage(newOrphanage);
	}
	
	public void outcome(){
		
	}
	
}
