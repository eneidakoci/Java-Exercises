package seminar3;
import java.util.Scanner;
public class Ush_13 {

	public static void main(String[] args) {
		/* Shkruani nj� program i cili i afishon p�rdoruesit pyejtjen : De�shironi t� vazhdoni? dhe lexon
inputin e p�rdoruesit. N�se p�rdoruesi shtyp Po, Y, Yes, OK, Sigurisht afishoni OK. N�se
p�rdoruesi fut t� dh�nat NO, N, JO afisho P�rfundim. P�rndryshe afisho input i gabuar. Programi
nuk duhet t� b�j� dallim n� shkronja t� vogla apo t� m�dha t� p�rdoruesit. Shembull jo �sht�
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