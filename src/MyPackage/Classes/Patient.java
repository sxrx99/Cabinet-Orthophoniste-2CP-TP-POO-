package MyPackage.Classes;


import java.util.*;

class Patient {

    private Dossier dossier;
    private int nbBO;
    private int nbRendezVous;
    private String nom;
    private String prenom;
    private int age;
    private String dateNaissance;
    private String lieuNaissance;
    private String adresse;
    private TypePatient type;
    Scanner scanner = new Scanner(System.in);

    public Patient(String nom, String prenom, int age, String dateNaissance, String lieuNaissance, String adresse, TypePatient type) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.dateNaissance = dateNaissance;
        this.lieuNaissance = lieuNaissance;
        this.adresse = adresse;
        this.type = type;
    }

    public void creerDossier() {
        Dossier dossier = new Dossier();
    }

    // Getters
    public Dossier getDossier() {
        return dossier;
    }

    public int getNbBO() {
        return nbBO;
    }

    public int getNbRendezVous() {
        return nbRendezVous;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public int getAge() {
        return age;
    }

    public String getDateNaissance() {
        return dateNaissance;
    }

    public String getLieuNaissance() {
        return lieuNaissance;
    }

    public String getAdresse() {
        return adresse;
    }

    // Setters
    public void setDossier(Dossier dossier) {
        this.dossier = dossier;
    }

    public void setNbBO(int nbBO) {
        this.nbBO = nbBO;
    }

    public void setNbRendezVous(int nbRendezVous) {
        this.nbRendezVous = nbRendezVous;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setDateNaissance(String dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public void setLieuNaissance(String lieuNaissance) {
        this.lieuNaissance = lieuNaissance;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public void passerBO() {

    }

    public void creerConsultation(String date,String Heure) {
        
        RendezVous RendezVous = null;

     
        creerDossier();
        this.nbRendezVous++;
        if (type == TypePatient.ENFANT) {
            RendezVous = new ConsultationEnfant(date,Heure, nom, prenom, age); 
        } else {
            if (type == TypePatient.ADULTE) {
                RendezVous = new ConsultationAdulte(date,Heure, nom, prenom, age); 
            }
        }

        System.out.println(" entrez votre observation : ");
        String observation = scanner.nextLine();
        RendezVous.setObservation(observation);
     
        dossier.ajouterRendezVous(RendezVous);
    }

    public void creerSeanceSuivi(String date, String Heure) {
       
        RendezVous RendezVous = null;

        this.nbRendezVous++;
        System.out.println("Le rendez-vous est PRESENTIEL/ENLIGNE  ");
        String etat = scanner.nextLine();
        RendezVous = new SeanceSuivi(date,Heure, etat, dossier.getNumDossier());
        System.out.println(" entrez votre observation : ");
        String observation = scanner.nextLine();
        RendezVous.setObservation(observation);
        dossier.ajouterRendezVous(RendezVous);
    }
    

  
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Patient patient = (Patient) o;
        return dossier.getNumDossier() == dossier.getNumDossier();
    }

   
    @Override
    public int hashCode() {
        return Objects.hash(dossier.getNumDossier());
    }

    public Patient rechercherPatient(int numDossier, HashSet<Patient> setPatients) {
        for (Patient patient : setPatients) {
            if (patient.getDossier().getNumDossier() == numDossier) {
                return patient;
            }
        }
        return null; 
    }

}

