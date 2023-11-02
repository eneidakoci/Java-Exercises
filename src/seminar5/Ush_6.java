package seminar5;
import java.util.Scanner;
public class Ush_6 {
/*Nd�rtoni nj� metod� statike e cila num�ron fjal�t n� nj� string str. Fjal�n jan� t� ndara me hap�sira
nd�rmjet tyre. P�rdorni metod�n trim() p�r t� hequr hap�sirat majtas dhe djathtas inputit dhe
p�rdorni metod�n isEmpty() p�r t� kontrolluar n�se stringu �sht� bosh ose jo.*/
	
   public static int nrFjalesh(String s) { 
	s = s.trim();
	if (s.isEmpty() == true) { 
		return 0; 
	}
	else { 
		int count = 1;
		for(int i = 0; i < s.length(); i++) { 
			char ch = s.charAt(i); 
			if(ch == ' ' && s.charAt(i+1) != ' ') { 
				count++;
			}
		}
		return count;
	}
}

public static void main(String[] args) {
	Scanner in = new Scanner(System.in); 
	System.out.println("Jepni nje fjali.");
	String str = in.nextLine();
	in.close();
	int numer = nrFjalesh(str);
	System.out.println(numer); 

}

}