package seminar7;
import java.util.*; //paketa java util me * qe perfshin gjithe klasat
public class Ush1 {
/*1. Nd�rtoni nj� program q� vendos n� array list 10 numra t� rast�sish�m nga 1 deri tek 10. P�r t�
gjeneruar k�t�, ju duhet t� mbushni nj� tabel� me numra nga 1 deri n� 10 duke pasur parasysh q�
dy vlera n� tabel� nuk duhet t� jen� t� nj�jta. */

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
