package reseau_social;

public class Moderateur extends User {
	
	private static int admin;
	

	public void Moderator() {
		
		admin = 1;
	}
	
	public static int getAdmin() {
		return admin;
	}

	public void setAdmin(int admin) {
		
		this.admin = admin;
	}

	
	
	public static boolean isModerator() {
		
		return true;
	}
	
	
}
