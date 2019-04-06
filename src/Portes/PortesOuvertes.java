package Portes;

public class PortesOuvertes implements EtatPortes{

	Portail portail;
	
	public PortesOuvertes(Portail newPortail) {
		portail = newPortail;
	}
	

	@Override
	public void ouvrirPortes() {
		portail.setEtatPortes(portail.getPortesMouvementsFermetures());
		
	}

	@Override
	public void fermerPortes() {
		portail.setEtatPortes(portail.getPortesMouvementsFermetures());
	}

	@Override
	public void ouvrirgauche() {
		portail.setEtatPortes(portail.getPortesMouvementsFermetures());
	}

	@Override
	public void bloquer() {
		portail.setEtatPortes(portail.getPortesBloquees());
		
	}

}
