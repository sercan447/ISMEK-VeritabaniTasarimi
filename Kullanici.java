package com.sinavsistemi.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Max;

import org.hibernate.annotations.CreationTimestamp;

@Entity
@Table(name="tbl_Kullanici")
public class Kullanici implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="kullanici_id")
	private int kullanici_id;
	
	@Column(name="tc_no",nullable=false,unique=true)
	@Max(value=11)
	private String tc_no;
	
	@Column(name="ad",nullable=false)
	@Max(value=20)
	private String ad;
	
	@Column(name="soyadi",nullable=false)
	@Max(value=25)
	private String soyadi;
	
	@Column(name="telefon")
	@Max(value=15)
	private String telefon;
	
	@Column(name="mail")
	@Max(value=50)
	private String mail;
	
	@CreationTimestamp
	private Date dogum_tarihi;
	
	@Column(name="cinsiyet")
	private String cinsiyet; 
	
	public Kullanici() {}

	public int getKullanici_id() {
		return kullanici_id;
	}

	public void setKullanici_id(int kullanici_id) {
		this.kullanici_id = kullanici_id;
	}

	public String getTc_no() {
		return tc_no;
	}

	public void setTc_no(String tc_no) {
		this.tc_no = tc_no;
	}

	public String getAd() {
		return ad;
	}

	public void setAd(String ad) {
		this.ad = ad;
	}

	public String getSoyadi() {
		return soyadi;
	}

	public void setSoyadi(String soyadi) {
		this.soyadi = soyadi;
	}

	public String getTelefon() {
		return telefon;
	}

	public void setTelefon(String telefon) {
		this.telefon = telefon;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public Date getDogum_tarihi() {
		return dogum_tarihi;
	}

	public void setDogum_tarihi(Date dogum_tarihi) {
		this.dogum_tarihi = dogum_tarihi;
	}

	public String getCinsiyet() {
		return cinsiyet;
	}

	public void setCinsiyet(String cinsiyet) {
		this.cinsiyet = cinsiyet;
	}
	
	
	
	
	
}
