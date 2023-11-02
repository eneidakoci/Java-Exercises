package seminar4;
import java.util.Scanner;

public class Ush_2b {
/*Vlerat që përsëriten për shembull nëse inputi është 1 3 3 4 5 5 6 6 6 2, programi do të afishojë 3 5 6*/
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Sa numra doni te lexoni?");
		int n = scan.nextInt();  //madhesia
		System.out.println("Jepni "+n+" numrat: ");
		
		String nrTePerseritur=""; //string bosh
		int n1 = scan.nextInt(); 
		int count = 1;//sepse cdo nr ndodhet 1 here
		int remember=0;
		while(count<n) {
			int n2 = scan.nextInt();
			if((n1 == n2 && n2 != remember) || (n1 == 0 && n2==0)) {
				nrTePerseritur += Integer.toString(n1) + " ";
				remember=n1;
			}
			n1 = n2;
			count++;
		}
		System.out.println("Numrat e perseritur jane: "+nrTePerseritur);
		 scan.close();
		}

	}