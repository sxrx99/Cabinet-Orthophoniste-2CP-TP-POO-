package MyPackage.Classes;


import java.util.*;

public class Diagnostic {

	ArrayList<Trouble> listeTroubles ;
	
	public Diagnostic() {
		
		listeTroubles = new ArrayList<Trouble>() ;
	}
	
	public void ajouterTrouble(Trouble trouble) throws TroubleDejaExistantException {
	
        if (listeTroubles.contains(trouble)) {
            throw new TroubleDejaExistantException("Le trouble existe déjà.");
        }
        listeTroubles.add(trouble);
	}
	
	
	public void supprimerTrouble(Trouble trouble) throws TroubleInexistantException {
    
        if (!listeTroubles.contains(trouble)) {
            throw new TroubleInexistantException("Le trouble n'existe pas.");
        }
        listeTroubles.remove(trouble);
	}


}
