package seminar9;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Ush1 {

	public static void main(String[] args) throws FileNotFoundException {
		PrintWriter outputFile = new PrintWriter("hello.txt"); //i themi programit se me ke skedar do punojme
		outputFile.println("Hello World!");//te ky skedar do vendoset teksti "Hello World!"
		outputFile.close();  //dhe mbyllim skedarin
		
		File inputFile = new File("hello.txt"); //tani do lexojme cfare kemi shkruar te skedari
		Scanner in = new Scanner(inputFile);  //lexojme me ane te klases Scanner dhe brenda kllapave vendosim emrin e skedarit, jo system.in
		                                     //sepse nuk do e editojme kete skedar, vetem lexojme ne console se cfare eshte shkruar
		String a = "";//deklarojme nje string bosh i cili do mbaje secilin rresht te skedari
		
		while(in.hasNext()) {
			a = in.nextLine();
		}
		System.out.println(a);
		in.close();
	}

}
