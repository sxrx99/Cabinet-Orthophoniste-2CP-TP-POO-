package MyPackage.Classes;


import java.util.*;

public class QCU extends Question implements Questionable {

	private String reponseJuste;
	private ArrayList<String> reponsesFausses;
	private String reponse;

	public QCU(String enonce) {
		super(enonce);
		reponsesFausses = new ArrayList<>();

	}

	public String getReponseJuste() {
		return reponseJuste;
	}

	public void setReponseJuste(String reponseJuste) {
		this.reponseJuste = reponseJuste;
	}

	public ArrayList<String> getReponsesFausses() {
		return reponsesFausses;
	}

	public void setReponsesFausses(ArrayList<String> reponsesFausses) {
		this.reponsesFausses = reponsesFausses;
	}

	public String getReponse() {
		return reponse;
	}

	public void setReponse(String reponse) {
		this.reponse = reponse;
	}

	public float evaluer() {
		if (reponse.equals(reponseJuste)) {
			return 1;
		}
		return 0;
	}

	public boolean ajoutRepJuste(String reponse) {
		if (!"".equals(reponse)) {
			this.setReponseJuste(reponse);

			return true;
		} else {//Erreur
		}
		return false;
	}

	public boolean ajoutRepFausse(String reponse) {
		if (!"".equals(reponse)) {
			this.reponsesFausses.add(reponse);

			return true;
		} else {//Erreur
		}
		return false;
	}

	public void repondre(String reponse) {
		this.reponse = reponse;
	}

	public void afficheReponses() {

		int i = 1;

		System.out.println(i + "-" + reponseJuste);
		i++;
		Iterator<String> it1 = reponsesFausses.iterator();

		while (it1.hasNext()) {
			System.out.println(i + "-" + it1.next());
			i++;
		}
	}

	@Override
	public void fillFalseAnswers() {
		Scanner scanner = new Scanner(System.in);

		
		System.out.print("Voulez vous donner le nombre des question justes ");
		int n = scanner.nextInt();
		System.out.print("Voulez vous donner les repncses");
		while (n != 0) {
			String R = scanner.nextLine();

			this.ajoutRepFausse(R);
		}

	}

	@Override
	public void fillRightAnswers() {
		Scanner scanner = new Scanner(System.in);

		
		System.out.print("Voulez vous donner le nombre des question justes ");
		int n = scanner.nextInt();
		System.out.print("Voulez vous donner les repncses");
		while (n != 0) {
			String R = scanner.nextLine();

			this.ajoutRepJuste(R);
		}
	}

}
