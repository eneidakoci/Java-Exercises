package seminar3;
import java.util.Scanner;
public class Ush_5 {

	public static void main(String[] args) {
		/*Ndërtoni një program që konverton vlerësimin me shkronja në vlerësim me numër. Shkronjat janë
A, B, C, D dhe F e ndjekur nga + ose -. Vlerat numerike janë 4,3,2,1, dhe 0. F+ ose F- nuk ekzistojnë.
+ e rrit vlerën numerike me 0.3 ndërsa – e zvogëlon vlerën me 0.3. gjithsesi A+ ka vlerën 4.0.

Jepni një shkronjë: B-
Vlera numerike është 2.7*/
		String nota;
		System.out.println("Jepni noten si shkronje:");
		Scanner scan=new Scanner(System.in);
		nota=scan.next();
	
		switch(nota) {
		case "A": System.out.println("4.0");
		break;
		case "A+": System.out.println("4.0");
		break;
        case "A-": System.out.println("3.7");
		break;
		case "B": System.out.println("3.0");
		break;
        case "B+": System.out.println("3.3");
		break;
        case "B-": System.out.println("2.7");
		break;
		case "C": System.out.println("2.0");
		break;case "C+": System.out.println("2.3");
		break;
        case "C-": System.out.println("1.7");
		break;
		case "D": System.out.println("1.0");
		break;case "D+": System.out.println("1.3");
		break;
        case "D-": System.out.println("0.7");
		break;
		case "F": System.out.println("0.0");
		break;
		}
			
	}

}
