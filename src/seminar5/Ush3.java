package seminar5;
import java.util.Scanner;
public class Ush3 {
	/* Ndërtoni një metodë statike që merr si parametër një String dhe kthen një String që përmban
karakterin e mesit nëse stringu ka karaktere tek dhe kthen të dy karakteret e mesit nëse stringu ka
karaktere cift.*/
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
        System.out.println("Jepni nje string: ");
        String str = scan.nextLine();
        System.out.print("Karakteri i mesit: " + char_i_mesit(str)+"\n");
    scan.close();
	}

	
	public static String char_i_mesit(String str) {
		int pozicioni;
        int gjatesia;//e stringut
        if (str.length() % 2 == 0){ //nqs gjatesia e stringut eshte cift, do ktheje 2 karakteret e mesit
        	pozicioni = str.length()/2 - 1;
        	gjatesia = 2;
        }
        else{
        	pozicioni = str.length() / 2;
        	gjatesia = 1;
        }
        return str.substring(pozicioni, pozicioni + gjatesia);
    }
}


 
        
