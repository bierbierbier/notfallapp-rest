package de.allianz.notfallapp.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Embeddable
public class WifiPk implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3692732563240002936L;
	@Column(name = "pos_id")
	private int pos_id;
	
	@Column(name = "mac_adress")
	private String mac_adress;
	
	
	public WifiPk(int pos_id, String mac_adress) {
		this.pos_id = pos_id;
		this.mac_adress = mac_adress;
	}
	
	WifiPk() {
	}

	public String getmac_adress() {
		return mac_adress;
	}

	public int getpos_id() {
		return pos_id;
	}

	public void setpos_id(int pos_id) {
		this.pos_id = pos_id;
	}

	public void setmac_adress(String mac_adress) {
		this.mac_adress = mac_adress;
	}
}
