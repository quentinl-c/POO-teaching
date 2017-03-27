package etape32;

import etape1.Couleur;

public class BMW extends Voiture {
	
	private boolean optionPharesLED;
	
	public BMW(double prix, String immat, Couleur couleur, int puissance, boolean optionPharesLED) {
		super(prix, immat, couleur, puissance);
		this.optionPharesLED = optionPharesLED;
	}
	
	public BMW(double prix, String immat, Couleur couleur, int puissance, int kilometrage, boolean optionPharesLED) {
		super(prix, immat, couleur, puissance, kilometrage);
		this.optionPharesLED = optionPharesLED;
	}

	
	public void ajouterPharesLED() {
		if(!this.optionPharesLED) {
			this.prix += 100.0;
			this.optionPharesLED = true;
		}
	}

	@Override
	public String toString() {
		return "BMW [" + super.toString() + ", optionPharesLED=" + optionPharesLED + "]";
	}

	public boolean isOptionPharesLED() {
		return optionPharesLED;
	}
	

}
