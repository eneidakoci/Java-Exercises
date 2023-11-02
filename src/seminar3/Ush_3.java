package seminar3;
import java.util.Scanner;
public class Ush_3 {

	public static void main(String[] args) {
		/*Ndërtoni një program që lexon nga përdoruesi tre numra dhe kontrollon nëse numrat janë në
rendin zbritës, rendin rritës, ose asnjëra nga alternativat.*/
int n1,n2,n3;
System.out.println("Jepni 3 numra:");
Scanner scan=new Scanner(System.in);
n1=scan.nextInt();
n2=scan.nextInt();
n3=scan.nextInt();
if(n1>n2 && n1>n3 && n2>n3) {
	System.out.println("Numrat jane dhene ne rendin zbrites.");
} else if (n1<n2 && n1<n3 && n2<n3) {
	System.out.println("Numrat jane dhene ne rendin rrites.");
}else {
	System.out.println("Numrat nuk jane ne rendin rrites apo zbrites.");
}
	}

}
