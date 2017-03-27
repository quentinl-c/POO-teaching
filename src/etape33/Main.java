package etape33;

import etape1.Couleur;

public class Main {

	public static void main(String[] args) {
		Tesla maTesla = new Tesla(1000000, "SWAG", Couleur.NOIR, 190, 10000, false);
		System.out.println(maTesla);
		
		System.out.println("===========================================================");
		
		Clio maClio = new Clio(9000, "MOINS SWAG", Couleur.VILOET_TELECOMNANCY, 90, Couleur.VILOET_TELECOMNANCY);
		System.out.println(maClio);
		
		System.out.println("===========================================================");
		
		BMW maBMW = new BMW(15000.0, "Oui-oui est dans la place", Couleur.JAUNE, 150, true);
		System.out.println(maBMW);
		
		System.out.println("========================Test de conformité pour la Tesla==========================");
		System.out.println(maTesla.estConforme(10));
		
		System.out.println("========================Test de conformité pour la Clio==========================");
		System.out.println(maClio.estConforme(35));
		
		System.out.println("========================Test de conformité pour la BMW==========================");
		System.out.println(maBMW.estConforme(10));
	}

}
