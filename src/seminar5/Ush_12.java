package seminar5;
import java.util.Scanner;
public class Ush_12 {
	/*Nd�rtoni nj� program q� kontrollon n�se nj� fjal�kalim i p�rmbush rregullat e m�poshtme:
� fjal�kalimi duhet t� ket� t� pakt�n 8 karaktere.
� fjal�kalimi duhet t� ket� t� pakt�n nj� shkronj� t� madhe dhe nj� shkronj� t� vog�l
� fjal�kalimi duhet t� ket� t� pakt�n nj� num�r.
Nd�rtoni metodat p�rkat�se. N�se rregullat e fjal�kalimit nuk p�rputhen i k�rkohet p�rdoruesit q�
ti vendos� p�rs�ri t� dh�nat.*/
	
	//metoda
	public static boolean nrKarakteresh(String password) { 
		if(password.length() >= 8) { 
			return true; 
		}
		else { 
			return false;
		}
	}
	
	public static boolean shkronja(String password) { 
		int count_upper = 0;
		int count_lower = 0; 
		for(int i = 0; i < password.length(); i++) { 
			char c = password.charAt(i);
			if(Character.isUpperCase(c) == true) { 
				count_upper++;
			}
			else { 
				count_lower++;
			}
		}
		if(count_upper>=1 && count_lower >= 1) {
			return true;
		}
		else { 
			return false; 
		}
	}
	
	public static boolean numer(String password) { 
		int count_nr = 0; 
		for(int i = 0; i < password.length(); i++) { 
			char c = password.charAt(i);
			if(Character.isDigit(c) == true) { 
				count_nr++;
			}
		}
		if(count_nr > 0) { 
			return true;
		}
		else { 
			return false; 
		}
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		boolean kusht1;
		boolean kusht2;
		boolean kusht3;
		do {
			System.out.print("Jep fjalekalimin: ");
			String pass = in.nextLine(); 
			kusht1 = nrKarakteresh(pass);
			kusht2 = shkronja(pass);
			kusht3 = numer(pass); 
			} while(kusht1 != true || kusht2 != true || kusht3 != true);
		System.out.println("Fjalekalimi u ruajt!");
		in.close();
		}
	}