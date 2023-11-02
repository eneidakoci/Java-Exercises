package seminar7;
import java.util.*;
public class Ush2 {
/*Ndërtoni një metodë public static ArrayList<Integer> merge (ArrayList<Integer> a,
ArrayList<Integer> b), e cila bashkon dy array lista, duke alternuar elementë nga të dy arraylistat.*/
	
	public static ArrayList<Integer> merge (ArrayList<Integer> a, ArrayList<Integer> b){
		ArrayList<Integer> list3 = new ArrayList<Integer>();
		int c1=0, c2=0;
		while(c1<a.size() || c2<b.size()) {
			if(c1<a.size()) {
				list3.add(a.get(c1));
				c1++;
			}
			if(c2<b.size()) {
				list3.add(b.get(c2));
				c2++;
			}
		}
		return list3;
	}
	
	
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		System.out.println("Jepni elementet e list1: ");
		while(scan.hasNextInt()) {  //while perdoruesi jep nr te plote
			list1.add(scan.nextInt());  //list1 do i shtohen elementet qe jep perdoruesi
		}
		System.out.println("Jepni elementet e list2: ");
		Scanner scanner=new Scanner (System.in);
		while(scanner.hasNextInt()) {
			list2.add(scanner.nextInt());
		}
		scan.close();
		scanner.close();
		ArrayList<Integer> bashko = new ArrayList<Integer>();
		bashko=merge(list1,list2);
		System.out.println(bashko);
	}
}
