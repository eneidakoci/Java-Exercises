package seminar5;
import java.util.Scanner;

public class Ush1_d {
/*boolean sorted (double x, double y, double z) kthen true nëse të gjitha vlerat janë të
renditura duke filluar nga më e vogla.*/
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Jepni 3 numra:");	
double a=scan.nextDouble();
double b=scan.nextDouble();
double c=scan.nextDouble();
boolean teRenditur=sorted(a,b,c);
System.out.println(teRenditur);
scan.close();
	}



   public static boolean sorted(double x, double y, double z) {
	   if(x<y && x<z && y<z) {
		   return true;
	   }else {
		   return false;
	   }
   }

	}


