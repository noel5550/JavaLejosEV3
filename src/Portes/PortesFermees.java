package Portes;

public class PortesFermees implements EtatPortes {
	Portail portail;
	
	public PortesFermees(Portail portail) {
		this.portail=portail;
	}

	@Override
	public void ouvrirPortes() {
		portail.setEtatPortes(portail.getPortesMouvementsOuverture());
		
	}

	@Override
	public void fermerPortes() {
		portail.setEtatPortes(portail.getPortesFermees());
	}

	@Override
	public void ouvrirgauche() {
		portail.setEtatPortes(portail.getPortesGaucheMouvementOuvertes());
	}

	@Override
	public void bloquer() {
		portail.setEtatPortes(portail.getPortesBloquees());
	}

}
