package seminar3;
import java.util.Scanner;
public class Ush_9 {

	public static void main(String[] args) {
		/*Nd�rtoni nj� program q� k�rkon nga p�rdoruesi nj� karakter nga alfabeti dhe m� pas afishon n�se
inputi �sht� zanore apo bashk�ting�llore. N�se inputi nuk �sht� nj� shkronj� t� afishohet mesazh
gabimi. P�rdorni metod�n isLetter t� klas�s Character.*/
		char karakteri;
		System.out.println("Jepni nje karakter:");
		Scanner scan=new Scanner(System.in);
		karakteri=scan.next().charAt(0);
	    switch(karakteri) { 
	    
	        case 'a':   
	            System.out.println("zanore");  
	            break;  
	        case 'e':   
	            System.out.println("zanore");  
	            break;  
	        case 'i':   
	            System.out.println("zanore");  
	            break;  
	        case 'o':   
	            System.out.println("zanore");  
	            break;  
	        case 'u':   
	            System.out.println("zanore");  
	            break; 
	        case '�':   
	            System.out.println("zanore");  
	            break; 
	        case 'y':   
	            System.out.println("zanore");  
	            break; 
	        case 'A':   
	            System.out.println("zanore");  
	            break;  
	        case 'E':   
	            System.out.println("zanore");  
	            break;  
	        case 'I':   
	            System.out.println("zanore");  
	            break;  
	        case 'O':   
	            System.out.println("zanore");  
	            break;  
	        case 'U':
	        	System.out.println("zanore");  
	            break;   
	        case '�':   
	            System.out.println("zanore");  
	            break; 
	        case 'Y':   
	            System.out.println("zanore");  
	            break; 
	            default:   
	            System.out.println("bashketingellore");  

	}

	}
}