package com.sinavsistemi.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="tbl_KullaniciToBrans")
public class KullaniciBrans implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ktb_id")
	private int ktb_id;
	
	@ManyToOne
	@JoinColumn(name="kullanici_id")
	private Kullanici kullanici_id;
	
	@ManyToOne
	@JoinColumn(name="brans_id")
	private Brans brans_id;
	
	public KullaniciBrans() {}

	public int getKtb_id() {
		return ktb_id;
	}

	public void setKtb_id(int ktb_id) {
		this.ktb_id = ktb_id;
	}

	public Kullanici getKullanici_id() {
		return kullanici_id;
	}

	public void setKullanici_id(Kullanici kullanici_id) {
		this.kullanici_id = kullanici_id;
	}

	public Brans getBrans_id() {
		return brans_id;
	}

	public void setBrans_id(Brans brans_id) {
		this.brans_id = brans_id;
	}
	
	
	
}
