package seminar7;

import java.util.*;
/* Ndërtoni një program i cili pasi lexon disa Stringje nga përdoruesi i rendit ato nga ana leksikore
duke i vendosur në vendin e duhur në një arraylist. Përdoruesi përcakton fundin e stringjeve
nëpërmjet numrit -1.
Për shembull nëse stringjet janë:Sonja, Ralf, Tani, Artan

Atëherë arraylist duhet të rritet si më poshtë:
[Empy]
[Sonja]
[Ralf, Sonja]
[Ralf, Sonja,Tani]
[Artan, Ralf, Sonja,Tani]*/
public class Ush8 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		Scanner scan = new Scanner (System.in);
		System.out.println("Jepni elementet e listes: ");
		
		
		
//		String i=scan.next();
//		while(list.get(i) != "-1") {
//			list.add(scan.next());
//		}
		
		
//		for(int i=0; i<list.size()-1; i++) {
//			System.out.println(list.get(i)+" "+list.get(i+1));
//		}
		scan.close();
	}
	
}


