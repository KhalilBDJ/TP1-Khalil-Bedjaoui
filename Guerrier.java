import java.util.Random;



public class Guerrier implements Runnable{
	
	public double hp;
	public double ad;
	public double efficacite;
	public Charactere charactere;
	public equipe equipe;
	public double totalHp;
	public double as;
	public boolean combat = true;
	public boolean ally;
	public boolean aGagne;
	public Guerrier ennemi;
	public Guerrier(double totalHp, double ad, double efficacite, Charactere charactere)
	{
		hp = totalHp;
		this.totalHp = totalHp;
		this.ad = ad;
		this.efficacite = efficacite;
		this.charactere = charactere;
	}

	
	public void run()
	{
		Guerrier guerrier = ennemi;
		if (guerrier.equipe != equipe)
		{
			combat = true;
			Random random = new Random();
			while(guerrier.hp <=0.0)
			{
				try {
					if (aTouche(guerrier) == true)
					{
						guerrier.hp = guerrier.hp - getAd();
						Thread.sleep(200 + random.nextInt(300));
						if(getHp() <= 0)
						{
							aGagne = false;
						}
						else
						{
							aGagne = true;
							hp = hp + hp*0.3;
							if (hp > totalHp)
							{
								hp = totalHp;
							}
						}
					}
				}
				catch (InterruptedException ex)
				{
					ex.printStackTrace();
				}
				
			}
		}
	}
	public boolean neCombatPas()
	{
		return combat = false;
	}
	
	public boolean aTouche(Guerrier guerrier)
	{
		if (Math.random() * 100<getEfficacite())
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	/*public boolean tue(Guerrier guerrier)
	{
		if (combat == true)
		{
			Random random = new Random();
			while(guerrier.hp <=0.0)
			{
				try {
					if (aTouche(guerrier) == true)
					{
						guerrier.hp = guerrier.hp - getAd();
						Thread.sleep(200 + random.nextInt(300));
					}
				}
				catch (InterruptedException ex)
				{
					ex.printStackTrace();
				}
			}
			return true;
		}
		else
			{
				return false;
			}
		}*/

	public double getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public double getAd() {
		return ad;
	}

	public double getTotalHp() {
		return totalHp;
	}

	public void setTotalHp(int totalHp) {
		this.totalHp = totalHp;
	}

	public double getAs() {
		return as;
	}

	public void setAs(int as) {
		this.as = as;
	}

	public void setAd(int ad) {
		this.ad = ad;
	}

	public double getEfficacite() {
		return efficacite;
	}

	public void setEfficacite(double efficacite) {
		this.efficacite = efficacite;
	}

	public Charactere getCharactere() {
		return charactere;
	}

	public void setCharactere(Charactere charactere) {
		this.charactere = charactere;
	}

	public equipe getEquipe() {
		return equipe;
	}

	public void setEquipe(equipe equipe) {
		this.equipe = equipe;
	}
	
	
}
