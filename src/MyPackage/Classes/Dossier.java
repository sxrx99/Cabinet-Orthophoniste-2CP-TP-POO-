package MyPackage.Classes;


import java.util.ArrayList;

public class Dossier {

  
    private int numDossier;
    private static int cpt;
    private ArrayList<RendezVous> listeRendezVous = new ArrayList<>();
    private ArrayList<BO> listeBO = new ArrayList<>();
    private ArrayList<FicheDeSuivi> listeFicheSuivi = new ArrayList<>();

    public Dossier() {
        this.numDossier = ++cpt;
    }
    
    public Dossier(ArrayList<RendezVous> listeRendezVous, ArrayList<BO> listeBO, ArrayList<FicheDeSuivi> listeFicheSuivi) {
        this.numDossier = ++cpt;
        this.listeRendezVous = listeRendezVous;
        this.listeBO = listeBO;
        this.listeFicheSuivi = listeFicheSuivi;
    }

    // Getters
    public int getNumDossier() {
        return numDossier;
    }

    public ArrayList<RendezVous> getlisteRendezVous() {
        return listeRendezVous;
    }

    public ArrayList<BO> getListeBO() {
        return listeBO;
    }

    public ArrayList<FicheDeSuivi> getListeFicheSuivi() {
        return listeFicheSuivi;
    }

    // Setters
    public void setlisteRendezVous(ArrayList<RendezVous> listeRendezVous) {
        this.listeRendezVous = listeRendezVous;
    }

    public void setListeBO(ArrayList<BO> listeBO) {
        this.listeBO = listeBO;
    }

    public void setListeFicheSuivi(ArrayList<FicheDeSuivi> listeFicheSuivi) {
        this.listeFicheSuivi = listeFicheSuivi;
    }

    public void ajouterRendezVous(RendezVous RendezVous) {
        listeRendezVous.add(RendezVous);
    }

}
