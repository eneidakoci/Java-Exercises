package seminar5;

import java.util.Scanner;

public class Ush6 {
	/*Nd�rtoni nj� metod� statike e cila num�ron fjal�t n� nj� string str. Fjal�n jan� t� ndara me hap�sira
	nd�rmjet tyre. P�rdorni metod�n trim() p�r t� hequr hap�sirat majtas dhe djathtas inputit dhe
	p�rdorni metod�n isEmpty() p�r t� kontrolluar n�se stringu �sht� bosh ose jo.*/
	public static void main(String[] args) {
		System.out.println("Jepni nje string");
		Scanner in = new Scanner(System.in);
		String fjala = in.nextLine();
		int nr = numero(fjala);
		System.out.println(nr);
	}

	public static int numero(String str) {
	str = str.trim();
	int count;
	if(str.isEmpty()) {
		return 0;
	}
	else{
		count = 1;
		for(int i =0; i<str.length(); i++) {
			char ch = str.charAt(i); 
			if(ch == ' ' && str.charAt(i+1) != ' ') { 
				count++;
		}
	}
	}
	return count;
	
	
	}
}
