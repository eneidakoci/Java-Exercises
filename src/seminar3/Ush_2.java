package seminar3;
import java.util.Scanner;
public class Ush_2 {

	public static void main(String[] args) {
		/*2.c Nd�rtoni nj� program q� lexon nj� num�r t� plot� pozitiv ose negativ dhe kontrollon sa shifra
numri ka duke kontrolluar n�se numri >=10, >=100 e k�shtu me rradh� deri kur numri t� jet� m� i
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