package perjashtimet;
import java.util.*;
public class Exc3 {
 static void checkAge(int age) {
	if(age<18) {
		throw new ArithmeticException("Aksesi nuk lejohet");
	}else {
		System.out.println("Aksesi lejohet");
	}
}
	public static void main(String[] args) {
		//Scanner in = new Scanner(System.in);
//		int mosha;
//		mosha = in.nextInt();
		checkAge(15);
		//in.close();

	}

}
