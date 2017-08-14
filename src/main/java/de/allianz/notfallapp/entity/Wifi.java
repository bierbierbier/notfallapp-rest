package de.allianz.notfallapp.entity;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name="wifi")
public class Wifi {
	@EmbeddedId
	private WifiPk key;
	
	@ManyToOne
	@MapsId("posId")
	@JoinColumn(name="pos_id")
	@JsonBackReference
	private Position position;
	
	@Column(name="lvl")
	private int lvl;
	
	
	Wifi() { //jpa only
	}
	
	public Wifi(Position position, int lvl) {
		this.position = position;
		this.lvl = lvl;
	}

	public Position getPosition() {
		return position;
	}

	public int getLvl() {
		return lvl;
	}
	
}
