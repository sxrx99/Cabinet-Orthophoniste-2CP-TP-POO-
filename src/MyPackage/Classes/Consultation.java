package MyPackage.Classes;


public class Consultation extends RendezVous {
    protected String NomPatient;
    protected String PrenomPatient;
    protected int AgePatient;
    protected final String duree;
    
   
    public Consultation(String date,String heure, String nomPatient,String prenomPatient, int agePatient, String duree){
      super(date, heure);
	  this.NomPatient=nomPatient;
	  this.PrenomPatient=prenomPatient;
	  this.AgePatient=agePatient;
	  this.duree=duree;

	}


	 
	// Les getters de la classe Consultation 
	
	public String getNomPatient () {
		return this.NomPatient;
	}
	
	public String getPrenomPatient () {
		return this.PrenomPatient;
	}

	public int AgePatient () {
		return this.AgePatient;
	}
	
	public String getDuree() {
		return this.duree;
	}
	
	// Les setters de la classe Consultation
	
	public void setNomPatient(String NomPatient) {
		this.NomPatient=NomPatient;
	}
	
	public void setPrenomPatient(String PrenomPatient) {
		this.PrenomPatient=PrenomPatient;
	}
	
	public void setAgePatient(int AgePatient) {
		this.AgePatient=AgePatient;
	}
	
	public void AfficherRendezVous() {
		super.AfficherRendezVous();
		System.out.println("Le nom du patient : "+this.NomPatient);
		System.out.println("Le prénom du patient : "+this.PrenomPatient);
		System.out.println("L'age du patient : "+this.AgePatient);
		System.out.println("La durée de la consultation : "+this.duree);
	}
	
	
}
