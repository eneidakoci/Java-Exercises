package seminar5;
import java.util.Scanner;
public class Ush_1b {
/*b. boolean allTheSame (double x, double y, double z) kthen true nëse te gjitha vlerat janë të njëjta*/

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Jepni 3 numra:");	
double a=scan.nextDouble();
double b=scan.nextDouble();
double c=scan.nextDouble();
boolean teNjejta=allTheSame(a,b,c);
System.out.println(teNjejta);
scan.close();
	}



   public static boolean allTheSame(double x, double y, double z) {
	   if(x==y && x==z) {
		   return true;
	   }else {
		   return false;
	   }
   }
}
