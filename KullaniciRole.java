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
@Table(name="tbl_KullaniciToRole")
public class KullaniciRole implements Serializable{

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ktr_id")
	private int ktr_id;
	
	@ManyToOne
	@JoinColumn(name="kullanici_id")
	private Kullanici kullanici_id;
	
	@ManyToOne
	@JoinColumn(name="role_id")
	private Role role_id;
	
	public KullaniciRole() {}

	public int getKtr_id() {
		return ktr_id;
	}

	public void setKtr_id(int ktr_id) {
		this.ktr_id = ktr_id;
	}

	public Kullanici getKullanici_id() {
		return kullanici_id;
	}

	public void setKullanici_id(Kullanici kullanici_id) {
		this.kullanici_id = kullanici_id;
	}

	public Role getRole_id() {
		return role_id;
	}

	public void setRole_id(Role role_id) {
		this.role_id = role_id;
	}
	
	
	
}
