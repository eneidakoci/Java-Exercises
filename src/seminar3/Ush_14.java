package seminar3;
import java.util.Scanner;

public class Ush_14 {

	public static void main(String[] args) {
		/*Shkruani nj� program q� lexon emrin dhe pag�n p�r or� t� nj� punonj�si. M� pas k�rkon or�t e
punuara jav�n e kaluar dhe llogarisni pages�n. �do pun� jasht� orarit (mbi 40 or� p�r jav�)
paguhet me 150 % t� pag�s s� rregullt.*/
		
		Scanner scan=new Scanner(System.in);
		String emri;
		double ora,p1, paga;
		System.out.println("Jepni emrin tuaj:  ");
		emri=scan.next();
		System.out.println("Jepni pagen per 1 ore: ");
		p1=scan.nextDouble();
		System.out.println("Jepni sa ore keni punuar kete jave: ");
		ora=scan.nextDouble();
		if(ora>40) {
			paga=1.5*p1*ora;
			System.out.println("Paga juaj eshte: "+paga);
		} 
		else {
			paga=p1*ora;
			System.out.println("Paga juaj eshte: "+paga);
		}

	}

}