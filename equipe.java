import java.util.List;

public class equipe {
	public int effectif;
	public String couleur;
	public List<Guerrier> guerriers;
	
	public equipe (String couleur)
	{
		this.couleur = couleur;
		effectif = guerriers.size();
	}

	public int getEffectif() {
		return effectif;
	}
	
	public void ajouterGuerrier(Guerrier guerrier)
	{
		guerriers.add(guerrier);
	}

	public void setEffectif(int effectif) {
		this.effectif = effectif;
	}

	public String getCouleur() {
		return couleur;
	}

	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}

	public List<Guerrier> getGuerriers() {
		return guerriers;
	}

	public void setGuerriers(List<Guerrier> guerriers) {
		this.guerriers = guerriers;
	}
	
	
}
