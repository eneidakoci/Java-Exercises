package seminar4;
import java.util.Scanner;
public class Ush_11 {
/*Nd�rtoni nj� program q� k�rkon nga p�rdoruesi nj� num�r t� plot� dhe m� pas afishon t� gjith�
faktor�t e tij. P�r shembull n�se p�rdoruesi vendos numrin 150 programi do t� afishoj�
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
