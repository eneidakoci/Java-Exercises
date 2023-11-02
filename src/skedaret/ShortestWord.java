package skedaret;
import java.io.*;
import java.util.*;
public class ShortestWord {

	public static void main(String[] args) throws FileNotFoundException {
	new ShortestWord().findShortest();//afishon "of"

	}

	public void findShortest() throws FileNotFoundException {
		String shortest = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
		String current;
		Scanner in = new Scanner(new File("hello.txt"));//Hello people of earth!
		while(in.hasNext()) {
			current = in.next();
			if(current.length() < shortest.length()) {
				shortest = current;
			}
		}
		System.out.println(shortest);
	}
}
