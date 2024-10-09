package MyPackage.Classes;

import java.util.*;

public class Agenda {
    private Map<String, ArrayList<RendezVous>> RendezVous; 

    public Agenda() {
        RendezVous = new HashMap<>();
    }

    
    public void ajouterRdv(String date, RendezVous rendezVous) {
        RendezVous.computeIfAbsent(date, k -> new ArrayList<>()).add(rendezVous);
    }

   
    public ArrayList<RendezVous> getRdv(String date) {
        return RendezVous.getOrDefault(date, new ArrayList<>());
    }
}
