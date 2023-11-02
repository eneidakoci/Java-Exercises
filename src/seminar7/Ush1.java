package seminar7;
import java.util.*; //paketa java util me * qe perfshin gjithe klasat
public class Ush1 {
/*1. Ndërtoni një program që vendos në array list 10 numra të rastësishëm nga 1 deri tek 10. Për të
gjeneruar këtë, ju duhet të mbushni një tabelë me numra nga 1 deri në 10 duke pasur parasysh që
dy vlera në tabelë nuk duhet të jenë të njëjta. */

	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<Integer>(); //deklarimi i arraylist i tipit integer me emrin numbers 
		ArrayList<Integer> random = new ArrayList<Integer>();//Integer eshte wrapper class
		for(int i=0; i<10; i++) {
			numbers.add(i+1); //qe te marre 10 numra
		}
		for(int i=0; i<10; i++) {
			int num = (int)(Math.random()*numbers.size());//type casting per ta kthyer nga double ne int
			random.add(numbers.get(num));
			numbers.remove(num);
		}
		System.out.print(random);
	
	}

}
