package seminar3;
import java.util.Scanner;

public class Ush_15 {

	public static void main(String[] args) {
		/*ATM k�rkon PIN p�r tu identifikuar dhe aksesuar llogarin�. N�se p�rdoruesi vendos nj� PIN t�
		gabuar m� shum� se 3 her�, ATM do t� bllokoj� kart�n. Supozoni q� PIN i p�rdoruesit �sht� 1234.
		Nd�rtoni nj� program q� pyet p�rdoruesin p�r PIN jo m� shum� se 3 her�. N�se p�rdoruesi
		vendos PIN-in e sakt� do t� afishohet �PIN �sht� i sakt� dhe programi do t� p�rfundoj�. N�se
		p�rdoruesi vendos nj� PIN t� gabuar, do t� afishohet �PIN jo i sakt� dhe n�se p�rdoruesi ka
		vendosur PIN jo m� shum� se 3 her� mund ta vendosi PIN p�rs�ri. N�se p�rdoruesi ka vendosur
		nj� PIN t� gabuar tre her�, t� afishohet mesazhi �Karta juaj �sht� bllokuar�.*/
		
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