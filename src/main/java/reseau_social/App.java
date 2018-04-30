package reseau_social;

import java.util.Scanner;

public class App {

	Scanner sc = new Scanner(System.in);

	public static void main(String[] args){ // il s'agit de la fonction principale

		User user = new User();
		user.setNom("Bouhassoun");
		user.setPrenom("Zouleka");
		user.setVille("Annemasse");
		user.setPseudo("zouzou");
		// System.out.println(user.getNom());

		User Campus = new User();
		Campus.setNom("Campus");
		Campus.setPrenom("numerique");
		Campus.setVille("annecy");
		Campus.setPseudo("");
		Campus.setMessage("French Tech");

		Moderateur modA = new Moderateur();
		modA.setNom("");
		modA.setPrenom("");
		modA.setPseudo("");
		modA.setVille("");
		modA.setMod(1);

		Post post[][] = new Post[2][2];

		Menu menu = new Menu();
		menu.menu(modA);

	}
}
