package reseau_social;

import java.util.Scanner;

public class Menu {

	Scanner sc = new Scanner(System.in);
	
	public void menu(User Campus)	{	
		
		
		boolean afficherMenu = true;
		while(afficherMenu) {
		
		System.out.println("taper un choix entre 1 et 9\n");
		System.out.println("1- profil");
		System.out.println("2- Modifier le profil");
		System.out.println("3- Ecrire un message");
		System.out.println("4- Afficher les messages");
		System.out.println("5- Supprimer un message");
		System.out.println("6- Supprimer un utilisateur");
		

		
		int choix = sc.nextInt();
		sc.nextLine();
		
		
		
		switch (choix)
		{
		case 1 :
			showProfil(Campus);
			break;
		case 2:
			changeProfil(Campus);
			break;
		case 3:
			writeMessage(Campus);
			break;
		case 4:
			showMessage(Campus);
			break;
		case 6:
			deleteMsg();
			break;
		case 8: 
			deleteUser();
			break;
		case 9:
			exit();
			break;
		default:
		
	}
		afficherMenu = retMenu();
	}	
	}
	
	//public static void retourMenu() {	// pour pouvoir retourner au menu
		//System.out.println("taper 0 pour retourner au menu");  // penser a mettre la phrase pour le choix avant le scanner pour qu'elle s'affiche
		   // Demande a l'utilisateur si il faut returner au menu ou quiter
		     // @return : true si on retourne au menu sinon false 
	
	

			//}
		    private static boolean retMenu(){
		        System.out.println("Retourner au menu ? ");
		        return demanderOuiNon();
		    }
		    
		    private static boolean demanderOuiNon() {
		        char r;
		        Scanner ret = new Scanner(System.in);
		        do {
		            System.out.println("Répondre par O / N");
		            r = ret.nextLine().charAt(0);
		        } while( r != 'O' && r != 'N');
		        if(r == 'O') {
		            return true;
		        } else {
		        	System.out.println("CIAO!");
		            return false;
		            
		        }
		    
	}
	
	public void showProfil(User Campus) {
		System.out.println(Campus.getNom() + " " + Campus.getPrenom());
	
	}
	
	public void changeProfil(User Campus) {
		System.out.println("merci de modifier le nom :");
		Campus.setNom(sc.nextLine());
		System.out.println(Campus.getNom());
	}
	
	 public void writeMessage(User Campus) {
		 System.out.println("merci d'écrire un nouveau message :");
		 Campus.setMessage(sc.nextLine());	
		 System.out.println(Campus.getMessage());
		}
	 public void showMessage(User Campus) {
		System.out.println(Campus.getMessage());
		}
	 
	 private void deleteMsg() {
			// TODO Auto-generated method stub
			
		}
	 
	 private void deleteUser() {
			// TODO Auto-generated method stub
			
		}
	 	 	
	private static void exit() {
				
	
	}
	
	
	/*
	
	while ( isModerator() ) {
		
		if (admin() == 1) {
			
			boolean afficherMenu = true;
			while(afficherMenu) {
			
			System.out.println("taper un choix entre 1 et 9\n");
			System.out.println("1- profil");
			System.out.println("2- Modifier le profil");
			System.out.println("3- Ecrire un message");
			System.out.println("4- Afficher les messages");
			System.out.println("5- Supprimer un message");
			
			

			
			int choix = sc.nextInt();
			sc.nextLine();
			
			
			
			switch (choix)
			{
			case 1 :
				showProfil(Campus);
				break;
			case 2:
				changeProfil(Campus);
				break;
			case 3:
				writeMessage(Campus);
				break;
			case 4:
				showMessage(Campus);
				break;
			case 6:
				deleteMsg();
				break;
			
			case 7:
				exit();
				break;
			default:
			
		}
			afficherMenu = retMenu();
		}	
		} 
		else if (admin() == 2){
			boolean afficherMenu = true;
			while(afficherMenu) {
			
			System.out.println("taper un choix entre 1 et 9\n");
			System.out.println("1- profil");
			System.out.println("2- Modifier le profil");
			System.out.println("3- Ecrire un message");
			System.out.println("4- Afficher les messages");
			System.out.println("5- Supprimer un message");
			System.out.println("6- Supprimer un utilisateur");
			

			
			int choix = sc.nextInt();
			sc.nextLine();
			
			
			
			switch (choix)
			{
			case 1 :
				showProfil(Campus);
				break;
			case 2:
				changeProfil(Campus);
				break;
			case 3:
				writeMessage(Campus);
				break;
			case 4:
				showMessage(Campus);
				break;
			case 6:
				deleteMsg();
				break;
			case 8: 
				deleteUser();
				break;
			case 9:
				exit();
				break;
			default:
			
		}
			afficherMenu = retMenu();
		}	
		} 
		else {
			boolean afficherMenu = true;
			while(afficherMenu) {
			
			System.out.println("taper un choix entre 1 et 9\n");
			System.out.println("1- profil");
			System.out.println("2- Modifier le profil");
			System.out.println("3- Ecrire un message");
			System.out.println("4- Afficher les messages");
			
			

			
			int choix = sc.nextInt();
			sc.nextLine();
			
			
			
			switch (choix)
			{
			case 1 :
				showProfil(Campus);
				break;
			case 2:
				changeProfil(Campus);
				break;
			case 3:
				writeMessage(Campus);
				break;
			case 4:
				showMessage(Campus);
				break;
			case 5:
				exit();
				break;
			default:
			
		}
			afficherMenu = retMenu();
		}	
		}
		
	}
*/
	
}
