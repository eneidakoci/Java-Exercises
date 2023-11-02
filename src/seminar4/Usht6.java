package seminar4;
import java.util.Scanner;
public class Usht6 {
/*Shkruani një program i cili lexon disa vlera me presje. Kur përdoruesi përcakton
fundin e vlerave, afishon mesataren dhe devijimin standart. Mesatarja e numrave x1, ......xn eshtë
*/
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); 
		int count = 0; 
		double shume = 0;
		double shume_katroresh = 0; 
		while(scan.hasNextDouble()) { 
			double nr = scan.nextDouble();
			shume += nr; 
			count++; 
			shume_katroresh += Math.pow(nr, 2); 
		}
		double mes = shume/count; 
		double gabimi = Math.sqrt((shume_katroresh - ((1/count)*Math.pow(shume, 2))/(count-1)));
		System.out.print("Mesatarja eshte: "+mes+"\nGabimi eshte: "+gabimi);
		scan.close();
	}

}
