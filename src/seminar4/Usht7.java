package seminar4;
import java.util.Scanner;
public class Usht7 {
/*7. Nd�rtoni nj� program i cili pasi merr nj� fjal� nga p�rdoruesi dhe p�rcakton n�se fjala �sht� palindrome ose jo.*/
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); 
		System.out.println("Jepni nje fjale: ");
		String fjale = scan.next();
		String fjale_rev = ""; 
		int size = fjale.length(); 
		for(int i=size-1; i>=0; i--) { 
			char ch = fjale.charAt(i); 
			fjale_rev += Character.toString(ch); 
		}
		
		if(fjale_rev.equalsIgnoreCase(fjale)) { 
			System.out.print("Po eshte palindrome.");
		}
		else { 
			System.out.print("Jo nuk eshte palindrome.");
		}
		
		scan.close();
	}

}
