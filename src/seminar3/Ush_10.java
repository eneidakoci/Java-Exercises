package seminar3;
import java.util.Scanner;
public class Ush_10 {

	public static void main(String[] args) {
		/* Nd�rtoni nj� program q� k�rkon nga p�rdoruesi t� vendosi muajin (1 p�r Janar, 2 p�r Shkurt etj.)
dhe m� pas afishon numrin e dit�ve n� at� muaj. P�r muajin shkurt t� afishohet 28 ose 29 dit�.*/
Scanner scan=new Scanner(System.in);
System.out.println("Jepni nje muaj (1 per Janar, 2 per Shkurt etj...)");
		int muaji;
		muaji=scan.nextInt();
		switch(muaji) {
		
		case 1: System.out.println("Muaji ka 31 dite.");
		break;
		case 2: System.out.println("Muaji ka 28 ose 29 dite.");
		break;
		case 3: System.out.println("Muaji ka 31 dite.");
		break;
		case 4: System.out.println("Muaji ka 30 dite.");
		break;
		case 5: System.out.println("Muaji ka 31 dite.");
		break;
		case 6: System.out.println("Muaji ka 30 dite.");
		break;
		case 7: System.out.println("Muaji ka 31 dite.");
		break;
		case 8: System.out.println("Muaji ka 31 dite.");
		break;
		case 9: System.out.println("Muaji ka 30 dite.");
		break;
		case 10: System.out.println("Muaji ka 31 dite.");
		break;
		case 11: System.out.println("Muaji ka 30 dite.");
		break;
		case 12: System.out.println("Muaji ka 31 dite.");
		break;
		
		}
		
	}

}