package etape2;

import etape1.Couleur;

public interface Voiture {
	
	public void changerPrix(double prix);
	
	public void repeindre(Couleur couleur);
	
	public void changerMoteur(int puissance);
	
	public void tricher(int kilometrage);
	
	public void user(int kilometrage, int prix);
	
}
