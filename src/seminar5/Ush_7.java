 package seminar5;
import java.util.Scanner;
public class Ush_7 {
/*Nd�rtoni nj� metod� rekursive statike reverse e cila merr si paramet�r nj� string dhe kthen
mbrapsht stringun. 
P�r t� kthyer mbrapsht nj� string duhet t� fillohet n� karakterin e dyt�, dhe m�
pas t� shtosh t� parin n� fund. P�r shembull p�r t� kthyer mbrapsht fjal�n flow, s� pari kthejm�
mbrapsht low n� wol dhe m� pas shtojm� f n� fund.*/
	
	public static void reverse(String str) { 
		
		//METODA 1
		/*if(str.isEmpty() == true || str.length() <= 1) { 
			System.out.println(str);
		}
		else{
			System.out.print(str.charAt(str.length()-1));//per te shtuar shkronjen e pare ne fund
			reverse(str.substring(0,str.length()-1));//metoda rekursive
		}*/
		//METODA 2
		/*String nstr=" ";
		for( int i = 0; i<str.length(); i++) {
			char ch=str.charAt(i);
			nstr= ch+nstr; //shton cdo karakter ne fillim te stringut duke afishuar keshtu mbrapsht
		}
		System.out.println(nstr);*/
		
		//METODA 3 
		/*krijojme array me karakteret e stringut dhe i afishojme mbrapsht*/
		 char[] try1 = str.toCharArray();
		 
	        for (int i = try1.length - 1; i >= 0; i--)
	            System.out.print(try1[i]);
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Jepni nje string qe doni te ktheni mbrapsht:");
		String s = in.next();
		reverse(s);
		in.close();
	}

	
}
