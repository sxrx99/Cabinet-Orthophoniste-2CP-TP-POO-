
package MyPackage.Classes;


import java.util.*;

public class AtelierGroupe extends RendezVous {
    
    private String thematique;
    private Set<Integer> setPatients = new HashSet<Integer>();
    private final String duree="1h";
    
    public AtelierGroupe(String date , String Heure, String thematique, Set<Integer> listePatients) {
        super(date,Heure);
        this.thematique = thematique;
        this.setPatients =  setPatients;      
    }
    
}
