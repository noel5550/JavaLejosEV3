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
	
	/**
	 * 
	 */
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
	
	/**
	 * @param etatPortes
	 */
	public void setEtatPortes(EtatPortes etatPortes){
		this.etatPortes = etatPortes;
	}
	
	/**
	 * 
	 */
	public void ouvrirPortes() {
		etatPortes.ouvrirPortes();
	}
	
	/**
	 * 
	 */
	public void fermerPortes() {
		etatPortes.fermerPortes();
	}
	
	/**
	 * 
	 */
	public void ouvrirGauche() {
		etatPortes.ouvrirgauche();
	}
	
	/**
	 * 
	 */
	public void bloquer() {
		etatPortes.bloquer();
	}

	/**
	 * @return
	 */
	public EtatPortes getEtatPortes() {
		return etatPortes;
	}

	/**
	 * @return
	 */
	public EtatPortes getPorteOuvertes() {
		return porteOuvertes;
	}

	/**
	 * @return
	 */
	public EtatPortes getPortesFermees() {
		return portesFermees;
	}

	/**
	 * @return
	 */
	public EtatPortes getPortesGaucheOuverte() {
		return portesGaucheOuverte;
	}

	/**
	 * @return
	 */
	public EtatPortes getPortesBloquees() {
		return portesBloquees;
	}

	/**
	 * @return
	 */
	public EtatPortes getPortesMouvementsOuverture() {
		return portesMouvementsOuverture;
	}

	/**
	 * @return
	 */
	public EtatPortes getPortesGaucheMouvementOuvertes() {
		return portesGaucheMouvementOuvertes;
	}

	/**
	 * @return
	 */
	public EtatPortes getPortesMouvementsFermetures() {
		return portesMouvementsFermetures;
	}
	
}
