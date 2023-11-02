package seminar6;
import java.util.Scanner;
public class Ush_1 {
/*Ndërtoni një program që mbush tabelën me 10 numra të rastësishëm të ndryshëm midis 1 dhe 100.*/
	public static void main(String[] args) {
		
		Scanner scan= new Scanner(System.in);
		double[] tabela = new double [10];//deklarojme tabelen 
		System.out.println("Jepni 10 numrat:");
		for(int i=0; i<10; i++) {   //cikel for per leximin e numrave
			tabela[i]=scan.nextDouble();
		}
		System.out.println("Numrat qe ju dhate jane: ");
		for(int i=0; i<10; i++) {      //cikel for per afishimin e numrave
			System.out.print(tabela[i]+" ");
		}
scan.close();
	}

}
