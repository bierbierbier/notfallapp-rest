package de.allianz.notfallapp.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class WifiPk implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Column(name = "pos_id")
	private long posId;
	@Column(name="mac_adress")
	private String macAdress;

}
