package seminar4;
import java.util.Scanner; 

public class Ush_3a {  
/*Shkruani një program që lexon një input si string dhe afishon
a. Vetëm shkronjat e mëdha në një string. (Përdorni metodën isUpperCase)*/
	public static void main(String[] args) {
		
		System.out.println("Jepni nje fjale: ");
	        Scanner scan=new Scanner(System.in);
	        String str= scan.next();//deklarojme dhe lexojme nje string
			 
	        //thirrja e metodes
	        uppercase(str);
	        scan.close();
			     }
			   
	
public static void uppercase(String str) {
	for(int i =0; i<str.length(); i++) {
		if(Character.isUpperCase(str.charAt(i))) {
			System.out.println(str.charAt(i));
		}
	}
}
	
}