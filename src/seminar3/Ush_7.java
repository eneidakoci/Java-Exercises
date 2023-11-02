package seminar3;
import java.util.*;

public class Ush_7 {
	/*Shkruani një program i cili pasi lexon tre Stringje i afishon ato të renditur sipas krahasimit leksikor.

Ju lutem jepni tre stringje:
Charlie
Able
Baker
Inputet e renditur janë:
Able
Baker
Charlie */
	public static void main(String[] args) {
	
		System.out.println("Jepni 3 emrat qe doni te rendisni: ");
		Scanner scan=new Scanner(System.in);
		String emri1;
		String emri2;
		String emri3;
		
		emri1=scan.next();
		emri2=scan.next();
		emri3=scan.next();
		ArrayList<String> arr = new ArrayList<>();
		arr.add(emri3);
		arr.add(emri2);
		arr.add(emri1);
		Collections.sort(arr);
		System.out.println(arr);
		//		
//		if (emri1.compareTo(emri2)>0 && emri3.compareTo(emri2)>0 && emri1.compareTo(emri3)>0) {
//			System.out.println("Te renditura: "+"\n"+emri2+" \n" +emri3+"\n"+emri1);
//		} else if(emri2.compareTo(emri1)>0 && emri3.compareTo(emri1)>0 && emri2.compareTo(emri3)>0) {
//			System.out.println("Te renditura: "+emri1+" \n" +emri3+"\n"+emri2);
//		}
//		else if(emri2.compareTo(emri1)>0 && emri3.compareTo(emri2)>0 && emri3.compareTo(emri1)>0) {
//			System.out.println("Te renditura: "+emri1+" \n" +emri2+"\n"+emri3);
//		}else if(emri2.compareTo(emri3)>0 && emri1.compareTo(emri3)>0 && emri3.compareTo(emri2)>0) {
//			System.out.println("Te renditura: "+emri3+" \n" +emri2+"\n"+emri1);
//		}else if(emri1.compareTo(emri2)>0 && emri3.compareTo(emri2)>0 && emri3.compareTo(emri1)>0) {
//			System.out.println("Te renditura: "+emri2+" \n" +emri1+"\n"+emri3);
//		}else if(emri2.compareTo(emri3)>0 && emri1.compareTo(emri3)>0 && emri2.compareTo(emri1)>0) {
//			System.out.println("Te renditura: "+emri3+" \n" +emri1+"\n"+emri2);
//		}
		}
			
	}