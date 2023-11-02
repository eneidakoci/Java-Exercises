package seminar3;
import java.util.Scanner;
public class Ush_4 {

	public static void main(String[] args) {
		/*Ndërtoni një program i cili lexon nga përdoruesi kater numra dhe afishon dy çifte nëse gjenden dy
cifte që përputhen dhe jo dy çifte në të kundërt. Për shembull:

1 2 2 1 Dy çifte
1 2 2 3 Jo çifte
2 2 2 2 Dy çifte*/

		int n1,n2,n3,n4;
		System.out.println("Jepni 4 numra:");
		Scanner scan=new Scanner(System.in);
		n1=scan.nextInt();
		n2=scan.nextInt();
		n3=scan.nextInt();
		n4=scan.nextInt();
		if((n1==n2 || n1==n3 || n1==n4) && (n2==n3 || n2==n4 )) {
			System.out.println("Dy cifte");
			
		}else if((n1==n2 || n1==n3 || n1==n4) && (n3==n4)) {
			System.out.println("Dy cifte");
		}else {
			System.out.println("Jo cifte");
		}
	}

}