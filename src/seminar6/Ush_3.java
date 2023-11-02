package seminar6;
import java.util.Arrays;
import java.util.Scanner;

public class Ush_3 {
/*Nd�rtoni metodat e m�poshtme t� cilat marrin si parament�r nj� tabel� dhe :

b. Z�vend�son elementin e par� me t� fundit
c. Sposton t� gjith� element�t n� t� djatht�, nd�rsa elementin e fundit e vendos n� fillim si
p�r shembull tabela 1 4 9 16 25 do t� transformohet n� 25 1 4 9 16 25
d. Heq elementin e mesit n�se numri i element�ve t� tabel�s �sht� tek ose dy element�t e
mesit n�se tabela ka num�r �ift element�sh
e. Kthen numrin e dyt� m� t� madh n� tabel�
f. Kthen true n�se tabela �sht� e renditur n� rendin rrit�s
g. Kthen true n�se tabela p�rban dy element� fqinj� t� dublikuar
h. Kthen true n�se tabela p�rmban element� t� dublikuar*/
public static void main(String [] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Jepni sasine e elementeve te tabeles: ");
		int n = scan.nextInt();
		int [] tabela = new int[n];
		System.out.println("Jepni elementet e tabeles: ");
		for(int i=0; i<n; i++) {
			tabela[i]=scan.nextInt();
		}
		//zevendesim(tabela,n);
		//System.out.println("");
		
		//c
		
		//spostim(tabela,n);
		
		//d
		//hiqMidElement(tabela,n);
		
		//e
		//System.out.println("Numri i dyte me i madh: "+nr2max(tabela,n));  
		
		//f
		boolean rendRr=rendRrites(tabela,n);
		if(rendRr==true) {
			System.out.println("Po, elementet qe dhate jane ne rend rrites."); 
		}else {
			System.out.println("Jo, nuk jane ne rendin rrites."); 
		}
		
		//g
		//boolean elTePerseritur=tePerseritur(tabela);
		//if(elTePerseritur==true) {
			//System.out.println("Po, ka elemente qe perseriten ne tabele.");
		//}else
			//System.out.println("Jo, nuk ka elemente qe perseriten ne tabele.");

	}

	//b. Z�vend�son elementin e par� me t� fundit
	public static void zevendesim (int[] A, int N) {
			int temp=A[0];
			A[0]=A[N-1];
			A[N-1]=temp;
			System.out.print("Tabela e re me nderrimin e pozicioneve: ");
			for(int i=0; i<N; i++) {
				System.out.print(A[i]+" ");
			}
		
	}
	
	/*c. Sposton t� gjith� element�t n� t� djatht�, nd�rsa elementin e fundit e vendos n� fillim si
	p�r shembull tabela 1 4 9 16 25 do t� transformohet n� 25 1 4 9 16 25*/
	public static void spostim (int[] A, int N) {
		int temp=A[0];
		A[0]=A[N-1];
		for(int i=N-1; i>1; i--) {
		A[i]=A[i-1];
		}
		A[1]=temp;
		System.out.print("Tabela e spostuar: ");
		for(int i=0; i<N; i++) {
		System.out.print(A[i]+" ");	
	}
		System.out.println("");
}
	/*d. Heq elementin e mesit n�se numri i element�ve t� tabel�s �sht� tek ose dy element�t e
mesit n�se tabela ka num�r �ift element�sh*/
	/*public static void hiqMidElement (int[] A, int N) {
		int poz=0;
		if (A.length%2==0) {
			for(int i=poz+2; i<N; i++) {
				A[i]=A[i+2];
			}
			N--;
			for(int i=poz+1; i<N; i++) {
				A[i]=A[i+1];
			}
		}else {
			for(int i=poz+1; i<N; i++) {
				A[i]=A[i+1];
		}
		}
		for(int i=0; i<A.length; i++) {
			System.out.print(A[i]+" ");
	}
	}*/
	
	//e. Kthen numrin e dyt� m� t� madh n� tabel�
	public static int nr2max(int [] a, int N) {
		int temp;  
		for (int i = 0; i < N; i++){  
		  for (int j = i + 1; j < N; j++){  
		     if (a[i] > a[j]){  //e rendisim ne rend rrites, dhe afishojme elementin e parafundit
		        temp = a[i];  
		        a[i] = a[j];  
		        a[j] = temp;  
		       }  
		  }  
		}  
	return a[N-2];  //elementi i dyte me i madh
	}
	
	
	//f. Kthen true n�se tabela �sht� e renditur n� rendin rrit�s
	public static boolean rendRrites(int[] a, int N) {
		for (int i = 0; i < N-1; i++) {
			if(a[i]>a[i+1]) {
				return false;
			}
		}
		return true;
		
	}

	//h. Kthen true n�se tabela p�rmban dy element� fqinj� t� dublikuar
	public static boolean tePerseritur(int[] a) {
		
		    for (int i=0; i<a.length; i++){
		        for (int j=i+1; j<a.length; j++){
		            if (a[j]==a[i])
		            	return true;
		        }
		    }
		    return false;
		
	}
	
	
}

	
	
	
	
	
	

