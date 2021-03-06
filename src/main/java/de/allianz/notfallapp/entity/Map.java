package de.allianz.notfallapp.entity;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="map")
public class Map implements Serializable {


	/**
	 * 
	 */
	private static final long serialVersionUID = 8159721881807708211L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="map_id")
	private int map_id;
	
	@Column(name="map_name")
	private String map_name;
	
	@OneToMany(mappedBy="map")
	private List<Room> rooms = new LinkedList<>();
	
	@OneToMany(mappedBy="map")
	private List<Position> positions = new LinkedList<>();
	
	@OneToMany(mappedBy="map")
	private List<POI> pois = new LinkedList<>();
	
	Map() { // jpa only
	}
	
	public Map(String map_name) {
		this.map_name = map_name;
	}
	
	public int getMap_id() {
		return map_id;
	}
	
	public String getMap_name() {
		return map_name;
	}

	public void setMap_id(int map_id) {
		this.map_id = map_id;
	}

	public void setMap_name(String map_name) {
		this.map_name = map_name;
	}
	
}
