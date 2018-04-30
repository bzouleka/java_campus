package reseau_social;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class User {

	private String nom;
	private String prenom;
	private String ville;
	private String pseudo;
	private String message;

	// Constructeur par défaut
	public User() {
		nom = "Inconnu";
		prenom = "Inconnu";
		ville = "Inconnu";
		pseudo = "Inconnu";
		message = "Inconnu";

	}

	// Accesseurs
	/**
	 * 
	 * @param nom
	 */

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

	public String getPseudo() {
		return pseudo;
	}

	public void setPseudo(String pseudo) {
		this.pseudo = pseudo;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public static void modifierInfo() {

	}

	public static void createProfil() {

	}

	public static boolean isModerator() {
		return false; // modo niveau 0
	}

}