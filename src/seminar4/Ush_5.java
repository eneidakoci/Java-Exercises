package seminar4;
import java.util.Scanner;

public class Ush_5 {
/*Ndërtoni një program që lexon një fjalë nga përdoruesi dhe afishon numrin e zanoreve dhe
karakteret e tij në një rresht të ri.*/
	public static void main(String[] args) {
		System.out.println("Jepni nje emer cfaredo: ");
		Scanner scan=new Scanner(System.in); 
		String emri=scan.next();
		int n=emri.length();//numeron karakteret e stringut
		int count=0;

        for (int i = 0; i < n; i++) {
        	char ch = emri.charAt(i);//kthen nje karakter qe ndodhet te nje indeks i caktuar i stringut
               if (Character.toLowerCase(ch)=='a'||Character.toLowerCase(ch)=='e'||Character.toLowerCase(ch)=='i'||Character.toLowerCase(ch)=='o'||Character.toLowerCase(ch)=='u'||Character.toLowerCase(ch)=='ë' ||Character.toLowerCase(ch)=='y'){
                count++;
                System.out.println(ch);
               }   
        }
       
        System.out.println("Emri qe dhate ka "+count+" zanore.");
scan.close();

	}

}
