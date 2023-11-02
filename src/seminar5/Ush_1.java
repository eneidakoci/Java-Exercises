package seminar5;
import java.util.Scanner;
public class Ush_1 {
/*Ndërtoni metodat e mëposhtme dhe testojini ato:
a. double average(double x, double y, double z) kthen mësararen e vlerave*/
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Jepni 3 numra:");	
int a=scan.nextInt();
int b=scan.nextInt();
int c=scan.nextInt();
double mes;
mes=average(a,b,c);
System.out.println("Mesatarja eshte: "+mes);
scan.close();
	}



   public static double average(int x, int y, int z) {
	   double mesatarja;
	   mesatarja=(x+y+z)/3.0;
	   return mesatarja;
   }
}
