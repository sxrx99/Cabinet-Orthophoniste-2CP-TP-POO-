package MyPackage.Classes;


public class Objectif {

	private String nom ;
	private TypeObj type ;
	private int note ;
	
	
	public Objectif(String nom, String type, int note) {
		this.nom = nom ;
		this.note = 1 ; 
		switch (type) {
			case "Court terme" : 
			  this.type = TypeObj.CourtTerme ;
			 break ;
			case "Moyen terme" : 
			  this.type = TypeObj.MoyenTerme ;
			 break ;
			case "Long terme" : 
			  this.type = TypeObj.LongTerme ;
			 break ;
		}
	}
	
	
	
	public int getNote() {
        return note;
    }
	
	
	public void setNote (int noteObj) throws noteObjInacceptableException {
		if (noteObj > 5 || noteObj < 1) 
			throw new noteObjInacceptableException("La note doit etre comprise entre 1 et 5") ;
		this.note = noteObj ;
	}

	
    public String afficherObjectif() {
        return "Nom : " + nom + ", Type : " + type;
    }
	
}
