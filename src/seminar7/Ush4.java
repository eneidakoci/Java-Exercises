package seminar7;
import java.util.*;
public class Ush4 {
/*4. Nd�rtoni nj� metod� q� modifikon nj� Array list me stringje, duke zhvendosur t� gjitha stringjet q�
fillojn� me shkronj� t� madhe n� fillim, pa ndryshuar renditjen e element�ve t� tjer�.*/
	
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
