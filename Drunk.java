
public class Drunk extends Charactere {
	public Guerrier guerrier;
	
	public Drunk()
	{
		if (guerrier.combat != true)
		{
			guerrier.efficacite = guerrier.efficacite * 0.5;
		}
	}
}
