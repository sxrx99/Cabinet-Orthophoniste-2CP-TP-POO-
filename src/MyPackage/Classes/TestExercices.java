package MyPackage.Classes;


import java.util.*;

public class TestExercices extends Test {

	ArrayList<Exercice> exercices;

	public TestExercices(String nom, int capacite, String conclusion, ArrayList<Exercice> exercices) {
		super(nom, capacite, conclusion);
		this.exercices = exercices;
	}

	@Override
	public float calculeScoreTotal() {

		for (Exercice ex : exercices) {
			scoreTotal = +ex.calculeMoyenne();

		}
		return (scoreTotal);
	}

	public void ajouterExercies(String consigne, String nomMateriel, float scores[]) {
		Exercice exercice = new Exercice(consigne, nomMateriel, scores);
		exercices.add(exercice);

	}

	public int rechercherExercices(String consigne) {
		int pos = 0;
		for (Exercice ex : exercices) {
			if (ex.equals(consigne) == true) {
				break;
			}
			pos++;
		}
		return (pos);
	}

	public void supprimerExercies(String cons) {
		int p = rechercherExercices(cons);
		exercices.remove(p);
	}

	@Override
	
	public void modifier() {
		Scanner scanner = new Scanner(System.in);

		
		System.out.print("1 Ajouter un exercices. ");
		System.out.print("2 Rechercher un exercices. ");
		System.out.print("3 Supprimer un exercices. ");
		int choix = scanner.nextInt();

		switch (choix) {
			case 1:
				System.out.print(" entrer la consigne ,nomMateriel , scores");
				String consigne = scanner.nextLine();
				String nomMateriel = scanner.nextLine();
				float[] scores = remplirescore();
				this.ajouterExercies(consigne, nomMateriel, scores);

				break;

			case 2:

				System.out.print(" entrer la consigne ,nomMateriel , scores");

				String c = scanner.nextLine();
				this.rechercherExercices(c);

				break;
			case 3:
				System.out.print(" entrer la consigne ,nomMateriel et scores");

				String consigne2 = scanner.nextLine();
				this.rechercherExercices(consigne2);
				this.supprimerExercies(consigne2);
				break;
		}
	}

	public float[] remplirescore() {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Entrer le nombre de foix effectuer ");
		int size = scanner.nextInt();

		float[] score = new float[size];

		System.out.println("Enter the elements of the array:");
		for (int i = 0; i < size; i++) {
			System.out.print("Entrer le score " + (i + 1) + ": ");
			score[i] = scanner.nextFloat();
		}
		return (score);
	}

}
