package reseau_social;

public class Moderateur extends User {

	// modo de niveau 1 : sup message
	private int mod1 = 1;
	// modo de niveau 2 : sup message + users
	private int mod2 = 2;

	public int getMod1() {
		return mod1;
	}

	public void setMod1(int mod1) {
		this.mod1 = mod1;
	}

	public int getMod2() {
		return mod2;
	}

	public void setMod2(int mod2) {
		this.mod2 = mod2;
	}

	public static boolean isModerator() {
		return true;
	}

	private static int mod;

	public Moderateur() {
		mod = 1;
	}

	public static int getMod() {
		return mod;
	}

	public void setMod(int mod) {
		this.mod = mod;
	}

}