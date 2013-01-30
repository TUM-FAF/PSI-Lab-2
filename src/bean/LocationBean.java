package bean;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import entity.Location;
import service.LocationService;


@ManagedBean
@SessionScoped
public class LocationBean {
	
	private List<Location> allLocations;
	private LocationService locationService = new LocationService();

	public List<Location> getAllLocations() {
		allLocations = locationService.getLocations();
		return allLocations;
	}

	public void setAllLocations(List<Location> allLocations) {
		this.allLocations = allLocations;
	}
	

}
