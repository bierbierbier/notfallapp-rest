package de.allianz.notfallapp.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name="wifi")
public class Wifi implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1525225816917225469L;

	@EmbeddedId
	private WifiPk key = new WifiPk();
	
	@ManyToOne
	@MapsId("pos_id")
	@JoinColumn(name="pos_id")
	@JsonBackReference
	private Position position;
	
	@Column(name="lvl")
	private int lvl;

	
	Wifi() { //jpa only
	}
	
	public Wifi(int lvl, Position position, WifiPk key) {
		this.lvl = lvl;
		this.position=position;
		this.key = key;
	}
	
//	public WifiPk getWifi_key() {
//		return key;
//	}

//	public Position getPosition() {
//		return position;
//	}
	public int getPos_id() {
		return this.key.getpos_id();
	}
	
	public String getMac_adress() {
		return this.key.getmac_adress();
	}

//	public int getPos_id() {
//		return pos_id;
//	}
	
//	public WifiPk getkey() {
//		return key;
//	}
	
	public int getLvl() {
		return lvl;
	}
	
//	public String getMac_adress() {
//		return this.key.mac_adress;
//	}
//	
//	public void setpos_id(int pos_id) {
//		this.pos_id=pos_id;
//	}
//	public String getmac_adress() {
//		return mac_adress;
//	}
////	
//	public int getpos_id() {
//		return position.getPos_id();
//	}
}
