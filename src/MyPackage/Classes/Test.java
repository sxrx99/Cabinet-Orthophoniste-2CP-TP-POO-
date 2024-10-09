package MyPackage.Classes;


public abstract class Test {

	protected String nom;
	protected int capacite;
	protected float scoreTotal = 0;
	protected String conclusion;

	public Test(String nom, int capacite, String conclusion) {
		this.nom = nom;
		this.capacite = capacite;
		this.conclusion = conclusion;

	}

	public String getNom() {
		return (this.nom);

	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getCapacite() {
		return (this.capacite);
	}

	public void setCapacite(int capacite) {
		this.capacite = capacite;
	}

	public String getConclusion() {
		return (this.conclusion);
	}

	public void setConclusion(String conclusion) {
		this.conclusion = conclusion;
	}

	public float getScoreTotal() {
		return (this.scoreTotal);
	}

	public void setScoreTotal(float scoreTotal) {
		this.scoreTotal = scoreTotal;
	}

	public abstract float calculeScoreTotal();
	public abstract void modifier();
}
