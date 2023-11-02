package seminar3;
import java.util.Scanner;
public class Ush_12 {

	public static void main(String[] args) {
		/*Një vit me 366 ditë quhet një vit i brishtë. Vitet e brishta janë të nevojshme për të mbajtur
kalendarin e sinkronizuar me diellin, pasi toka rrotullohet rreth diellit një herë në 365.25 ditë. Që
nga kalendari Gregorian në 15 Tetor 1582 një vit nuk është një vit i brishtë nëse plotëpjestohet me
100, megjithatë ai është një vit i brishtë nëse plotëpjestohet me 400. Vitet e brishta plotëpjestohen me 4. 
Shkruani program që kërkon nga përdoruesi një vit dhe më pas afishon nëse
viti është i brishtë ose jo.
*/
		Scanner scan=new Scanner(System.in);
		System.out.println("Jepni nje vit: ");
		int viti;
		viti=scan.nextInt();
		
		if(((viti%4==0) &&(viti%100!=0)) || (viti%400==0)){
			System.out.println("Vit i brishte. ");
		}else {
			System.out.println("Vit jo i brishte. ");
		}

		
	}

}