package seminar4;
import java.util.Scanner;
public class Ush_9 {
/*Ndërtoni një program që lexon një fjalë dhe afishon të gjitha substringjet e fjalëve të renditura
	sipas gjatësisë. Për shembull nëse përdoruesi vendos fjalën “rum”, programi do të afishojë
	r
	u
	m
	ru
	um
	rum*/
	public static void main(String[] args) {
		System.out.println("Jepni nje fjale:");
		Scanner scan = new Scanner(System.in);
		String emri = scan.next();
		
		int N=emri.length();
		for(int i = 1; i<=N; i++) {
			for(int j = N-i; j>=0; j--) {
				System.out.println(emri.substring(j,j+i));
			}
		}
		
scan.close();
	}

}
