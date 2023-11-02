package seminar4;
import java.util.Scanner;

public class Ush_1a {
//Shumën e numrave çift midis a dhe b, ku a dhe b merren nga përdoruesi.
	public static void main(String[] args) {
		System.out.println("Jepni dy numra: ");
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();
		int b=scan.nextInt();
		int shuma=0;
		for(int i=a+1; i<b; i++) {    //nuk perfshihet a,b 
			if(i%2==0) {
				shuma=shuma+i;
			}
		}
		System.out.println("Shuma e numrave cift mes "+a+" dhe "+b+" eshte: "+shuma);
		 scan.close();
	}

}