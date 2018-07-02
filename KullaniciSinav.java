package com.sinavsistemi.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.Max;

@Entity
@Table(name="tbl_KullaniciToSinav")
public class KullaniciSinav implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "kts_id")
	private int kts_id;
	
	@Column(name="ogr_cevap")
	@Max(value=100)
	private String ogr_cevap;
	
	@Column(name="is_onay")
	private boolean is_onay;
	
	@Column(name="is_durum")
	private boolean is_durum;
	
	@Column(name="m_puan")
	private int m_puan;
	
	@Column(name="sinav_puan")
	private int sinav_puan;
	
	@Column(name="ip_adresi")
	@Max(value=20)
	private String ip_adresi;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="kullanici_id")
	private Kullanici kullanici_id;
	
	@OneToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="sinav_id")
	private Sinav sinav_id;
	
	public KullaniciSinav() {}

	public int getKts_id() {
		return kts_id;
	}

	public void setKts_id(int kts_id) {
		this.kts_id = kts_id;
	}

	public String getOgr_cevap() {
		return ogr_cevap;
	}

	public void setOgr_cevap(String ogr_cevap) {
		this.ogr_cevap = ogr_cevap;
	}

	public boolean isIs_onay() {
		return is_onay;
	}

	public void setIs_onay(boolean is_onay) {
		this.is_onay = is_onay;
	}

	public boolean isIs_durum() {
		return is_durum;
	}

	public void setIs_durum(boolean is_durum) {
		this.is_durum = is_durum;
	}

	public int getM_puan() {
		return m_puan;
	}

	public void setM_puan(int m_puan) {
		this.m_puan = m_puan;
	}

	public int getSinav_puan() {
		return sinav_puan;
	}

	public void setSinav_puan(int sinav_puan) {
		this.sinav_puan = sinav_puan;
	}

	public String getIp_adresi() {
		return ip_adresi;
	}

	public void setIp_adresi(String ip_adresi) {
		this.ip_adresi = ip_adresi;
	}

	public Kullanici getKullanici_id() {
		return kullanici_id;
	}

	public void setKullanici_id(Kullanici kullanici_id) {
		this.kullanici_id = kullanici_id;
	}

	public Sinav getSinav_id() {
		return sinav_id;
	}

	public void setSinav_id(Sinav sinav_id) {
		this.sinav_id = sinav_id;
	}
	
	
	
	
}
