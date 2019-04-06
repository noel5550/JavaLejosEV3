package Controlleur;

public class CapteurPresence {

	private Controlleur controlleur;
	
	public CapteurPresence() {
		controlleur = null;
	}
	
	public void alerteCollision() {
		this.controlleur.bloquer();
	}

	public void setControlleur(Controlleur controlleur) {
		this.controlleur = controlleur;
		
	}

}
