package etape32;

import etape1.Couleur;

public class Clio extends Voiture {

	private Couleur couleurSieges;
	
	public Clio(double prix, String immat, Couleur couleur, int puissance, Couleur couleurSieges) {
		super(prix, immat, couleurSieges, puissance);
		this.couleurSieges = couleurSieges;
	}

	public Clio(double prix, String immat, Couleur couleur, int puissance, int kilometrage, Couleur couleurSieges) {
		super(prix, immat, couleurSieges, puissance, kilometrage);
		this.couleurSieges = couleurSieges;
	}


	public void changerCouleurSieges(Couleur c) {
		this.couleurSieges = c;
	}

	@Override
	public String toString() {
		return "Clio [" + super.toString() + ", couleurSieges=" + couleurSieges + "]";
	}

	public Couleur getCouleurSieges() {
		return couleurSieges;
	}
	
}
