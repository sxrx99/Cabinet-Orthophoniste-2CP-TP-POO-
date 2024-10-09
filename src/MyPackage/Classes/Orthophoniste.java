package MyPackage.Classes;


import java.util.*;

public class Orthophoniste {

    private String nom;
    private String prenom;
    private String numTel;
    private String email;
    private String password;
    private String adresse;
    private Set<Patient> ListePatients;
    private Agenda agenda;

    Scanner scanner = new Scanner(System.in);

    public Orthophoniste(String nom, String prenom, String numTel, String email, String password, String adresse) {
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.email = email;
        this.password = password;
        this.numTel = numTel;
        this.ListePatients = new HashSet<>();
        this.agenda = new Agenda();
    }

    public String getNom() {
        return (this.nom);

    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return (this.prenom);

    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNumTel() {
        return (this.numTel);

    }

    public void setNumTel(String numTel) {
        this.numTel = numTel;
    }

    public String getEmail() {
        return (this.email);

    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAdresse() {
        return (this.adresse);

    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public Agenda getAgenda() {
        return (this.agenda);

    }

    public void setAgenda(Agenda agenda) {
        this.agenda = agenda;
    }
    public String getPassword() {
        return (this.password);

    }

    @Override
    public boolean equals(Object obj) {
        Orthophoniste ortho = (Orthophoniste) obj;
        return this.nom.equals(ortho.nom) && this.prenom.equals(ortho.prenom); 

    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 29 * hash + Objects.hashCode(this.nom);
        hash = 29 * hash + Objects.hashCode(this.prenom);
        return hash;
    }

    public void ajouterNouveauPatient(String nom,String prenom,String dateNaissance,String lieuNaissance,String adresse,String typeString,int age) {

        TypePatient type = TypePatient.valueOf(typeString);
        Patient patient = new Patient(nom, prenom, age, dateNaissance, lieuNaissance, adresse, type);

        System.out.println("entrez la date et l'heure jj/mm/aaaa : ");
        String date = scanner.nextLine();
        System.out.println("entrez l'heure 00:00 : ");
        String Heure = scanner.nextLine();
        patient.creerConsultation(date ,Heure);
        ListePatients.add(patient);

    }

    public Patient rechercherPatient(int numDossier, Set<Patient> ListePatients) {
        for (Patient patient : ListePatients) {
            if (patient.getDossier().getNumDossier() == numDossier) {
                return patient;
            }
        }
        return null; 
    }

    public void creerBO() {

        System.out.println("Entrez le numero dossier patient : ");
        int numDossier = scanner.nextInt();
        Patient p = rechercherPatient(numDossier, ListePatients);

    }


    public void ajouterRendezVous() throws PatientIntrouvableExcpetion {

        RendezVous RendezVous = null;

        System.out.println("entrez la date et l'heure jj/mm/aaaa : ");
        String date = scanner.nextLine();
        System.out.println("entrez l'heure 00:00 : ");
        String Heure = scanner.nextLine();

        System.out.println("une consultation pour une personne ou un groupe ");
        System.out.println("0:Individuelle  1:Groupe");
        int choix = scanner.nextInt();

        if (choix == 0) {
            System.out.println("Entrez le num dossier patient : ");
            int numDossier = scanner.nextInt();
            Patient p = rechercherPatient(numDossier, ListePatients);
            if (p == null) {
                throw new PatientIntrouvableExcpetion("Ce patient est introuvable.");
            } else {
                p.creerSeanceSuivi(date,Heure);
            }
        } else {
            System.out.println("entrez le nombre de patients qui vont participer a cet atelier de groupe : ");
            int n = scanner.nextInt();
            int d;
            Set<Patient> setPatientsAtelier = new HashSet<>();
            Set<Integer> setNum = new HashSet<>();
            System.out.println("entrez leurs numero de dossier :");
            for (int i = 0; i < n; i++) {
                System.out.println(" Patient " + (i + 1) + " : ");
                d = scanner.nextInt();
                Patient p = rechercherPatient(d, ListePatients);
                if (p != null) {
                    setPatientsAtelier.add(p);
                    setNum.add(d);
                } else {
                    throw new PatientIntrouvableExcpetion("Ce patient est introuvable.");
                }
            }
            System.out.println("entrez la thématique de l'atelier de groupe : ");
            String thematique = scanner.nextLine();
            RendezVous = new AtelierGroupe(date,Heure, thematique, setNum);

            System.out.println("Veuillez entrer votre observation : ");
            String observation = scanner.nextLine();
            RendezVous.setObservation(observation);

            for (Patient patient : setPatientsAtelier) {
                patient.getDossier().ajouterRendezVous(RendezVous);
            }

        }

    }

}
