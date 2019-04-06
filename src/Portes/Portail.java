package Portes;

public class Portail {
 
	private EtatPortes etatPortes;
	private EtatPortes porteOuvertes;
	private EtatPortes portesFermees;
	private EtatPortes portesGaucheOuverte;
	private EtatPortes portesBloquees;
	private EtatPortes portesMouvementsOuverture;
	private EtatPortes portesGaucheMouvementOuvertes;
	private EtatPortes portesMouvementsFermetures;
	
	public Portail() {
		porteOuvertes = new PortesOuvertes(this);                
		portesFermees = new PortesFermees(this);                
		portesGaucheOuverte = new PorteGaucheOuverte(this);          
		portesBloquees = new PortesBloquees(this);               
		portesMouvementsOuverture = new PortesMouvementOuverture(this);    
		portesGaucheMouvementOuvertes = new PorteGaucheMouvementOuverture(this);
		portesMouvementsFermetures = new PortesMouvementsFermeture(this);  
	
		etatPortes = portesFermees;
	}
	
	public void setEtatPortes(EtatPortes etatPortes){
		this.etatPortes = etatPortes;
	}
	
	public void ouvrirPortes() {
		etatPortes.ouvrirPortes();
	}
	
	public void fermerPortes() {
		etatPortes.fermerPortes();
	}
	
	public void ouvrirGauche() {
		etatPortes.ouvrirgauche();
	}
	
	public void bloquer() {
		etatPortes.bloquer();
	}

	public EtatPortes getEtatPortes() {
		return etatPortes;
	}

	public EtatPortes getPorteOuvertes() {
		return porteOuvertes;
	}

	public EtatPortes getPortesFermees() {
		return portesFermees;
	}

	public EtatPortes getPortesGaucheOuverte() {
		return portesGaucheOuverte;
	}

	public EtatPortes getPortesBloquees() {
		return portesBloquees;
	}

	public EtatPortes getPortesMouvementsOuverture() {
		return portesMouvementsOuverture;
	}

	public EtatPortes getPortesGaucheMouvementOuvertes() {
		return portesGaucheMouvementOuvertes;
	}

	public EtatPortes getPortesMouvementsFermetures() {
		return portesMouvementsFermetures;
	}
	
	
}
