package com.sinavsistemi.domain;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name="tbl_BransToSorular")
public class BransSorular implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="bts_id")
	private int bts_id;
	
	@OneToOne
	@JoinColumn(name="soru_id")
	private Sorular soru_id;
	
	@ManyToOne
	@JoinColumn(name="brans_id")
	private Brans brans_id;
	
	
	public BransSorular() {}


	public int getBts_id() {
		return bts_id;
	}


	public void setBts_id(int bts_id) {
		this.bts_id = bts_id;
	}


	public Sorular getSoru_id() {
		return soru_id;
	}


	public void setSoru_id(Sorular soru_id) {
		this.soru_id = soru_id;
	}


	public Brans getBrans_id() {
		return brans_id;
	}


	public void setBrans_id(Brans brans_id) {
		this.brans_id = brans_id;
	}
	
	
	
	
}
