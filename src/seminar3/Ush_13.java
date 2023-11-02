package seminar3;
import java.util.Scanner;
public class Ush_13 {

	public static void main(String[] args) {
		/* Shkruani një program i cili i afishon përdoruesit pyejtjen : Deëshironi të vazhdoni? dhe lexon
inputin e përdoruesit. Nëse përdoruesi shtyp Po, Y, Yes, OK, Sigurisht afishoni OK. Nëse
përdoruesi fut të dhënat NO, N, JO afisho Përfundim. Përndryshe afisho input i gabuar. Programi
nuk duhet të bëjë dallim në shkronja të vogla apo të mëdha të përdoruesit. Shembull jo është
ekuivalente me JO.*/
		//injorohet nqs eshte shkronje e madhe apo e vogel me string1.equalsIgnoreCase(string2)
		System.out.println("Deshironi te vazhdoni?");
		Scanner scan=new Scanner(System.in);
		String inputi;
		inputi=scan.next();
		if((inputi.equalsIgnoreCase("po")) || (inputi.equalsIgnoreCase("y")) || (inputi.equalsIgnoreCase("yes")) || (inputi.equalsIgnoreCase("ok")) || (inputi.equalsIgnoreCase("sigurisht"))) {
			System.out.println("OK");
		}
		
		else if(inputi.equalsIgnoreCase("jo") || inputi.equalsIgnoreCase("no") || inputi.equalsIgnoreCase("n")) {
			System.out.println("Perfundim.");
		}
		else {
			System.out.println("Error.");
		}

	}

}