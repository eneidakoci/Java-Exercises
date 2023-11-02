package seminar7;
import java.util.*;
public class Ush4 {
/*4. Ndërtoni një metodë që modifikon një Array list me stringje, duke zhvendosur të gjitha stringjet që
fillojnë me shkronjë të madhe në fillim, pa ndryshuar renditjen e elementëve të tjerë.*/
	
	public static ArrayList<String> zhvendos (ArrayList<String> a){
		char s;
		for(int i=1; i<a.size(); i++) {
			s=a.get(i).charAt(0);
			if(Character.isUpperCase(s)) {
				a.add(0, a.get(i)); //do shtohet
				a.remove(i+1);
			}
		}
		return a;
	}
	
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<String> lista=new ArrayList<String>();
		System.out.println("Jepni 5 emra: ");
		int count=1;
		while(count<6) {
			lista.add(scan.next());
			count++;
		}
		ArrayList<String> modifikuar = new ArrayList<String>();
		modifikuar= zhvendos(lista);
		System.out.println(modifikuar);
		scan.close();
	}

}
