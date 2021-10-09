
public class Healer extends Charactere {

	public Guerrier guerrier;
	
	public Healer() {
		if (guerrier.combat != true)
		{
			guerrier.hp = guerrier.totalHp;
		}
	}

}
