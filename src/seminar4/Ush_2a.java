package seminar4;
/*Shkruani nj� program q� lexon nj� sekuenc� numrash t� plot� dhe afishon:
a. Shum�n e numrave n� seri si n� shembullin e m�posht�m
N�se inputi �sht� 1 7 2 9 programi duhet t� afishoj� 1 8 10 19*/
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