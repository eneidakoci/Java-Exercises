package seminar4;
import java.util.Scanner;
public class Ush_9 {
/*Nd�rtoni nj� program q� lexon nj� fjal� dhe afishon t� gjitha substringjet e fjal�ve t� renditura
	sipas gjat�sis�. P�r shembull n�se p�rdoruesi vendos fjal�n �rum�, programi do t� afishoj�
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
