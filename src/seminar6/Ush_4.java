package seminar6;
import java.util.Scanner;
public class Ush_4 {
/*Nd�rtoni nj� metod� q� merr si paramet�r nj� tabel� dhe heq vler�n m� t� vog�l nga nj� tabel� e
mbushur pjes�risht. Testoni metod�n.*/
	
	public static void main(String[] args) {
		System.out.println("Jepni elementet: ");
		Scanner scan=new Scanner(System.in);
		int[] T = new int [100];
		T[0]=scan.nextInt();
		int count=1;
		while(scan.hasNextInt()) {
			T[count]=scan.nextInt();
			count++;
		}
hiqMin(T,count);
	}

	public static void hiqMin(int [] A,int count) {//count me sa vlera eshte mbushur tabela 
		int min=A[0];
		int poz=0;
		for(int i=1; i<count; i++) {
			if(min>A[i]) {
				min=A[i];
				poz=i;
			}
		}
		for(int i=poz; i<count; i++) {
			A[i]=A[i+1];
		}
		for(int i=0; i<count-1; i++) {//count-2 sepse i hoqem nje vlere tabeles
			System.out.println(A[i]+" ");
			
		}
	}
}
