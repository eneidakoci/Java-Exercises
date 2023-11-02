package seminar9;

import java.io.File;
 import java.io.FileNotFoundException;
 import java.io.PrintWriter;
import java.util.Scanner;

 public class UshLiber1
 {
 public static void main(String[] args) throws FileNotFoundException
 {

 // Prompt for the input and output file names

 Scanner console = new Scanner(System.in);
 System.out.print("Input file: ");
 String inputFileName = console.next();
 System.out.print("Output file: ");
 String outputFileName = console.next();
 // Construct the Scanner and PrintWriter objects for reading and writing

 File inputFile = new File(inputFileName);
 Scanner in = new Scanner(inputFile);
 PrintWriter out = new PrintWriter(outputFileName);

 // Read the input and write the output

 double total = 0;

 while (in.hasNextDouble())
 {
 double value = in.nextDouble();
 total = total + value;
 out.printf("%n%8.2f",value);
 }

 out.printf("Total: %8.2f%n", total);

 in.close();
 out.close();
 
 //kur japim si input skedarin hello.txt qe kemi krijuar me pare, atij i behet override dhe tani nuk ruan me vlerat e meparshme
 //nxjerr vetem totali=0.00
 }
}
