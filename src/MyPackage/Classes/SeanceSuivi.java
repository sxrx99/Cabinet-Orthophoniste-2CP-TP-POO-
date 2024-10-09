package MyPackage.Classes;


public class SeanceSuivi extends RendezVous{
    
  
    private int numDossier;
    private final String duree = "1h";
    private EtatSeanceSuivi etat;

    public SeanceSuivi(String date, String Heure, String etat, int numDossier) {
        super(date,Heure);
        this.numDossier = numDossier;
        switch (etat) {
            case "PRESENTIEL" : this.etat = EtatSeanceSuivi.PRESENTIEL;
            case "ENLIGNE" :  this.etat = EtatSeanceSuivi.ENLIGNE;
            }
    }
    
}
