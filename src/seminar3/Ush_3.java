package seminar3;
import java.util.Scanner;
public class Ush_3 {

	public static void main(String[] args) {
		/*Nd�rtoni nj� program q� lexon nga p�rdoruesi tre numra dhe kontrollon n�se numrat jan� n�
rendin zbrit�s, rendin rrit�s, ose asnj�ra nga alternativat.*/
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
