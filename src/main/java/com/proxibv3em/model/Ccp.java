package com.proxibv3em.model;

import javax.persistence.Embeddable;

/**
 * 
 * La classe Ccp correspond au compte courant qui se distingue par
 * une autorisation de découvert de 1000 euros(=MINACCOUNTBALANCE).
 * 
 * @author Baggi/Bendou
 *
 */
@Embeddable
public class Ccp {
	private Long numeroCompteCourant;
	private double soldeBancaireCourant;
	
	public Ccp() {
		super();
	}
	public Long getNumeroCompteCourant() {
		return numeroCompteCourant;
	}
	public void setNumeroCompteCourant(Long numeroCompteCourant) {
		this.numeroCompteCourant = numeroCompteCourant;
	}
	public double getSoldeBancaireCourant() {
		return soldeBancaireCourant;
	}
	public void setSoldeBancaireCourant(double soldeBancaireCourant) {
		this.soldeBancaireCourant = soldeBancaireCourant;
	}
	
}
