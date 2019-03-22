package Portes;

public class Portail {
	private EtatPortes etatPortes;
	private PortesOuvertes portesOuvertes;
	private PortesMouvementsFermeture portesMouvementsFermeture;
	private PortesFermees portesFermees;
	private PorteGaucheOuverte porteGaucheOuverte;
	private PortesBloquees portesBloquees;
	
	
	public Portail() {
		// TODO Auto-generated constructor stub
	}
	
	public void setEtatPortes(EtatPortes etatPortes) {
		this.etatPortes = etatPortes;
	}
	
	public void ouvrirPortes() {}
	public void fermerPortes() {}
	public void ouvrirGauche() {}
	public void bloquer() {}
	
	

}
