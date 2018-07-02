package com.sinavsistemi.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Max;

@Entity
@Table(name="tbl_Brans")
public class Brans implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="brans_id")
	private int brans_id;
	
	@Column(name="brans_adi")
	@Max(value=60)
	private String brans_adi;
	
	@Column(name="kontenjan")
	private int kontenjan;
	
	public Brans() {}

	public int getBrans_id() {
		return brans_id;
	}

	public void setBrans_id(int brans_id) {
		this.brans_id = brans_id;
	}

	public String getBrans_adi() {
		return brans_adi;
	}

	public void setBrans_adi(String brans_adi) {
		this.brans_adi = brans_adi;
	}

	public int getKontenjan() {
		return kontenjan;
	}

	public void setKontenjan(int kontenjan) {
		this.kontenjan = kontenjan;
	}
	
	
	
}
