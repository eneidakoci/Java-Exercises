package seminar4;

import java.util.Scanner;
public class Ush_4 {
	/* Nd�rtoni nj� program q� lexon numra dhjetor� nga p�rdoruesi dhe m� pas i afishon p�rdoruesit
mesataren dhe vler�n m� t� vog�l dhe m� t� madhe.*/
	public static void main(String[] args) {
		System.out.println("Sa numra doni te lexoni?");
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		double[] T = new double [n]; 
		double sh=0;
		double max=T[0];
		System.out.println("Jepni "+n+" numrat: ");
		for(int i=0; i<n; i++) {
			T[i]=scan.nextDouble();
			sh+=T[i];
			if(max<T[i]) {
				max=T[i];
			}
			//e njejta gje dhe per minimumin
		}
		double mesatarja=sh/n;
System.out.println("Max: "+max);
		System.out.println("Mesatarja e tyre eshte: "+mesatarja);
		 scan.close();
	}

}
