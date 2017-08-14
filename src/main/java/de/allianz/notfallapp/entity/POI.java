package de.allianz.notfallapp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name="poi")
public class POI {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="poi_id")
	private long poi_id;
	
	@ManyToOne
	@JoinColumn(name="map_id")
	@JsonBackReference
	private Map map;
	
	@Column(name="x")
	private int x;
	
	@Column(name="y")
	private int y;
	
	@Column(name="img_src")
	private String img_src;
	
	POI() { // jpa only
	}
	
	public POI(Map map, int x, int y, String img_src) {
		this.map = map;
		this.x = x;
		this.y = y;
		this.img_src = img_src;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public Map getMap() {
		return map;
	}

	public String getImg_src() {
		return img_src;
	}
	
	
	
}
