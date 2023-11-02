package seminar4;
import java.util.Scanner;
public class Ush_11 {
/*Ndërtoni një program që kërkon nga përdoruesi një numër të plotë dhe më pas afishon të gjithë
faktorët e tij. Për shembull nëse përdoruesi vendos numrin 150 programi do të afishojë
2
3
5
5*/
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); 
		System.out.println("Jepni nje numer: ");
		int numer;
	    numer = scan.nextInt();
	     
	      for(int i = 2; i <= numer; i++) {
	         while(numer % i == 0) {
	            System.out.println(i+" ");
	            numer = numer/i;
	         }
	      }
	      if(numer >2) {
	         System.out.println(numer);
	      }
		
		scan.close();

	}

}
