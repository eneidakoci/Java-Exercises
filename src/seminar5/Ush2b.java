package seminar5;

import java.util.Scanner;

public class Ush2b {
//Shifrën e fundit
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Jepni 1 numer:");	
		int numri=scan.nextInt();
		
		System.out.println("Shifra e fundit e numrit eshte :"+shifraFundit(numri));
scan.close();
	}

	
	
	
	public static int shifraFundit(int n) {
		return n%10;
	}

	}


