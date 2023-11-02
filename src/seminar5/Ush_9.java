package seminar5;
import java.util.Scanner;
public class Ush_9 {
	/*Ndërtoni një metodë rekursive statike ështëPalindromë e cila merr si parametër një string dhe kthen
true nëse stringu është palindromë. Testojeni metodën.*/
	
	//metoda
	public static boolean isPalindrome(String str) {
		if(str.length() <= 1) {  //nqs stringu ka nje shkronje te vetme ose fare afishohet qe eshte palindrome
			return true;
		}
		char c1 = str.charAt(0);
		char c2 = str.charAt(str.length()-1);
		if(c1 != c2) {
			return false;
		}
		String sub = str.substring(1,str.length()-1);
		return isPalindrome(sub); 
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Jepni nje string qe doni te kontrolloni nqs eshte palindrome ose jo.");
		String s1 = in.next();
		in.close();
		System.out.print(isPalindrome(s1));
	}
	
	/////MBRAPSHT STRINGU
	/*public static String reverseString(String str){  
		//checks if the string is empty   
		if(str.isEmpty())  {  
		System.out.println("String is empty.");       
		return str;  
		}   
		else   
		{  
		return reverseString(str.substring(1))+str.charAt(0);  
		}  
		} 
			
			public static void main(String[] args) {
				Scanner in = new Scanner(System.in);
				System.out.print("Jepni nje string qe doni te kontrolloni nqs eshte palindrome ose jo.");
				String s1 = in.next();
				in.close();
				String emriMbrapsht = null;
				try {
					emriMbrapsht = reverseString(s1);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.print(emriMbrapsht);
			}
			*/

}
