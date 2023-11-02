package seminar6;
import java.util.Arrays;
import java.util.Scanner;

public class Ush_3 {
/*Ndërtoni metodat e mëposhtme të cilat marrin si paramentër një tabelë dhe :

b. Zëvendëson elementin e parë me të fundit
c. Sposton të gjithë elementët në të djathtë, ndërsa elementin e fundit e vendos në fillim si
për shembull tabela 1 4 9 16 25 do të transformohet në 25 1 4 9 16 25
d. Heq elementin e mesit nëse numri i elementëve të tabelës është tek ose dy elementët e
mesit nëse tabela ka numër çift elementësh
e. Kthen numrin e dytë më të madh në tabelë
f. Kthen true nëse tabela është e renditur në rendin rritës
g. Kthen true nëse tabela përban dy elementë fqinjë të dublikuar
h. Kthen true nëse tabela përmban elementë të dublikuar*/
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

	//b. Zëvendëson elementin e parë me të fundit
	public static void zevendesim (int[] A, int N) {
			int temp=A[0];
			A[0]=A[N-1];
			A[N-1]=temp;
			System.out.print("Tabela e re me nderrimin e pozicioneve: ");
			for(int i=0; i<N; i++) {
				System.out.print(A[i]+" ");
			}
		
	}
	
	/*c. Sposton të gjithë elementët në të djathtë, ndërsa elementin e fundit e vendos në fillim si
	për shembull tabela 1 4 9 16 25 do të transformohet në 25 1 4 9 16 25*/
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
	/*d. Heq elementin e mesit nëse numri i elementëve të tabelës është tek ose dy elementët e
mesit nëse tabela ka numër çift elementësh*/
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
	
	//e. Kthen numrin e dytë më të madh në tabelë
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
	
	
	//f. Kthen true nëse tabela është e renditur në rendin rritës
	public static boolean rendRrites(int[] a, int N) {
		for (int i = 0; i < N-1; i++) {
			if(a[i]>a[i+1]) {
				return false;
			}
		}
		return true;
		
	}

	//h. Kthen true nëse tabela përmban dy elementë fqinjë të dublikuar
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

	
	
	
	
	
	

