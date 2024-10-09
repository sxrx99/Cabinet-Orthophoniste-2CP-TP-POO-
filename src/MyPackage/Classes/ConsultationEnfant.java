package MyPackage.Classes;


public class ConsultationEnfant extends Consultation {
    
    private static final String duree = "1h30" ;

    public ConsultationEnfant(String date, String Heure, String nom, String prenom, int age) {
        super(date,Heure, nom, prenom, age, duree);
    }
}
