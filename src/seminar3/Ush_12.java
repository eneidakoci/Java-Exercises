package seminar3;
import java.util.Scanner;
public class Ush_12 {

	public static void main(String[] args) {
		/*Nj� vit me 366 dit� quhet nj� vit i brisht�. Vitet e brishta jan� t� nevojshme p�r t� mbajtur
kalendarin e sinkronizuar me diellin, pasi toka rrotullohet rreth diellit nj� her� n� 365.25 dit�. Q�
nga kalendari Gregorian n� 15 Tetor 1582 nj� vit nuk �sht� nj� vit i brisht� n�se plot�pjestohet me
100, megjithat� ai �sht� nj� vit i brisht� n�se plot�pjestohet me 400. Vitet e brishta plot�pjestohen me 4. 
Shkruani program q� k�rkon nga p�rdoruesi nj� vit dhe m� pas afishon n�se
viti �sht� i brisht� ose jo.
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