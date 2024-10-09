package MyPackage.Classes;


public class RendezVous {
    
    protected TypeRendezVous type;
    protected String date;
    protected String Heure;
    protected String observation;
    
    public RendezVous(String date , String Heure) {
        this.date = date;
        this.Heure=Heure;
     
    }
    
    public void setObservation(String observation) {
        this.observation = observation;
    }

    public void AfficherRendezVous () {
		System.out.println(" La date du Rendez Vous : "+this.date);
		System.out.println(" L'heure du Rendez Vous : "+this.Heure);
		System.out.println(" Le type du Rendez Vous : "+this.type);
		System.out.println(" L'observation à la fin du Rendez Vous : "+this.observation);
	}
	 
	 	 
	 
    
}
