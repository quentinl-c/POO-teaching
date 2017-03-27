package etape32;

import etape1.Couleur;

public class Tesla extends Voiture{

	private boolean optionAutopilote;
	
	
	public Tesla(double prix, String immat, Couleur couleur, int puissance, boolean optionAutopilote) {
		super(prix, immat, couleur, puissance);
		this.optionAutopilote = optionAutopilote;
	}

	
	public Tesla(double prix, String immat, Couleur couleur, int puissance, int kilometrage, boolean optionAutopilote) {
		super(prix, immat, couleur, puissance, kilometrage);
		this.optionAutopilote = optionAutopilote;
	}

	public void ajouterAutopilote() {
		if(!this.optionAutopilote) {
			this.prix += 10000;
			this.optionAutopilote = true;
		}
	}

	@Override
	public String toString() {
		return "Tesla [" + super.toString() +", optionAutopilote=" + optionAutopilote + "]";
	}


	public boolean isOptionAutopilote() {
		return optionAutopilote;
	}

}
