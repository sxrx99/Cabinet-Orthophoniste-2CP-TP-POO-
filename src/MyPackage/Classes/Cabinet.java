package MyPackage.Classes;


import java.util.*;


public class Cabinet {

	private static Cabinet instance;
	private Set<Orthophoniste> orthophonistes = new HashSet<>();

	private Cabinet() {
        orthophonistes = new HashSet<>();
    }

	public static synchronized Cabinet getInstance() {
        if (instance == null) {
            instance = new Cabinet();
        }
        return instance;
    }

	public void creerCompte(String nom, String prenom, String numTel, String email, String password, String adresse) {
		Orthophoniste O = new Orthophoniste(nom, prenom, numTel, email, password,adresse);
		orthophonistes.add(O);
	}

	public boolean Authentifier( String email, String password) {
		
		for (Orthophoniste O : orthophonistes) {
			if (email.equals(O.getEmail()) && password.equals(O.getPassword())) {
				return true; 
			}
		}
		return false; 
	}

	public void supprimerCompte(Orthophoniste O) {

		orthophonistes.remove(O);
	}
}
