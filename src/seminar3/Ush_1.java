package seminar3;
import java.util.Scanner;
public class Ush_1 {

	public static void main(String[] args) {
		/* 1.Nd�rtoni nj� program q� lexon nj� num�r t� plot� dhe afishon n�se numri �sht� pozitiv, negative
		ose i barabart� me zero. P�rdorni if t� kusht�zuar.*/
		int n;
		System.out.println("Jepni nje numer: ");
		Scanner scan=new Scanner(System.in);
		n=scan.nextInt();
		if(n>0) {
			System.out.println("Numri eshte pozitiv.");
		}else if(n==0) {
			System.out.println("Numri eshte zero.");
		}else if(n<0){
			System.out.println("Numri eshte negativ");
		}
		
	}

}