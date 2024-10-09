package MyPackage.Classes;


import java.util.*;

public class Questionnaire extends Test {

	private Set<Question> ListeQst;

	public Questionnaire(String nom, int capacite, String conclusion, Set ListeQst) {
		super(nom, capacite, conclusion);
		this.ListeQst = new HashSet<>();
	}

	public Set<Question> getListeQst() {
		return ListeQst;
	}

	public void setSetQuestion(Set<Question> ListeQst) {
		this.ListeQst = ListeQst;
	}

	public void ajouterQuestion() {
		Scanner scanner = new Scanner(System.in);

		System.out.print("1 Ajouter une QCM. ");
		System.out.print("2 Rechercher une QCU . ");
		System.out.print("3 Ajouter une Question Libre. ");
		int c = scanner.nextInt();
		switch (c) {
			case 1 -> {
				System.out.print("Voulez donner l'enonce :");
				String enonce = scanner.nextLine();
				ajouterQCM(enonce);
			}
			case 2 -> {
				System.out.print("Voulez donner l'enonce :");
				String enonce2 = scanner.nextLine();
				ajouterQCU(enonce2);
			}
			case 3 -> {
				System.out.print("Voulez donner l'enonce :");
				String enonce3 = scanner.nextLine();
				QuestionLibre qst = new QuestionLibre(enonce3);
				ListeQst.add(qst);
				
			}
		}

	}

	@Override
	public float calculeScoreTotal() {
		int totalScore = 0;
		for (Question question : ListeQst) {
			totalScore += question.getScore();
		}
		return totalScore;
	}

	public int rechercherQuestion(String enonce) {
		int pos = 0;
		for (Question ex : ListeQst) {
			if (ex.equals(ex) == true) {
				break;
			}
			pos++;
		}
		return (pos);
	}

	public void supprimerQuestion(String enonce) {
		int p = rechercherQuestion(enonce);
		ListeQst.remove(p);
	}

	// @Override
	public void consulterTest() {
		// Affichage 
		Iterator<Question> it = ListeQst.iterator();
		Question q = null;

		while (it.hasNext()) {
			q = it.next();
			System.out.println(q.getEnonce());
		}

	}

	@Override
	public void modifier() {
		Scanner scanner = new Scanner(System.in);

		System.out.print(" Ajouter une question. ");
		System.out.print(" Rechercher une question . ");
		System.out.print(" Supprimer une question . ");
		int choix = scanner.nextInt();

		switch (choix) {
			case 1:
				ajouterQuestion();

			case 2:

				System.out.print("entrer la consigne ");

				String enonce = scanner.nextLine();
				this.rechercherQuestion(enonce);
				break;
			case 3:
				System.out.print(" entrer la consigne ");
				String enonce2 = scanner.nextLine();
				this.supprimerQuestion(enonce2);

				break;
		}
	}

	public void ajouterQCM(String enonce) {
		QCM qst = new QCM(enonce);
		qst.fillFalseAnswers();
		qst.fillRightAnswers();
		ListeQst.add(qst);

	}

	public void ajouterQCU(String enonce) {
		QCU qst = new QCU(enonce);
		qst.fillFalseAnswers();
		qst.fillRightAnswers();
		ListeQst.add(qst);

	}

}
