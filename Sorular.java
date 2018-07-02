package com.sinavsistemi.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="tbl_Sorular")
public class Sorular implements Serializable {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="soru_id")
	private int soru_id;
	
	@Column(name="soru")
	private String soru;
	
	@Column(name="secenekler")
	private String secenekler;
	
	@Column(name="secenek_sayisi")
	private String secenek_sayisi;
	
	@Column(name="cevap")
	private String cevap;
	
	@Temporal(TemporalType.DATE)
	@Column(name="eklenme_tarihi")
	private Date eklenme_tarihi;
	
	@Column(name="soru_puan")
	private int soru_puan;
	
	@Column(name="is_onay")
	private boolean is_onay;
	
	@Column(name="is_aktif")
	private boolean is_aktif;
	
	@Column(name="zorluk_seviye")
	private String zorluk_seviye;
	
	@ManyToOne(fetch =FetchType.LAZY)
	@JoinColumn(name="kullanici_id")
	private Kullanici kullanici_id;
	
	
	public Sorular() {}


	public int getSoru_id() {
		return soru_id;
	}


	public void setSoru_id(int soru_id) {
		this.soru_id = soru_id;
	}


	public String getSoru() {
		return soru;
	}


	public void setSoru(String soru) {
		this.soru = soru;
	}


	public String getSecenekler() {
		return secenekler;
	}


	public void setSecenekler(String secenekler) {
		this.secenekler = secenekler;
	}


	public String getSecenek_sayisi() {
		return secenek_sayisi;
	}


	public void setSecenek_sayisi(String secenek_sayisi) {
		this.secenek_sayisi = secenek_sayisi;
	}


	public String getCevap() {
		return cevap;
	}


	public void setCevap(String cevap) {
		this.cevap = cevap;
	}


	public Date getEklenme_tarihi() {
		return eklenme_tarihi;
	}


	public void setEklenme_tarihi(Date eklenme_tarihi) {
		this.eklenme_tarihi = eklenme_tarihi;
	}


	public int getSoru_puan() {
		return soru_puan;
	}


	public void setSoru_puan(int soru_puan) {
		this.soru_puan = soru_puan;
	}


	public boolean isIs_onay() {
		return is_onay;
	}


	public void setIs_onay(boolean is_onay) {
		this.is_onay = is_onay;
	}


	public boolean isIs_aktif() {
		return is_aktif;
	}


	public void setIs_aktif(boolean is_aktif) {
		this.is_aktif = is_aktif;
	}


	public String getZorluk_seviye() {
		return zorluk_seviye;
	}


	public void setZorluk_seviye(String zorluk_seviye) {
		this.zorluk_seviye = zorluk_seviye;
	}


	public Kullanici getKullanici_id() {
		return kullanici_id;
	}


	public void setKullanici_id(Kullanici kullanici_id) {
		this.kullanici_id = kullanici_id;
	}
	
	
	

}
