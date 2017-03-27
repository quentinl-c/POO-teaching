package etape1;

public class Main {

	public static void main(String[] args) {
		Voiture maSuperVoiture = new Voiture(120000.0, "AMW-99", Couleur.BLEU, 150);
		Voiture twizy = new Voiture(10000.0,"TELECOM-EN-FORCE", Couleur.VILOET_TELECOMNANCY, 50);
		
		System.out.println(maSuperVoiture.toString());
		System.out.println(twizy);
		
		System.out.println("Quelques années plus tard ...");
		maSuperVoiture.user(10000, 60000);
		System.out.println(maSuperVoiture);
	}

}
