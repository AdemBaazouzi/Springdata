package com.formation.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "compteE")
@Table(name = "compteT")
public class Compte {
	public Compte(String numero, String owner, float solde) {
		super();
		this.numero = numero;
		this.owner = owner;
		this.solde = solde;
	}

	@Id
	private String numero;
	private String owner;
	private float solde;

	public Compte() {

	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getProprietaire() {
		return owner;
	}

	public void setProprietaire(String proprietaire) {
		this.owner = proprietaire;
	}

	public float getSolde() {
		return solde;
	}

	public void setSolde(float solde) {
		this.solde = solde;
	}

}
