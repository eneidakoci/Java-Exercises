package perseritje;
public class WrapperClasses {

	//Klasat Wrapper jane klasa qe bejne te mundur perdorimin e tipeve te dhenash primitive si tipe referencash
	
	//autoboxing: kthen tipet e te dhenave primitive ne tipe referencash
	//unboxing: e kunderta e autoboxing, kthen nga wrapper class ne primitive data types
	//primitive data types jane me te shpejte se reference data types
	
	//kalimet:
	/*   primitive      .      wrapper
	 * ...................................
	 *   boolean        .      Boolean
	 *   int            .      Integer
	 *   double         .     Double
	 *   char           .      Character*/
	
	public static void main(String[] args) {
		Boolean a = true;
		Integer b = 21;
		Double c = 1.5;
		Character d = 'd';
		
		if(b==21) {
			System.out.println("Po.");
		}

	}

}
