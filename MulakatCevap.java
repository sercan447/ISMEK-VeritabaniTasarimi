package com.sinavsistemi.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="tbl_Mulakat_Cevaplari")
public class MulakatCevap implements Serializable{
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="m_cevap_id")
	private int m_cevap_id;
	
	@Column(name="cevap")
	private String cevap;
	
	@OneToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="kts_id")
	private KullaniciSinav kts_id;
	
	@OneToOne(fetch= FetchType.EAGER)
	@JoinColumn(name="mulakat_id")
	private Mulakat mulakat_id;
	
	public MulakatCevap() {}

	public int getM_cevap_id() {
		return m_cevap_id;
	}

	public void setM_cevap_id(int m_cevap_id) {
		this.m_cevap_id = m_cevap_id;
	}

	public String getCevap() {
		return cevap;
	}

	public void setCevap(String cevap) {
		this.cevap = cevap;
	}

	public KullaniciSinav getKts_id() {
		return kts_id;
	}

	public void setKts_id(KullaniciSinav kts_id) {
		this.kts_id = kts_id;
	}

	public Mulakat getMulakat_id() {
		return mulakat_id;
	}

	public void setMulakat_id(Mulakat mulakat_id) {
		this.mulakat_id = mulakat_id;
	}
	
	
}
