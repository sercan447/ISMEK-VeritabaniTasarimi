package com.sinavsistemi.domain;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name="tbl_SinavToSorular")
public class SinavSorular implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="sts_id")
	private int sts_id;
	
	@OneToOne
	@JoinColumn(name="soru_id")
	private Sorular soru_id;
	
	@OneToOne
	@JoinColumn(name="sinav_id")
	private Sinav sinav_id;
	
	public SinavSorular() {}

	public int getSts_id() {
		return sts_id;
	}

	public void setSts_id(int sts_id) {
		this.sts_id = sts_id;
	}

	public Sorular getSoru_id() {
		return soru_id;
	}

	public void setSoru_id(Sorular soru_id) {
		this.soru_id = soru_id;
	}

	public Sinav getSinav_id() {
		return sinav_id;
	}

	public void setSinav_id(Sinav sinav_id) {
		this.sinav_id = sinav_id;
	}
	
	
	
	
}
