package seminar4;
import java.util.Scanner;

public class Ush_1b {
/*Shumën e numrave tek të shifrave të dhëna nga përdoruesi. Për shembull nëse inputi është
	32677, shuma e numrave do të ishte 3+7+7=17.*/
	public static void main(String[] args) {
		System.out.println("Jepni nje numer: ");
		Scanner scan=new Scanner(System.in);
		int nr=scan.nextInt();
		int shuma_e_NrTek=0;
		while(nr>0) {
			int shifra=nr%10;   //mbetja e pjesetimit me 10 jep shifren e fundit
			if(shifra % 2 !=0){
				shuma_e_NrTek+=shifra;
			}
			nr/=10;  //numri pjesetohet me 10 per te kaluar te shifra tjeter
		}
		System.out.println("Shuma e shifrave tek te numrit eshte: "+shuma_e_NrTek);
		 scan.close();
	}

}
