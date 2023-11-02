package seminar5;
import java.util.Scanner;
public class Ush_6 {
/*Ndërtoni një metodë statike e cila numëron fjalët në një string str. Fjalën janë të ndara me hapësira
ndërmjet tyre. Përdorni metodën trim() për të hequr hapësirat majtas dhe djathtas inputit dhe
përdorni metodën isEmpty() për të kontrolluar nëse stringu është bosh ose jo.*/
	
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