package seminar5;
import java.util.Scanner;
public class Ush1_c {
/* boolean allDifferent(double x, double y, double z) kthen true nëse të gjitha vlerat janë të ndryshme*/

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Jepni 3 numra:");	
double a=scan.nextDouble();
double b=scan.nextDouble();
double c=scan.nextDouble();
boolean teNdryshme=allDifferent(a,b,c);
System.out.println(teNdryshme);
scan.close();
	}



   public static boolean allDifferent(double x, double y, double z) {
	   if(x!=y && y!=z && x!=z) {
		   return true;
	   }else {
		   return false;
	   }
   }

	}


