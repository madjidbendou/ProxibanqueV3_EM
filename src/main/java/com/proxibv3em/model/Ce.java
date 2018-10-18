package com.proxibv3em.model;

import javax.persistence.Embeddable;

/**
 * La classe Ce correspond au compte épargne. Il se caractérise par
 * un taux de rémunération par défaut à 3%.
 * 
 * @author Baggi/Bendou
 *
 */
@Embeddable
public class Ce {
	private Long numeroCompteEpargne;
	private double soldeBancaireEpagne;
	
	public Ce() {
		super();
	}
	public Long getNumeroCompteEpargne() {
		return numeroCompteEpargne;
	}
	public void setNumeroCompteEpargne(Long numeroCompteEpargne) {
		this.numeroCompteEpargne = numeroCompteEpargne;
	}
	public double getSoldeBancaireEpagne() {
		return soldeBancaireEpagne;
	}
	public void setSoldeBancaireEpagne(double soldeBancaireEpagne) {
		this.soldeBancaireEpagne = soldeBancaireEpagne;
	}
	
}
