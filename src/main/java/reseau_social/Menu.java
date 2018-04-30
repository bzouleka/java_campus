package reseau_social;

import java.util.Scanner;

public class Menu {

	Scanner sc = new Scanner(System.in);

	public void menu(Moderateur modA) throws NumeroException{
		boolean afficherMenu = true;

		while (afficherMenu) {

			if (Moderateur.isModerator() == false) {

				menu0();

				/*
				 * System.out.println("BIENVENUE SUR SEECRETSPOT\n");
				 * System.out.println("Faites votre choix :\n");
				 * 
				 * System.out.println("-1- Afficher votre profil");
				 * System.out.println("-2- Modifier les informations");
				 * System.out.println("-3- Ecrire un message");
				 * System.out.println("-4- Modifier un message");
				 * System.out.println("-5- Se deconnecter");
				 */

				int menu = sc.nextInt();
				sc.nextLine();

				/*
				 * switch (menu) { case 1: ShowProfil(userA); break; case 2:
				 * Users.modifierInfo(); break; case 3: writeMessage(userA); break; case 4:
				 * changeMessage(userA); break; case 5: logout(); break; } afficherMenu =
				 * retMenu();
				 */
			} // if

			else if (Moderateur.isModerator() == true && Moderateur.getMod() == 1) {

				menu0();
				menu1();
				/*
				 * System.out.println("BIENVENUE SUR SEECRETSPOT\n");
				 * System.out.println("Faites votre choix :\n");
				 * 
				 * System.out.println("-1- Afficher votre profil");
				 * System.out.println("-2- Modifier les informations");
				 * System.out.println("-3- Ecrire un message");
				 * System.out.println("-4- Modifier un message");
				 * System.out.println("-5- Se deconnecter"); System.out.println("-6- Tester");
				 */

				int menu = sc.nextInt();
				sc.nextLine();
				
				

				try {
					switch (menu) {
					case 1:
						ShowProfil(modA);
						break;
					case 2:
						User.modifierInfo();
						break;
					case 3:
						writeMessage(modA);
						break;
					case 4:
						changeMessage(modA);
						break;
					case 5:
						logout();
						break;
					case 6:
						System.out.println("test");

					}
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				if(menu>6) {
					throw new NumeroException();

				}
				afficherMenu = retMenu();
			} // if

			else if (Moderateur.isModerator() == true && Moderateur.getMod() == 2) {
				
				menu0();
				menu1();
				menu2();
				/*
				 * System.out.println("BIENVENUE SUR SEECRETSPOT\n");
				 * System.out.println("Faites votre choix :\n");
				 * 
				 * System.out.println("-1- Afficher votre profil");
				 * System.out.println("-2- Modifier les informations");
				 * System.out.println("-3- Ecrire un message");
				 * System.out.println("-4- Modifier un message");
				 * System.out.println("-5- Se deconnecter"); System.out.println("-6- Tester");
				 * System.out.println("-7- TESTER");
				 */

				int menu = sc.nextInt();
				sc.nextLine();

				switch (menu) {
				case 1:
					ShowProfil(modA);
					break;
				case 2:
					User.modifierInfo();
					break;
				case 3:
					writeMessage(modA);
					break;
				case 4:
					changeMessage(modA);
					break;
				case 5:
					logout();
					break;
				case 7:
					System.out.println("test2");

				}
				afficherMenu = retMenu();
			} // elseif

		} // boucle while1
	} // public void menu

	// Demande a l'utilisateur si il faut returner au menu ou quiter
	// @return : true si on retourne au menu sinon false

	private static boolean retMenu() {
		System.out.println("Retourner au menu ? ");
		return demanderOuiNon();
	}

	private static boolean demanderOuiNon() {
		Scanner sc = new Scanner(System.in);
		char r;
		do {
			System.out.println("Répondre par O / N");
			r = sc.nextLine().charAt(0);
		} while (r != 'O' && r != 'N');
		if (r == 'O') {
			return true;
		} else {
			return false;
		}

	}

	private void ShowProfil(Moderateur modA) {
		System.out.println("Profil de : " + modA.getNom() + ' ' + modA.getPrenom());

	}

	private void logout() {
		System.out.println("Bye ! A bientôt sur SeecretSpot");

	}

	public void writeMessage(Moderateur modA) {
		System.out.println("merci d'écrire un nouveau message :");
		modA.setMessage(sc.nextLine());
		System.out.println(modA.getMessage());
	}

	public void changeMessage(Moderateur modA) {
		System.out.println(modA.getMessage());
	}
	
	
	
	
/**
 * menu2 = fonction du menu principal modo0
 */
	private static void menu0() {

		System.out.println("BIENVENUE SUR SEECRETSPOT\n");
		System.out.println("Faites votre choix :\n");

		System.out.println("-1- Afficher votre profil");
		System.out.println("-2- Modifier les informations");
		System.out.println("-3- Ecrire un message");
		System.out.println("-4- Modifier un message");
		System.out.println("-5- Se deconnecter");
	}
	
	/**
	 * test1 = fonction d'ajout de fonctionnalité au menu principal pour modo1
	 */

	private void menu1() {

		System.out.println("-6- Tester");
		
		

		}

	
	
	/**
	 * test2 = fonction d'ajout de fonctionnalité au menu principal pour modo2
	 */

	private static void menu2() {

		System.out.println("-7- TESTER");

	}

}