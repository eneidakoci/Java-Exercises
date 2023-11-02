package seminar6;
import java.util.Scanner;
public class Ush_5 {
/*Ndërtoni një program që llogarit shumën alternative të elementëve në tabelë. Për shembull nëse
programi lexon elementët 1 4 9 16 9 atëhërë do të llogarisë vlerën 1 – 4 + 9 – 16 + 9.*/
	
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("Jepni madhesine e tabeles: ");
		int N = scan.nextInt();
		int shuma=0, shenja=1;
		int[] A = new int [N];
		System.out.println("Jepni elementet e tabeles: ");
		for(int i=0; i<N; i++) {
			A[i]=scan.nextInt();
		}
		for(int i=0; i<N; i++) {
			shuma=shuma+A[i]*shenja;
			shenja=shenja*(-1);
			
		}
		
		System.out.println("Shuma alternative e elementeve eshte: "+shuma);
		scan.close();
	}

}
