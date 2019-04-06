package Portes;

public class PortesMouvementOuverture implements EtatPortes {
	Portail portail;
	
	public PortesMouvementOuverture(Portail portail) {
		this.portail = portail;
	}

	@Override
	public void ouvrirPortes() {
		portail.setEtatPortes(portail.getPortesBloquees());
		
	}

	@Override
	public void fermerPortes() {
		portail.setEtatPortes(portail.getPortesBloquees());
		
	}

	@Override
	public void ouvrirgauche() {
		portail.setEtatPortes(portail.getPortesBloquees());
		
	}

	@Override
	public void bloquer() {
		portail.setEtatPortes(portail.getPortesBloquees());
		
	}

}
