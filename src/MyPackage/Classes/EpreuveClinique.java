package MyPackage.Classes;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class EpreuveClinique {

	private String observationClinique;
	private Set<Test> setTests;

	public EpreuveClinique(String observationClinique) {
		this.observationClinique = observationClinique;
		this.setTests = new HashSet<>();

	}

	public void creerTest() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("creer un Test d'exercices:'1' ou un Questionnaire:'2' : ");
		int choix = scanner.nextInt();
		Test t;
		switch (choix) {
			case 1:
				t = creerTestExercices();

				t.modifier();
				this.setTests.add(t);

			case 2:
				t = creerQuestionnaire();
				t.modifier();
				setTests.add(t);

		}

	}

	public TestExercices creerTestExercices() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("donner le nom d'exercices ");
		String nom = scanner.nextLine();
		System.out.print("donner la conclusion d'exercices ");
		String conclusion = scanner.nextLine();
		ArrayList<Exercice> exercices;
		exercices = new ArrayList<>();
		TestExercices e = new TestExercices(nom, 10, conclusion, exercices);
		return (e);
	}

	public Questionnaire creerQuestionnaire() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("donner le nom de questionnaire ");
		String nom = scanner.nextLine();
		System.out.print("donner la conclusion ");
		String conclusion = scanner.nextLine();
		Set<Question> Questions = new HashSet();
		Questionnaire q = new Questionnaire(nom, 10, conclusion, Questions);
		return (q);
	}

	public void setObservationClinique(String observation) {
		this.observationClinique = observation;
	}

	public String getObservationClinique(String observation) {
		return (this.observationClinique);
	}

}
