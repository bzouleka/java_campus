package reseau_social;

public class User {

	private String nom;
	private String prenom;
	private String ville;
	private String age;

	public User() {

		nom = "";
		prenom = "";
		ville = "";
		age = "";
	}

	public User(String nom, String prenom, String ville, String age) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.ville = ville;
		this.age = age;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

}
