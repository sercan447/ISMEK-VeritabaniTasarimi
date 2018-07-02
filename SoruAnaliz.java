package com.sinavsistemi.domain;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name="tbl_SoruAnaliz")
public class SoruAnaliz implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="analiz_id")
	private int analiz_id;
	
	@Column(name="dogru_sayisi")
	private int dogru_sayisi;
	
	@Column(name="yanlis_sayisi")
	private int yanlis_sayisi;
	
	@Column(name="bos_sayisi")
	private int bos_sayisi;
	
	@OneToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="soru_id")
	private Sorular soru_id;
	
	public SoruAnaliz() {
		
	}

	public int getAnaliz_id() {
		return analiz_id;
	}

	public void setAnaliz_id(int analiz_id) {
		this.analiz_id = analiz_id;
	}

	public int getDogru_sayisi() {
		return dogru_sayisi;
	}

	public void setDogru_sayisi(int dogru_sayisi) {
		this.dogru_sayisi = dogru_sayisi;
	}

	public int getYanlis_sayisi() {
		return yanlis_sayisi;
	}

	public void setYanlis_sayisi(int yanlis_sayisi) {
		this.yanlis_sayisi = yanlis_sayisi;
	}

	public int getBos_sayisi() {
		return bos_sayisi;
	}

	public void setBos_sayisi(int bos_sayisi) {
		this.bos_sayisi = bos_sayisi;
	}

	public Sorular getSoru_id() {
		return soru_id;
	}

	public void setSoru_id(Sorular soru_id) {
		this.soru_id = soru_id;
	}
	
	
	
	
	
	
}
