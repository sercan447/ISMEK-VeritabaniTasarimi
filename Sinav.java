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
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

import org.hibernate.annotations.CreationTimestamp;


/*
 * @author Sercan Göger
 * */

@Entity
@Table(name="tbl_Sinav")
public class Sinav implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="sinav_id",nullable=false)
	private int sinav_id;

	@Column(name="sinav_adi",nullable=false)
	@Min(value=2)
	@Max(value=50)
	private String sinav_adi;
	
	@CreationTimestamp
	@Column(name="sinav_tarihi",nullable=false)
	private Date sinav_tarihi;
	
	@Column(name="sinav_suresi",nullable=false)
	private int sinav_suresi;
	
	@Column(name="soru_sayisi",nullable=false)
	private int soru_sayisi;
	
	@Temporal(value = TemporalType.TIME)
	@Column(name="bs_saati")
	private Date bs_saati;
	
	@Column(name="sinav_salonu")
	private String sinav_salonu;
	
	@Column(name="katki_yuzdesi")
	private float katki_yuzdesi;
	
	@Temporal(value = TemporalType.DATE)
	@Column(name="olusturma_tarihi")
	private Date olusturma_tarihi;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="ogretmen_id")
	private Kullanici ogretmen_id;
	
	@Column(name="is_aktif")
	private boolean is_aktif;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="brans_id")
	private Brans brans_id;
	
	
	public Sinav() {
		
	}


	public int getSinav_id() {
		return sinav_id;
	}


	public void setSinav_id(int sinav_id) {
		this.sinav_id = sinav_id;
	}


	public String getSinav_adi() {
		return sinav_adi;
	}


	public void setSinav_adi(String sinav_adi) {
		this.sinav_adi = sinav_adi;
	}


	public Date getSinav_tarihi() {
		return sinav_tarihi;
	}


	public void setSinav_tarihi(Date sinav_tarihi) {
		this.sinav_tarihi = sinav_tarihi;
	}


	public int getSinav_suresi() {
		return sinav_suresi;
	}


	public void setSinav_suresi(int sinav_suresi) {
		this.sinav_suresi = sinav_suresi;
	}


	public int getSoru_sayisi() {
		return soru_sayisi;
	}


	public void setSoru_sayisi(int soru_sayisi) {
		this.soru_sayisi = soru_sayisi;
	}


	public Date getBs_saati() {
		return bs_saati;
	}


	public void setBs_saati(Date bs_saati) {
		this.bs_saati = bs_saati;
	}


	public String getSinav_salonu() {
		return sinav_salonu;
	}


	public void setSinav_salonu(String sinav_salonu) {
		this.sinav_salonu = sinav_salonu;
	}


	public float getKatki_yuzdesi() {
		return katki_yuzdesi;
	}


	public void setKatki_yuzdesi(float katki_yuzdesi) {
		this.katki_yuzdesi = katki_yuzdesi;
	}


	public Date getOlusturma_tarihi() {
		return olusturma_tarihi;
	}


	public void setOlusturma_tarihi(Date olusturma_tarihi) {
		this.olusturma_tarihi = olusturma_tarihi;
	}


	public Kullanici getOgretmen_id() {
		return ogretmen_id;
	}


	public void setOgretmen_id(Kullanici ogretmen_id) {
		this.ogretmen_id = ogretmen_id;
	}


	public boolean isIs_aktif() {
		return is_aktif;
	}


	public void setIs_aktif(boolean is_aktif) {
		this.is_aktif = is_aktif;
	}


	public Brans getBrans_id() {
		return brans_id;
	}


	public void setBrans_id(Brans brans_id) {
		this.brans_id = brans_id;
	}
	
	
	
	
}
