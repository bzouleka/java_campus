package reseau_social;

import java.util.Scanner;

public class Post {

	public String post[][] = new String[2][2];
	private String auteur, titre, message;
	int postId = -1;

	public Post() {
		System.out.println("affichage message");
		Scanner sc = new Scanner(System.in);

		postId++;
		System.out.println("auteur");
		auteur = sc.nextLine();
		post[postId][0] = auteur;
		System.out.println("titre");
		titre = sc.nextLine();
		post[postId][0] = titre;
		System.out.println("message");
		message = sc.nextLine();
		post[postId][0] = message;

		System.out.println(postId + post[postId][0] + post[postId][1] + post[postId][2]);
	}

	public int getPostId() {
		return postId;
	}

	public String getAuteur() {
		return auteur;
	}

	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String body) {
		this.message = message;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

}
