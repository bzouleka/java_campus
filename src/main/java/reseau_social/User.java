package reseau_social;

public class User {

	private String Nom, Prenom, Ville, Pseudo, Message;
		
	public User() {
		System.out.println("création user");
		Nom = "Inconnu";
		Prenom = "Inconnu";
		Ville = "Inconnu";
		Pseudo = "Inconnu";
		Message = "Inconnu";
		}
	
	public String getMessage() {
		return Message;
	}
	
	public String getNom() {
		return Nom;
	}
	
	public String getPrenom () {
		return Prenom;
	}
	
	public String getVille () {
		return Ville;
	}
	
	public String getPseudo () {
		return Pseudo;
	}
	
	public void setNom(String Nom) {
		this.Nom = Nom;
	}
	
	public void setPrenom(String Prenom) {
		this.Prenom = Prenom;
	}
	
	public void setVille(String Ville) {
		this.Ville = Ville;
	}
	
	public void setPseudo(String Pseudo) {
		this.Pseudo = Pseudo;
	}
	
	public void setMessage(String Message) {
		this.Message = Message;
	}
	
	public static boolean isModerator() {
		
		return false;
	}
	
}
