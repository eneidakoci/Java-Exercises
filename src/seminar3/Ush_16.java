package seminar3;
import java.util.Scanner;

public class Ush_16 {

	public static void main(String[] args) {
		/*16.Një supermarket jep kupona në varësi se sa ka shpenzuar konsumatori në blerje. Ndërtoni një
program që llogarit dhe afishon vlerën e kuponit bazuar në blerjen në supermarket sipas tabelës
së mëposhtme.*/
		
		Scanner scan=new Scanner(System.in);
		double shpenzimet,kuponi=0;
		System.out.println("Sa keni shpenzuar ne kete blerje? ");
		shpenzimet=scan.nextDouble();
		if(shpenzimet<10) {
			kuponi=0;
		}
		else if((shpenzimet>=10) && (shpenzimet<=60)) {
			kuponi=shpenzimet*0.08;
		}
		else if((shpenzimet>60) && (shpenzimet<=150)) {
			kuponi=shpenzimet*0.1;
		}
		else if((shpenzimet>150) && (shpenzimet<=210)) {
			kuponi=shpenzimet*0.12;
		}
		else if(shpenzimet>210) {
			kuponi=shpenzimet*0.14;
		}
		System.out.println("Kuponi juaj ka vleren: "+kuponi);
	}

}