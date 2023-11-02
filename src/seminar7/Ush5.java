package seminar7;
import java.util.*;
public class Ush5 {
/*Ndërtoni një program i cili mbush një array list me vlera nga përdoruesi. Përdoruesi gjithashtu jep
dy indekse. Programi duhet të afishojë array listën duke hequr nga lista të gjithë elementët indeksi
i të cilëve është midis indeksit më të vogël të dhënë nga përdoruesi deri tek indeksi më të madh.*/
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<Integer> lista = new ArrayList<Integer>();
		System.out.println("Jepni indeksin e pare: ");
		int i=scan.nextInt();
		System.out.println("Jepni indeksin e dyte: ");
		int j=scan.nextInt();
		System.out.println("Jepni vlerat e array list: ");
		while(scan.hasNextInt()) {
			lista.add(scan.nextInt());
		}
		if(i < j) {
			for(int k=i; k<=j+1; k++) {
				lista.remove(i);
				j--;
			}
		} else {
			for(int k=j; k<=i+1; k++) {
				lista.remove(j);
				i--;
			}
		}
		System.out.println("Lista e re: "+lista);
		scan.close();
	}

}
