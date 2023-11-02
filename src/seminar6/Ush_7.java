package seminar6;

import java.util.Scanner;
public class Ush_7 {/////////ushtrimi 8
/*Nd�rtoni nj� metod� statike boolean-e q� kontrollon n�se element�t e nj�jt� t� dy tabelave
ndodhen n� nj� rradh� t� caktuar (nga e majta n� t� djatht� ose anasjelltas) pa p�rfshir� vlerat e
dublikuara. P�r shembull metoda q� merr si paramet�r dy tabelat 1 4 9 16 9 7 4 9 11 dhe 11 11 7 9 16
4 1 do t� kthej� true.*/
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("Jepni madhesine e tabeles 1: ");
		int N = scan.nextInt();
		int [] tabela1 = new int[N];
		System.out.println("Jepni madhesine e tabeles 2: ");
		int M = scan.nextInt();
		int [] tabela2 = new int[M];
		System.out.println("Jepni elementet e tabeles 1: ");
		for(int i=0; i<N; i++) {   //cikel for per leximin e numrave
			tabela1[i]=scan.nextInt();
		}
		System.out.println("Jepni elementet e tabeles 2: ");
		for(int j=0; j<N; j++) {   
			tabela2[j]=scan.nextInt();
		}
		boolean rezultati=aJaneTeNjejta(tabela1, tabela2);
		if(rezultati==true) {
			System.out.println("Jane te njejta.");
		}else
			System.out.println("Nuk jane te njejta.");
		
scan.close();
	}
	
	public static boolean aJaneTeNjejta(int[] tab1, int [] tab2) {
		for(int i=0; i<tab1.length; i++) {   
			for(int j=0; j<tab2.length; j++) {   
			if(tab1[i]==tab2[j]) {
				return true;
			}else
				return false;
		}
		
		}
		return false;
		

	}

}
