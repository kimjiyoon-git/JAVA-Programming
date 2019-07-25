
public class Signleton {

	private static Signleton signleton = new Signleton();
	
	private Singleton() {}
		
		static Signleton getInstance() {
			return signleton;
		}
	}

