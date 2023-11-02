package seminar4;
import java.util.Scanner;
public class USh_13 {
/*Ndërtoni një program që lexon një numër të plotë nga përdoruesi dhe duke përdorur yjet, shfaq
një romb.*/
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in); 
		System.out.println("Jepni nje numer te plote:");
	    int n=scan.nextInt();
	  	    
	    for (int i = 1; i <=n; i=i+2) { //per pjesen e siperme te rombit
	     for (int j = n-i; j >=1; j--) {
	      System.out.print(" ");
	     }
	     for (int k = 1; k <=i; k++) { 
	      System.out.print("* ");  
	     }
	     System.out.println(""); 
	    } 
	    for (int i = 1; i <=n-2; i=i+2) {
	       for (int j = 1; j <=i; j++) {
	      System.out.print(" ");
	       }
	     //e njejta logjike per pjesen e poshtme te rombit
	       for (int k = i; k <=n-2; k++) {
	      System.out.print(" *");
	       }
	     System.out.println("");
		scan.close();

	    }

}
}
