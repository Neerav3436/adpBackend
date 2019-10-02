package com.adp.developer.mainApp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="vault")
public class Vault {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="coinA_quantity")
	private int coinA;
	
	@Column(name="coinB_quantity")
	private int coinB;
	
	@Column(name="coinC_quantity")
	private int coinC;
	
	@Column(name="coinD_quantity")
	private int coinD;
	
	public Vault() {}
	
	public Vault(int coinA, int coinB, int coinC, int coinD) {
		super();
		this.coinA = coinA;
		this.coinB = coinB;
		this.coinC = coinC;
		this.coinD = coinD;
	}

	@Override
	public String toString() {
		return "Vault [coinA=" + coinA + ", coinB=" + coinB + ", coinC=" + coinC + ", coinD=" + coinD + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCoinA() {
		return coinA;
	}

	public void setCoinA(int coinA) {
		this.coinA = coinA;
	}

	public int getCoinB() {
		return coinB;
	}

	public void setCoinB(int coinB) {
		this.coinB = coinB;
	}

	public int getCoinC() {
		return coinC;
	}

	public void setCoinC(int coinC) {
		this.coinC = coinC;
	}

	public int getCoinD() {
		return coinD;
	}

	public void setCoinD(int coinD) {
		this.coinD = coinD;
	}
	
	
}