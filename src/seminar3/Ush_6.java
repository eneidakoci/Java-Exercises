package seminar3;

import java.util.Scanner;

public class Ush_6 {

	public static void main(String[] args) {
		/*Nd�rtoni nj� program i cili lexon tre numra me presje t� l�vizshme dhe m� pas afishon m� t�
madhin prej tyre. P�r shembull:
Ju lutem jepni tre numra: 4 9 2.5
Numri m� i madh �sht�: 9 */

		float n1,n2,n3;
		System.out.println("Jepni 3 numra:");
		Scanner scan=new Scanner(System.in);
		n1=scan.nextFloat();
		n2=scan.nextFloat();
		n3=scan.nextFloat();
		if(n1>n2 && n1>n3) {
			System.out.println("Numri i pare eshte me i madhi.");
		} else if (n2>n1 && n2>n3) {
			System.out.println("Numri i dyte eshte me i madhi.");
		}else {
			System.out.println("Numri i trete eshte me i madhi.");
		}
		
	}

}