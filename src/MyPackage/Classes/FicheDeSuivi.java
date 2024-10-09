package MyPackage.Classes;


import java.util.*;

public class FicheDeSuivi {
	private ArrayList<Objectif> listeObjectifs ;
	private boolean atteint ;
	
	public int numFiche ;
	
	public FicheDeSuivi() {
		listeObjectifs = new ArrayList<Objectif>();
		this.atteint = false ; 
	}
	
	public void setAtteint(boolean atteint) {
		this.atteint = atteint ;
	}
	
		public boolean isAtteint() {
	        return atteint;
	    }
		
		
	
	public void objectifsAtteints() {
		for (Objectif obj : listeObjectifs) {
			if (obj.getNote() < 5) {
	            atteint = false ;
	            return; 
	        }
	    }
	   
	    atteint = true ;
	}
		
	
	public void ajouterObjectif(Objectif objectif) throws ObjectifDejaExistantException {
		
        if (listeObjectifs.contains(objectif)) {
            throw new ObjectifDejaExistantException("L'objectif existe déjà.");
        }
        listeObjectifs.add(objectif);
    }

	
    public void supprimerObjectif(Objectif objectif) throws ObjectifInexistantException {
    	
        if (!listeObjectifs.contains(objectif)) {
            throw new ObjectifInexistantException("L'objectif n'existe pas.");
        }
        listeObjectifs.remove(objectif);
    }
	
	
    
    public void afficherListeObjectifs() {
		int i = 1;
        if (listeObjectifs.isEmpty()) {
            System.out.println("Il n'y a aucun objectif dans la fiche de suivi.");
            return;
        }
        System.out.println("la liste des objectifs :");
        for (Objectif obj : listeObjectifs) {
            System.out.println("Objectif " + i + " : " + obj.afficherObjectif()); 
            i++; // Incrément du compteur
        }
    }
		
}