package MyPackage.Classes;


public class ConsultationAdulte extends Consultation{

    private static final String duree = "1h30" ;

    public ConsultationAdulte(String date, String Heure, String nom, String prenom, int age) {
        super(date,Heure, nom, prenom, age, duree);
    }
    
}
