package etape31;

import etape1.Couleur;

public class Main {
	
	public static void main(String[] args) {
		Tesla maTesla = new Tesla(1000000, "SWAG", Couleur.NOIR, 190, 10000, false);
		System.out.println(maTesla);

		maTesla.ajouterAutopilote();
		System.out.println(maTesla);
		
		System.out.println("===========================================================");
		
		Clio maClio = new Clio(9000, "MOINS SWAG", Couleur.VILOET_TELECOMNANCY, 90, Couleur.VILOET_TELECOMNANCY);
		System.out.println(maClio);
		
		System.out.println("===========================================================");
		
		BMW maBMW = new BMW(15000.0, "Oui-oui est dans la place", Couleur.JAUNE, 150, true);
		System.out.println(maBMW);
	}

}
