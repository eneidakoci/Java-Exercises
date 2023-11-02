package seminar3;
import java.util.Scanner;
public class Ush_11 {

	public static void main(String[] args) {
		/* Ndërtoni një program që llogarit taksën sipas skedës së mëposhtme. */
		Scanner scan=new Scanner(System.in);
		String status;//statusi==martuar || single
		double TR,tax=0.0;//TR==te ardhurat
		System.out.println("Jepni statusin single ose martuar: ");
		status=scan.next();
		System.out.println("Jepni te ardhurat: ");
		TR=scan.nextDouble();
		if(status.equalsIgnoreCase("single")) {
			if((TR>0) && (TR<8000)) {
			tax=TR*0.1;
		}else if((TR>8000) && (TR<32000)) {
			tax=800+0.15*TR;
		}else if(TR>32000) {
			tax=4400+TR*0.25;
		}else {
			System.out.println("Te dhenat jane gabim.");
		}
		
		}else if(status.equalsIgnoreCase("martuar")) {
			if((TR>0) && (TR<16000)) {
			tax=TR*0.1;
		}else if((TR>16000) && (TR<64000)) {
			tax=1600+TR*0.15;
		}else if(TR>64000) {
			tax=8800+TR*0.25;
		}
		
		}
		
		System.out.println("Taksa sipas te ardhurave eshte: "+tax);

	}

}
