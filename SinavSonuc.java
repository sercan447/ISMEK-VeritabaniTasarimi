package com.sinavsistemi.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="tbl_Sinav_Sonuc")
public class SinavSonuc implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="s_sonuc_id",nullable=false)
	private int s_sonuc_id;
	
	@Column(name="d_sayisi",nullable=false)
	private int d_sayisi;
	
	@Column(name="y_sayisi",nullable=false)
	private int y_sayisi;
	
	@Column(name="bos_sayisi",nullable=false)
	private int bos_sayisi;
	
	@Column(name="son_puan",nullable=false)
	private int son_puan;
	
	@OneToOne
	@JoinColumn(name="kts_id",unique=true)
	private KullaniciSinav kts_id;
	
	public SinavSonuc() {}

	public int getS_sonuc_id() {
		return s_sonuc_id;
	}

	public void setS_sonuc_id(int s_sonuc_id) {
		this.s_sonuc_id = s_sonuc_id;
	}

	public int getD_sayisi() {
		return d_sayisi;
	}

	public void setD_sayisi(int d_sayisi) {
		this.d_sayisi = d_sayisi;
	}

	public int getY_sayisi() {
		return y_sayisi;
	}

	public void setY_sayisi(int y_sayisi) {
		this.y_sayisi = y_sayisi;
	}

	public int getBos_sayisi() {
		return bos_sayisi;
	}

	public void setBos_sayisi(int bos_sayisi) {
		this.bos_sayisi = bos_sayisi;
	}

	public int getSon_puan() {
		return son_puan;
	}

	public void setSon_puan(int son_puan) {
		this.son_puan = son_puan;
	}

	public KullaniciSinav getKts_id() {
		return kts_id;
	}

	public void setKts_id(KullaniciSinav kts_id) {
		this.kts_id = kts_id;
	}
	
	
	
}
