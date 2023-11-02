package seminar5;
import java.util.Scanner;
	public class Ush_5 {
//5.Ndërtoni një metodë statike e cila kthen numrin e zanoreve në një string str.
		
		public static int nrZanoresh(String str) { 
			int count = 0; //per nr e zanoreve 
			for(int i = 0; i < str.length(); i++) { 
				char ch = str.charAt(i);
				if(Character.toLowerCase(ch) == 'a' || Character.toLowerCase(ch) == 'e' || Character.toLowerCase(ch)== 'ë'|| Character.toLowerCase(ch) == 'i' || Character.toLowerCase(ch) == 'o' || Character.toLowerCase(ch) == 'u' || Character.toLowerCase(ch) == 'y') { 
					count++;
					/*OSE NE KETE MENYRE: Character.toLowerCase(fjala.charAt(i))=='a'*/
				}
			}
			return count;
		}
		
		public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
			String s = in.nextLine(); 
			in.close();
			System.out.print("Fjala ka: " + nrZanoresh(s) + " zanore.");

		}
	}


