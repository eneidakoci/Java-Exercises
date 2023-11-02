package seminar6;
import java.util.Scanner;
public class Ush_6 {
/*Ndërtoni një metodë statike që merr si parametër një tabelë dhe kthen mbrapsht sekuencën e
elementëve. Për shembull nëse metoda thërritet me vlerat 1 4 8 9 16 metoda do të kthejë 16 9 8 4 1.*/
	
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("Jepni madhesine e tabeles: ");
		int N = scan.nextInt();
		int [] tabela= new int[N];
		System.out.println("Jepni elementet e tabeles: ");
		for(int i=0; i<N; i++) {   //cikel for per leximin e numrave
			tabela[i]=scan.nextInt();
		}
		System.out.print("Elementet e tabeles mbrapsht jane:  ");
        reverse(tabela, N);
		
		scan.close();
	}

	
	public static void reverse(int[] T, int N) {
		for(int i=N- 1; i>=0; i--) {   //cikel for per afishimin e numrave ne rend te kundert
			System.out.print(T[i] + " ");
		}
		System.out.println();
	}
}
