package seminar3;
import java.util.Scanner;
public class Ush_2 {

	public static void main(String[] args) {
		/*2.c Ndërtoni një program që lexon një numër të plotë pozitiv ose negativ dhe kontrollon sa shifra
numri ka duke kontrolluar nëse numri >=10, >=100 e kështu me rradhë deri kur numri të jetë më i
madh se 100000.*/
		int n,counter=0;
		System.out.println("Jepni nje numer:");
		Scanner scan=new Scanner(System.in);
		n=scan.nextInt();
		while(n!=0) {
			counter++;
			n/=10;
		}
System.out.println("Ky numer ka "+counter+" shifra.");
	}

}