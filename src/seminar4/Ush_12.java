package seminar4;
import java.util.Scanner;
public class Ush_12 {
/*Nd�rtoni nj� program q� k�rkon nga p�rdoruesi nj� num�r t� plot� dhe afishon t� gjith� numrat
prim deri tek ai num�r. P�r shembull n�se p�rdoruesi vendos numrin 20, programi do t� afishoj�:

2 3 5 7 11 13 17 19
*/
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	      int i =0;
	      int num =0;
	      
	      String nrPrim = "";// String bosh
	      System.out.println("Jepni nje numer:");
	      int n = scan.nextInt();
	      
	      for (i = 1; i <= n; i++){ 		 		  
	         int counter=0; 		  
	         for(num =i; num>=1; num--){
		      if(i%num==0){
			counter = counter + 1;
		      }
		     }
		 if (counter ==2){
			 nrPrim = nrPrim + i + " ";//Fusim nr prim te stringu
		 }	
	      }
	      
	      System.out.println("Numrat prim nga 1 te "+n+": ");
	      System.out.println(nrPrim);
	      scan.close();

	}

}
