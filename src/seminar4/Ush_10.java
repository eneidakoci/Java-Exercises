package seminar4;
import java.util.Scanner;
public class Ush_10 {
/*Numrat Fibonaci përcaktohen sipas sekuencës
F1 = 1
F2 = 1
Fn = fn-1 + fn-2
Ndërtoni një program që merr nga përdoruesi një numër n dhe afishon n numrat e Fibonacit duke
përdorur algoritmin e mësipërm.
0,1,1,2,3,5,8,13,21...*/
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); 
		System.out.println("Sa numra te serise doni te afishoni?");
		int N;
		//, a=0, b=1, c;  //a: kufiza e pare e serise,   b: kufiza e dyte e serise, c: kufiza pasardhese
		N=scan.nextInt();
//		System.out.print(a+" "+b);
//		for(int i = 2; i < N; i++) {
//			c=a+b;//c=shumen e kufizave paraardhese
//			System.out.print(" "+c);
//			a=b;
//			b=c;
//		}	
		fibonacci(N);
		scan.close();
	}
	public static void fibonacci(int n) {
		int a=0, b=1, c;
		System.out.print(a+" "+b);
		for(int i=2; i<n; i++) {
			c = a+b;
			System.out.print(" "+c);
			a=b;
			b=c;
		}
	}

}
