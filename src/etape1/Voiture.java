package etape1;

public class Voiture {
	private double prix;
	private String immat;
	private Couleur couleur;
	private int puissance;
	private int kilometrage;
	
	public Voiture(double prix, String immat, Couleur couleur, int puissance) {
		this.prix = prix;
		this.immat = immat;
		this.couleur = couleur;
		this.puissance = puissance;
		this.kilometrage = 0;
	}

	public Voiture(double prix, String immat, Couleur couleur, int puissance, int kilometrage) {
		this.prix = prix;
		this.immat = immat;
		this.couleur = couleur;
		this.puissance = puissance;
		this.kilometrage = kilometrage;
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
	

	@Override
	public String toString() {
		return "Voiture [prix=" + prix + ", immat=" + immat + ", couleur=" + couleur + ", puissance=" + puissance
				+ ", kilometrage=" + kilometrage + "]";
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
	
}
