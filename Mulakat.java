package com.sinavsistemi.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tbl_Mulakat")
public class Mulakat implements Serializable {

	
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Id
	@Column(name="mukat_id")
	private int mukat_id;
	
	@Column(name="m_sorulari")
	private String m_sorulari;
	
	public Mulakat() {}

	public int getMukat_id() {
		return mukat_id;
	}

	public void setMukat_id(int mukat_id) {
		this.mukat_id = mukat_id;
	}

	public String getM_sorulari() {
		return m_sorulari;
	}

	public void setM_sorulari(String m_sorulari) {
		this.m_sorulari = m_sorulari;
	}
	
	
	
	
}
