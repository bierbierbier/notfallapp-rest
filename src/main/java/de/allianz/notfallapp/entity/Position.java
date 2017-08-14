package de.allianz.notfallapp.entity;

import java.io.Serializable;
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
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="pos_id")
	private int pos_id;
	
	@ManyToOne
	@JoinColumn(name="map_id")
	@JsonBackReference
	private Map map;
	
	@Column(name="x")
	private int x;
	
	@Column(name="y")
	private int y;
	
	@OneToMany(mappedBy="position")
	private List<Wifi> wifis = new LinkedList<>();
	
	Position() { // jpa only
	}
	
	public Position(Map map, int x, int y) {
		this.map = map;
		this.x = x;
		this.y = y;
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
	
}
