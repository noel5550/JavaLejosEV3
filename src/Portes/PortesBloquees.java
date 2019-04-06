package Portes;

public class PortesBloquees implements EtatPortes {
	private Portail portail;
	
	public PortesBloquees(Portail portail) {
		this.portail = portail;
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
