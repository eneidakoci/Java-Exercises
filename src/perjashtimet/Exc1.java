package perjashtimet;

public class Exc1 {

	public static void main(String[] args) {
	
		try {
			int[] numrat = {1,2,3};
			System.out.println(numrat[10]);
		}catch(Exception e){
			System.out.println("Dicka shkoi keq");
		}

	}

}
