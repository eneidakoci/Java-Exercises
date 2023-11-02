package seminar4;
import java.util.Scanner; 

public class Ush_3b {
//Stringun ku të gjitha zanoret janë zëvendësuar nga _ (underscore).
	public static void main(String[] args) {
		
		System.out.println("Jepni nje fjale: ");
		Scanner scan=new Scanner(System.in); 
		String emri=scan.next();
		int n=emri.length();
        
        for(int i=0; i<n; i++) {
			char ch = emri.charAt(i);
			if(Character.toLowerCase(ch)=='a' || Character.toLowerCase(ch)=='e' || Character.toLowerCase(ch)=='ë' ||Character.toLowerCase(ch)=='i' ||Character.toLowerCase(ch)=='o' ||Character.toLowerCase(ch)=='u' ||Character.toLowerCase(ch)=='y') {
				emri=emri.replace(ch, '_');
			}
			
        }
        System.out.print(emri);
        scan.close();
	}
}
