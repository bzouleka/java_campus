package reseau_social;

import java.util.Scanner;

public class App {
	
 User user =new User();
 

    public static void main(String[] args) {

        App app = new App();
        
    }
    
    public App() {
    Scanner sc = new Scanner(System.in); // autoriser a entrer des donner

    System.out.println("Bienvenue");
    
    user.setNom("Bouhassoun");
    user.setPrenom("Zouleka");
    user.setVille("Annemasse");
    user.setAge("31");
    
    boolean showMenu = true;
    
    while(showMenu) {
        
        System.out.println("Faites votre choix :");
        System.out.println("-1- afficher le profil");
        System.out.println("-2- modifier les infos");
        System.out.println("-3- envoyer un message");
        System.out.println("-4- afficher un message");
        System.out.println("-5- ajouter un ami");
        System.out.println("-6- afficher le nom d'un ami");
        
        int menu = sc.nextInt(); 
        
   
        switch (menu) {
        case 1:
            showprofil();
            break;
            
        case 2:
            updateInfo();
            break;
         
        case 3: 
        	sendMessage();
        	break;
        	
        case 4 :
        	sendMessage();
        	break;
        	
        case 5 : 
        	addFriends();
        	break;
        	
        case 6 :
        	showFriendName();
        	break;
        }
        
        showMenu = retMenu();
    
    }
    sc.close();
    
    
    }

	 /*String users[][] = {{"vincent","aix","38"},{"arnaud","aix","33"},{"cecilia","annecy","31"},{"zouleka", "annemasse", "31"}};
	 String message[][] = {{users[0][0]}, {"Bonjour,", "Comment ça va?"}};*/
    
    /**
     * Demande a l'utilisateur si il faut retourner au menu ou quitter
     * @return : true si on retourne au menu sinon false 
     */
    private  boolean retMenu(){
        System.out.println("Retourner au menu ? ");
        return demanderOuiNon();
    }
    
    private  boolean demanderOuiNon() {
        char r;
        Scanner ret = new Scanner(System.in);
        
        do {
            System.out.println("Continuer O / N");
            r = ret.nextLine().charAt(0);
        } while( r != 'O' && r != 'N');
        if(r == 'O') {
            return true;
        } else {
            return false;
        }
    }
    
    private void showprofil() {
    
        System.out.println("Nom du profil :" + user.getNom());
        System.out.println("ville :" + user.getVille());
        System.out.println("Age de l'utilisateur :" + user.getAge());
        //retMenu();
    }
    
    
    
    private  void updateInfo() {
        
    }
    
    private  void sendMessage() {
		// TODO Auto-generated method stub
		//System.out.println(users[3][0] + message[1]); //refaire la methode
	}
    
    private  void showFriendName() {
		// TODO Auto-generated method stub
		
	}


	private  void addFriends() {
		// TODO Auto-generated method stub
		
	}
}
    

