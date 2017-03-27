package etape4;

import java.util.Arrays;


public class ConcessionV1 {
	private String enseigne;
	private Voiture[] parcAuto;
	private int inventaire;
	private int capacite;
	private double soldeCompte;
	
	public ConcessionV1(String enseigne, int capacite, double soldeCompte) {
		this.capacite = capacite;
		this.parcAuto = new Voiture[this.capacite];
		this.enseigne = enseigne;
		this.inventaire = 0;
		this.soldeCompte = soldeCompte;
	}
	
	public void acheter(Voiture v, double prix) {
		if(this.inventaire < this.capacite) {
			this.parcAuto[inventaire] = v;
			this.inventaire ++;
			this.soldeCompte -= prix;
		}
	}
	
	public Voiture vendre(int numeroVoiture, double prix) {
		if(numeroVoiture < this.inventaire && this.parcAuto[numeroVoiture] != null) {
			this.inventaire --;
			this.soldeCompte += prix;
			Voiture vendue = this.parcAuto[numeroVoiture];
			this.parcAuto[numeroVoiture] = null;
			return vendue;
		}
		return null;
	}

	@Override
	public String toString() {
		return "ConcessionV1 [enseigne=" + enseigne + ", parcAuto=" + Arrays.toString(parcAuto) + ", inventaire="
				+ inventaire + ", soldeCompte=" + soldeCompte + "]";
	}
	
	
	
}
