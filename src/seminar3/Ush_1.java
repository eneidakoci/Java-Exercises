package seminar3;
import java.util.Scanner;
public class Ush_1 {

	public static void main(String[] args) {
		/* 1.Ndërtoni një program që lexon një numër të plotë dhe afishon nëse numri është pozitiv, negative
		ose i barabartë me zero. Përdorni if të kushtëzuar.*/
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