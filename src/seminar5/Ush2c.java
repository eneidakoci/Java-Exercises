package seminar5;
import java.util.Scanner;
public class Ush2c {
/*Nd�rtoni nj� metod� q� merr si paramet�r nj� num�r dhe kthen
a. Shifr�n e par�*/
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Jepni 1 numer:");	
		int numri=scan.nextInt();
		
		System.out.println("Numri i shifrave eshte :"+nrShifra(numri));
scan.close();
	}

	
	
	
	public static int nrShifra(int n) {
		int count=0;
		while(n!=0) {
			n=n/10;
			count++;
		}
		return count;
	}
}

