package etape4;

import java.util.ArrayList;
import java.util.List;

public class Concession {
	private String enseigne;
	private List<Voiture> parcAuto;
	private double soldeCompte;
	
	public Concession(String enseigne, double soldeCompte) {

		this.parcAuto = new ArrayList<>();
		this.enseigne = enseigne;
		this.soldeCompte = soldeCompte;
	}
	
	public void acheter(Voiture v, double prix) {
		this.parcAuto.add(v);
		this.soldeCompte -= prix;
	}
	
	public Voiture vendre(int numeroVoiture, double prix) {
		if(numeroVoiture < this.parcAuto.size()) {
			this.soldeCompte += prix;
			return this.parcAuto.remove(numeroVoiture);
		}
		return null;
	}

	@Override
	public String toString() {
		StringBuffer buffer = new StringBuffer();
		for(Voiture v : this.parcAuto) {
			buffer.append(v.toString());
			buffer.append(" ");
		}
		return "Concession [enseigne=" + enseigne + ", parcAuto=" + "[" + buffer + "], soldeCompte=" + soldeCompte + "]";
	}
	
	
	
}
