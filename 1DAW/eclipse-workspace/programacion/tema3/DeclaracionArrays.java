package tema3;

public class DeclaracionArrays {

	public static void main(String[] args) {
		
		String[] names = {"Dani", "Fatima", "David", "Jesus", "Miguel Angel", "Dani Cuenca", "Yolanda"};
		
		for (int i = 0; i<names.length; i++) {
			
			if('D' == names[i].charAt(0)) {
				names[i] = "vacio";
			}
		System.out.println(names[i]);	
		}

	}

}

// ________
// |	  |
// |      O
// |     /|\
// |____ / \
//
//
//
//
//