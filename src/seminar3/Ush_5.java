package seminar3;
import java.util.Scanner;
public class Ush_5 {

	public static void main(String[] args) {
		/*Nd�rtoni nj� program q� konverton vler�simin me shkronja n� vler�sim me num�r. Shkronjat jan�
A, B, C, D dhe F e ndjekur nga + ose -. Vlerat numerike jan� 4,3,2,1, dhe 0. F+ ose F- nuk ekzistojn�.
+ e rrit vler�n numerike me 0.3 nd�rsa � e zvog�lon vler�n me 0.3. gjithsesi A+ ka vler�n 4.0.

Jepni nj� shkronj�: B-
Vlera numerike �sht� 2.7*/
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
