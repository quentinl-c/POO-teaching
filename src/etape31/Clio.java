package etape31;

import etape1.Couleur;

public class Clio {
	
	private double prix;
	private String immat;
	private Couleur couleur;
	private int puissance;
	private int kilometrage;
	private Couleur couleurSieges;
	
	public Clio(double prix, String immat, Couleur couleur, int puissance, Couleur couleurSieges) {
		this.prix = prix;
		this.immat = immat;
		this.couleur = couleur;
		this.puissance = puissance;
		this.couleurSieges = couleurSieges;
		this.kilometrage = 0;
	}

	public Clio(double prix, String immat, Couleur couleur, int puissance, int kilometrage, Couleur couleurSieges) {
		this.prix = prix;
		this.immat = immat;
		this.couleur = couleur;
		this.puissance = puissance;
		this.kilometrage = kilometrage;
		this.couleurSieges = couleurSieges;
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

	public void changerCouleurSieges(Couleur c) {
		this.couleurSieges = c;
	}

	@Override
	public String toString() {
		return "Clio [prix=" + prix + ", immat=" + immat + ", couleur=" + couleur + ", puissance=" + puissance
				+ ", kilometrage=" + kilometrage + ", couleurSieges=" + couleurSieges + "]";
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

	public Couleur getCouleurSieges() {
		return couleurSieges;
	}
	
}
