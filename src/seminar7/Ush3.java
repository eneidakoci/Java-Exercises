package seminar7;
import java.util.*;
public class Ush3 {
/*Nd�rtoni nj� metod� public static ArrayList<Integer> mergeSorted(ArrayList<Integer> a,
ArrayList<Integer> b) q� bashkon dy array lista t� renditura, duke prodhuar nj� array list t� re t�
renditur. N�se a �sht� 1 4 9 16 dhe b �sht� 4 7 9 9 11 at�her� metoda do t� kthej� 1 4 4 7 9 9 9 11 16.*/

	public static ArrayList<Integer> mergeSorted(ArrayList<Integer> a, ArrayList<Integer> b){
		ArrayList<Integer> c = new ArrayList<Integer>();
			for(int i=0; i<a.size(); i++) {
				c.add(a.get(i));
			}
			for(int i=0; i<b.size(); i++) {
				c.add(b.get(i));
			}
		
		int size = a.size() + b.size();
		for(int i=0; i<size; i++) {
			for(int j=i+1; j<size; j++) {
				if(c.get(j) < c.get(i)) {
					int temp=c.get(i);
					c.set(i, c.get(j));
					c.set(j,  temp); //zv temp me j
				}
			}
		}
		return c;
	}
	
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
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
		ArrayList<Integer> bashko = new ArrayList<Integer>();
		bashko=mergeSorted(list1,list2);
		System.out.println(bashko);
		scan.close();
		scanner.close();
	}
}
