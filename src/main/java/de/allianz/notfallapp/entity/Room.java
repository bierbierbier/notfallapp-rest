package de.allianz.notfallapp.entity;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name="room")
public class Room {
	@EmbeddedId
	private RoomPk key;
	
	@ManyToOne
	@MapsId("mapId")
	@JoinColumn(name="map_id")
	@JsonBackReference
	private Map map;

	Room() { //jpa only
	}
	
	public Room(Map map) {
		this.map = map;
	}
	
	public Map getMap() {
		return map;
	}
	

	
}

