package seminar5;
import java.util.Scanner;
public class Ush_11 {
/*Nd�rtoni nj� metod� statike public static double readDouble(String prompt) e cila i shfaq nj� String
p�rdoruesit, lexon numrin dhe m� pas e kthen at�.
P�r shembull:
paga = readDouble (�Ju lutem vendosni pag�n�) ;*/
	
	public static double readDouble(String str) { 
		System.out.print(str+" ");
		Scanner in = new Scanner(System.in);
		double paga = in.nextDouble();
		return paga;
	}
	
	
	public static void main(String[] args) {
		double page = readDouble("Ju lutem vendosni pagen: ");
		System.out.println(page);
		
	}

}

