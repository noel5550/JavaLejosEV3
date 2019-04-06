package Portes;

public class PorteGaucheOuverte implements EtatPortes{
	Portail portail;
	
	public PorteGaucheOuverte(Portail portail) {
		this.portail = portail;
	}

	@Override
	public void ouvrirPortes() {
		portail.setEtatPortes(portail.getPortesMouvementsOuverture());
		
	}

	@Override
	public void fermerPortes() {
		portail.setEtatPortes(portail.getPortesMouvementsFermetures());
		
	}

	@Override
	public void ouvrirgauche() {
		portail.setEtatPortes(portail.getPortesMouvementsOuverture());
		
	}

	@Override
	public void bloquer() {
		portail.setEtatPortes(portail.getPortesBloquees());
		
	}

}
