package de.allianz.notfallapp.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class RoomPk implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="room_name")
	private String roomName;
	
	@Column(name="map_id")
	private int mapId;

	public String getRoomName() {
		return roomName;
	}

	public int getMapId() {
		return mapId;
	}
	
	
}
