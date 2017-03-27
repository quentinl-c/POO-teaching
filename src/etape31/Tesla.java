package etape31;

import etape1.Couleur;

public class Tesla {
	
	private double prix;
	private String immat;
	private Couleur couleur;
	private int puissance;
	private int kilometrage;
	private boolean optionAutopilote;
	
	
	
	public Tesla(double prix, String immat, Couleur couleur, int puissance, boolean optionAutopilote) {
		this.prix = prix;
		this.immat = immat;
		this.couleur = couleur;
		this.puissance = puissance;
		this.optionAutopilote = optionAutopilote;
		this.kilometrage = 0;
	}

	
	public Tesla(double prix, String immat, Couleur couleur, int puissance, int kilometrage, boolean optionAutopilote) {
		this.prix = prix;
		this.immat = immat;
		this.couleur = couleur;
		this.puissance = puissance;
		this.kilometrage = kilometrage;
		this.optionAutopilote = optionAutopilote;
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
	
	public void ajouterAutopilote() {
		if(!this.optionAutopilote) {
			this.prix += 10000;
			this.optionAutopilote = true;
		}
	}

	@Override
	public String toString() {
		return "Tesla [prix=" + prix + ", immat=" + immat + ", couleur=" + couleur + ", puissance=" + puissance
				+ ", kilometrage=" + kilometrage + ", optionAutopilote=" + optionAutopilote + "]";
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


	public boolean isOptionAutopilote() {
		return optionAutopilote;
	}

}
