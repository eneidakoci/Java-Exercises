package seminarKlasat;
import java.util.*;
public class TestStudentet {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<String> emrat = new ArrayList<>();
		ArrayList<Double> piket = new ArrayList<>();
		System.out.println("Sa emra do te shtoni: ");
		int nr = scan.nextInt();
		System.out.println("Jepni emrin dhe piket e studentit: ");
		for(int i = 0; i<nr; i++) {
			emrat.add(scan.next());
			piket.add(scan.nextDouble());
		}
		Studentet s1 = new Studentet(emrat,piket);
		System.out.println(s1.ktheEmrin());
		s1.hiqStudentin("Beni", 20); //rregullo kete
		System.out.println(s1.ktheEmrin());
		scan.close();
	}

}
