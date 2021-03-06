package Controlleur;

import Portes.Portail;

public class Controlleur {

	private Portail portes;
//	private CapteurPresence capteur1;
//	private CapteurPresence capteur2;
//	private CapteurPresence capteur3;
	private Lumiere lumiere;
	
	
	/**
	 * @param portail
	 * @param lumiere
	 * @param capteur1
	 * @param capteur2
	 * @param capteur3
	 */
	public Controlleur(Portail portail, Lumiere lumiere, CapteurPresence capteur1, CapteurPresence capteur2, CapteurPresence capteur3) {
		this.portes = portail;
		capteur1.setControlleur(this);
		capteur2.setControlleur(this);
		capteur3.setControlleur(this);
		this.lumiere = lumiere;
	}
	
	/**
	 * 
	 */
	public void toggleLumiere() {
		if (lumiere.getEtatLumiere()) {
			lumiere.eteindre();
		}else {
			lumiere.allumer();
		}
	}
	
//	public void toggleCapteur() {
//		capteur 
//	}
	
	/**
	 * 
	 */
	public void ouvertureT() {
		portes.ouvrirPortes();
		System.out.println("Ouverture de la porte");
	}
	
	/**
	 * 
	 */
	public void ouvertureP() {
		portes.ouvrirGauche();
		System.out.println("Ouverture partielle de la porte");
	}
	
	/**
	 * 
	 */
	public void fermeture() {
		portes.fermerPortes();
		System.out.println("Fermeture de la porte");
	}
	
	/**
	 * 
	 */
	public void bloquer() {
		portes.bloquer();
		System.out.println("Oops, portes bloquees");
	}
	
}
