package etape5;

import etape1.Couleur;

public class Main {
	
	public static void main(String[] args) {
		Concession vroum = new Concession("Vroum & cie", 10000);
		
		System.out.println("===========================================================");
		
		Voiture maTesla = new Tesla(1000000, "SWAG", Couleur.NOIR, 190, 10000, false);
		System.out.println(maTesla);
		
		System.out.println("===========================================================");
		
		Clio maClio = new Clio(9000, "MOINS SWAG", Couleur.VILOET_TELECOMNANCY, 90, Couleur.VILOET_TELECOMNANCY);
		System.out.println(maClio);
		
		System.out.println("===========================================================");
		
		BMW maBMW = new BMW(15000.0, "Oui-oui est dans la place", Couleur.JAUNE, 150, true);
		System.out.println(maBMW);
		
		System.out.println("=======================ACHATS======================");
		
		vroum.acheter(maTesla, 1000.0);
		vroum.acheter(maClio, 1000.0);
		vroum.acheter(maBMW, 1000.0);
		System.out.println(vroum);
		
		System.out.println("=======================VENTES======================");
		try {
			vroum.vendre(2,1000.0, 4000);
			vroum.vendre(1,1000.0, 40000);
			vroum.vendre(0,1000.0, 400000);
		} catch (NonConformeException e) {
			System.out.println(e.toString());
		}
		

		System.out.println(vroum);
	}

}
