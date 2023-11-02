package seminar5;
import java.util.Scanner;
public class Ush2c {
/*Ndërtoni një metodë që merr si parametër një numër dhe kthen
a. Shifrën e parë*/
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

