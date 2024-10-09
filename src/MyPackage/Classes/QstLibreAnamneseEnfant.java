package MyPackage.Classes;


public class QstLibreAnamneseEnfant extends QstLibreAnamnese {
	
	private TypeQstAnamneseEnfant categorie;
	
	public QstLibreAnamneseEnfant(String enonce, TypeQstAnamneseEnfant categorie) {
		super(enonce);
		this.categorie = categorie;
	}

}
