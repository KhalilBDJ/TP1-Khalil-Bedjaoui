
public class Main {

	public static void main(String[] args) {
		
		Drunk drunk = new Drunk();
		Healer healer = new Healer();
		Bagarreur bagarreur = new Bagarreur();
		Attacker attaquant = new Attacker();
		Attend attend = new Attend();
		
		equipe equipe1 = new equipe("Bleu");
		equipe equipe2 = new equipe("Rouge");
		
		Guerrier guerrier1 = new Guerrier(1500, 100, 0.9, drunk);
		Guerrier guerrier2 = new Guerrier(1500, 100, 0.95, attend);
		Guerrier guerrier3 = new Guerrier(1500, 100, 0.8, healer);
		Guerrier guerrier4 = new Guerrier(1500, 100, 0.9, drunk);
		Guerrier guerrier5 = new Guerrier(1500, 100, 0.85, bagarreur);
		Guerrier guerrier6 = new Guerrier(1500, 100, 0.9, drunk);
		Guerrier guerrier7 = new Guerrier(1500, 100, 1, attaquant);
		Guerrier guerrier8 = new Guerrier(1500, 100, 0.9, drunk);
		Guerrier guerrier9 = new Guerrier(1500, 100, 0.95, attend);
		Guerrier guerrier10 = new Guerrier(1500, 100, 0.8, healer);
		Guerrier guerrier11 = new Guerrier(1500, 100, 0.9, drunk);
		Guerrier guerrier12 = new Guerrier(1500, 100, 0.85, bagarreur);
		Guerrier guerrier13 = new Guerrier(1500, 100, 0.9, drunk);
		Guerrier guerrier14 = new Guerrier(1500, 100, 1, attaquant);
		Guerrier guerrier15 = new Guerrier(1500, 100, 0.9, drunk);
		Guerrier guerrier16 = new Guerrier(1500, 100, 0.95, attend);
		Guerrier guerrier17 = new Guerrier(1500, 100, 0.8, healer);
		Guerrier guerrier18 = new Guerrier(1500, 100, 0.9, drunk);
		Guerrier guerrier19 = new Guerrier(1500, 100, 0.85, bagarreur);
		Guerrier guerrier20 = new Guerrier(1500, 100, 0.9, drunk);
		
		equipe1.ajouterGuerrier(guerrier1);
		equipe1.ajouterGuerrier(guerrier2);
		equipe1.ajouterGuerrier(guerrier3);
		equipe1.ajouterGuerrier(guerrier4);
		equipe1.ajouterGuerrier(guerrier5);
		equipe1.ajouterGuerrier(guerrier6);
		equipe1.ajouterGuerrier(guerrier7);
		equipe1.ajouterGuerrier(guerrier8);
		equipe1.ajouterGuerrier(guerrier9);
		equipe1.ajouterGuerrier(guerrier10);
		
		equipe2.ajouterGuerrier(guerrier11);
		equipe2.ajouterGuerrier(guerrier17);
		equipe2.ajouterGuerrier(guerrier12);
		equipe2.ajouterGuerrier(guerrier13);
		equipe2.ajouterGuerrier(guerrier14);
		equipe2.ajouterGuerrier(guerrier15);
		equipe2.ajouterGuerrier(guerrier16);
		equipe2.ajouterGuerrier(guerrier18);
		equipe2.ajouterGuerrier(guerrier19);
		equipe2.ajouterGuerrier(guerrier20);
		
		
		
		

	}

}
