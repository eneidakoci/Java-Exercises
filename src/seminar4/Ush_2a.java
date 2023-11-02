package seminar4;
/*Shkruani një program që lexon një sekuencë numrash të plotë dhe afishon:
a. Shumën e numrave në seri si në shembullin e mëposhtëm
Nëse inputi është 1 7 2 9 programi duhet të afishojë 1 8 10 19*/
import java.util.Scanner;
public class Ush_2a {

	public static void main(String[] args) {
		System.out.println("Sa numra ka sekuenca");
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int[] numrat = new int[N];
		int shuma=0;
		System.out.println("Jepni numrat qe doni te mblidhni: ");
		for(int i = 0; i<N; i++) {
			numrat[i]=scan.nextInt();
			shuma+=numrat[i];
			System.out.println(shuma);
		 scan.close();
	}

}
}