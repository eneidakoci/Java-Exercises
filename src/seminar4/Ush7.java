package seminar4;
import java.util.*;
public class Ush7 {
//palindrome apo jo
	public static void main(String[] args) {
		String fjala, fjala_mbrapsht = "";
		System.out.println("Jepni nje fjale:");
		Scanner in = new Scanner(System.in);
		fjala = in.next();
		int size = fjala.length();
		for(int i=size-1; i>=0; i--) {
			char c = fjala.charAt(i);
			fjala_mbrapsht += Character.toString(c);
		}

		if(fjala.equalsIgnoreCase(fjala_mbrapsht)) {
			System.out.println("Eshte palindrome");
		}else
			System.out.println("Nuk eshte palindrome");
	}

}
