
public class Bagarreur extends Charactere {
	
	public Guerrier guerrier;
	public Guerrier guerrier2;
	public Bagarreur()
	{
		guerrier2.combat = true;
		
		if (guerrier.combat != true)
		{
			guerrier.ennemi = guerrier2;
		}
	}
}
