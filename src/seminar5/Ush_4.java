package seminar5;
import java.util.Scanner;
public class Ush_4 {
/*Nd�rtoni nj� metod� statike e merr si paramet�r nj� string str dhe nj� num�r n dhe kthen stringun
q� p�rs�ritet n her�.*/
	public static String kthe_n_here(String str, int n) { 
			String s = "";//deklarojme string bosh me emer s
			for(int i = 1; i <= n; i++) { 
				s += str;
			}
			return s;
		}
		
		public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
			System.out.print("Jepni nje fjale: ");
			String s = in.nextLine(); 
			System.out.print("Jepni sa here do perseritet fjala: ");
			int nr = in.nextInt();
			in.close();
			String fjale = kthe_n_here(s,nr);
			System.out.println(fjale);
		}

	

}
