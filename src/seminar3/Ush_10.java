package seminar3;
import java.util.Scanner;
public class Ush_10 {

	public static void main(String[] args) {
		/* Ndërtoni një program që kërkon nga përdoruesi të vendosi muajin (1 për Janar, 2 për Shkurt etj.)
dhe më pas afishon numrin e ditëve në atë muaj. Për muajin shkurt të afishohet 28 ose 29 ditë.*/
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