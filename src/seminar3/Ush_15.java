package seminar3;
import java.util.Scanner;

public class Ush_15 {

	public static void main(String[] args) {
		/*ATM kërkon PIN për tu identifikuar dhe aksesuar llogarinë. Nëse përdoruesi vendos një PIN të
		gabuar më shumë se 3 herë, ATM do të bllokojë kartën. Supozoni që PIN i përdoruesit është 1234.
		Ndërtoni një program që pyet përdoruesin për PIN jo më shumë se 3 herë. Nëse përdoruesi
		vendos PIN-in e saktë do të afishohet “PIN është i saktë” dhe programi do të përfundojë. Nëse
		përdoruesi vendos një PIN të gabuar, do të afishohet “PIN jo i saktë” dhe nëse përdoruesi ka
		vendosur PIN jo më shumë se 3 herë mund ta vendosi PIN përsëri. Nëse përdoruesi ka vendosur
		një PIN të gabuar tre herë, të afishohet mesazhi “Karta juaj është bllokuar”.*/
		
		int pin=1234;
		int counter=0;
		int pin2;
		System.out.println("Jepni PIN-in: ");
		Scanner scan=new Scanner(System.in);
		pin2=scan.nextInt();
		
		if(pin==pin2) {
			System.out.println("PIN eshte i sakte.");
		
		} 
		
		while(pin!=pin2 && counter<2) {
			System.out.println("PIN nuk eshte i sakte. Provoni perseri.");
			counter++;
			pin2=scan.nextInt(); 
			if(pin==pin2) {
				counter=2;
			}
		}
		if(pin!=pin2) {
			System.out.println("Karta juaj eshte bllokuar.");
			
		}
		if(pin==pin2) {
			System.out.println("PIN eshte i sakte.");
		
		}
		
	}

}