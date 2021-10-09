
public class Attacker extends Charactere {

	public Guerrier guerrier;
	public Attacker() {
		if (guerrier.combat != true) {
			
			guerrier.ad = guerrier.ad * 1.2;}
		
	}

}
