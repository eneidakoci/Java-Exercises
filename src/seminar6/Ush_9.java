package seminar6;
import java.util.Scanner;
public class Ush_9 {
/*Ndërtoni një program që gjeneron një sekuencë prej 20 numra rasti hedhjesh zari dhe afishon
	vlerat duke vendosur në kllapa numrat që përsëriten si më poshtë:
		1 2 (5 5) 3 1 2 4 3 (2 2 2 2) 3 6 (5 5) 6 3 1.*/
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] tabela = new int [20];//deklarojme tabelen 
		
		System.out.println("Jepni elementet e tabeles:");
		for(int i=0; i<20; i++) {   //cikel for per leximin e numrave
			tabela[i]=(int)(Math.random()*6)+1;//mqs lexon 6 nr *6, +1 sepse nuk do e arrinte dot 1 apo 6 pa ate.
		}
		
		hedhjeZari(tabela);//therrasim funksionin hedhjeZari ne main me parameter tabelen
		scan.close();

	}
	
	public static void hedhjeZari(int[] A) {
		for(int i=0; i<19; i++) {
			if(A[i] == A[i+1]) {
				System.out.print("(");
				do {
					System.out.print(A[i]+" "+A[i+1]+" ");
					i++;
				}while(A[i]==A[i+1]);
				System.out.print(")");
			}
			System.out.print(" "+A[i]);
		}
	}
}
	
