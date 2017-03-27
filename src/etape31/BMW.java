package etape31;

import etape1.Couleur;

public class BMW {
	
	private double prix;
	private String immat;
	private Couleur couleur;
	private int puissance;
	private int kilometrage;
	private boolean optionPharesLED;
	
	public BMW(double prix, String immat, Couleur couleur, int puissance, boolean optionPharesLED) {
		this.prix = prix;
		this.immat = immat;
		this.couleur = couleur;
		this.puissance = puissance;
		this.optionPharesLED = optionPharesLED;
		this.kilometrage = 0;
	}
	
	public BMW(double prix, String immat, Couleur couleur, int puissance, int kilometrage, boolean optionPharesLED) {
		this.prix = prix;
		this.immat = immat;
		this.couleur = couleur;
		this.puissance = puissance;
		this.kilometrage = kilometrage;
		this.optionPharesLED = optionPharesLED;
	}

	public void changerPrix(double prix) {
		this.prix = prix;
	}

	public void repeindre(Couleur couleur) {
		this.couleur = couleur;
	}

	public void changerMoteur(int puissance) {
		this.puissance = puissance;
	}

	public void tricher(int kilometrage) {
		this.kilometrage -= kilometrage;
	}
	
	public void user(int kilometrage, int prix) {
		this.kilometrage += kilometrage;
		this.prix -= prix;
		
	}
	
	public void ajouterPharesLED() {
		if(!this.optionPharesLED) {
			this.prix += 100.0;
			this.optionPharesLED = true;
		}
	}

	@Override
	public String toString() {
		return "BMW [prix=" + prix + ", immat=" + immat + ", couleur=" + couleur + ", puissance=" + puissance
				+ ", kilometrage=" + kilometrage + ", optionPharesLED=" + optionPharesLED + "]";
	}

	public double getPrix() {
		return prix;
	}

	public String getImmat() {
		return immat;
	}

	public Couleur getCouleur() {
		return couleur;
	}

	public int getPuissance() {
		return puissance;
	}

	public int getKilometrage() {
		return kilometrage;
	}

	public boolean isOptionPharesLED() {
		return optionPharesLED;
	}
	
	

}
