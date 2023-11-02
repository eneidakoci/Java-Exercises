package seminar3;
import java.util.Scanner;
public class Ush_9 {

	public static void main(String[] args) {
		/*Ndërtoni një program që kërkon nga përdoruesi një karakter nga alfabeti dhe më pas afishon nëse
inputi është zanore apo bashkëtingëllore. Nëse inputi nuk është një shkronjë të afishohet mesazh
gabimi. Përdorni metodën isLetter të klasës Character.*/
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
	        case 'ë':   
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
	        case 'Ë':   
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