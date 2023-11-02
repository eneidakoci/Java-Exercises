package seminar5;

import java.util.Scanner;

public class Ush6 {
	/*Ndërtoni një metodë statike e cila numëron fjalët në një string str. Fjalën janë të ndara me hapësira
	ndërmjet tyre. Përdorni metodën trim() për të hequr hapësirat majtas dhe djathtas inputit dhe
	përdorni metodën isEmpty() për të kontrolluar nëse stringu është bosh ose jo.*/
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
