package seminar7;
import java.util.*;
public class Ush5 {
/*Nd�rtoni nj� program i cili mbush nj� array list me vlera nga p�rdoruesi. P�rdoruesi gjithashtu jep
dy indekse. Programi duhet t� afishoj� array list�n duke hequr nga lista t� gjith� element�t indeksi
i t� cil�ve �sht� midis indeksit m� t� vog�l t� dh�n� nga p�rdoruesi deri tek indeksi m� t� madh.*/
	
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
