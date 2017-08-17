package de.allianz.notfallapp.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name="position")
public class Position implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3794741961791293128L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="pos_id")
	private int pos_id;
	
	@ManyToOne
	@JoinColumn(name="map_id", referencedColumnName="map_id")
	@JsonBackReference
	private Map map;
//	
//	@Column(name="map_id")
//	private int map_id;
	@Column(name="x")
	private int x;
	
	@Column(name="y")
	private int y;
	
	@OneToMany(mappedBy="position")
	private List<Wifi> wifis = new LinkedList<>();
	
//	@Column(name="timestamp")
//	@GeneratedValue(strategy=GenerationType.AUTO)
//	private Date timestamp;
	/*
	 * TEST
	 */
	
	Position() { // jpa only
	}
	
	public Position(Map map, int x, int y) {
		System.out.println("TEST: " + map.getMap_id());
		this.map = map;
		this.x = x;
		this.y = y;
	}

	public int getPos_id() {
		return pos_id;
	}

	public Map getMap() {
		return map;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public int getmap_id() {
		return this.map.getMap_id();
	}

	public List<Wifi> getWifis() {
		return wifis;
	}

//	public Date getTimestamp() {
//		return timestamp;
//	}
//
//	public void setTimestamp(Date timestamp) {
//		this.timestamp = timestamp;
//	}
	
	
}
