package seminar6;
import java.util.Scanner;
public class Ush_2 {
/*Ndërtoni një program që inicializon një tabelë me dhjetë elementë numra random me vlerë nga 1
deri në 10 dhe afishon:
a) Elementët në pozion çift
b) Të gjithë elementët në pozicion të kundërt
c) Elementin e parë dhe elementin e fundit*/
	
	public static void main(String[] args) {
		
	Scanner scan= new Scanner(System.in);
	double[] tabela = new double [10];//deklarojme tabelen 
	System.out.println("10 numrat random:");
	for(int i=0; i<10; i++) {   //cikel for per leximin e numrave
		tabela[i]=(int)(Math.random()*10)+1;  //*10 mqs duam 10 elemente,  +1 sepse vete math.random nuk e arrin kurre 1,10 por do ishte 0-9.
	}
	for(int i=0; i<10; i++) {   //cikel for per leximin e numrave
		System.out.print(tabela[i]+"  ");
	}
	//a)
	System.out.println();
	System.out.print("Elementet ne pozicionet cift jane: ");
	for(int i=0; i<10; i++) {      //cikel for per afishimin e numrave ne pozicion cift
		if(i%2==0)
		System.out.print(tabela[i+1]+" "); //indexi i+1 duke qene se fillojme nga 0
	}
	//b)
	System.out.println(" ");
	System.out.print("Elementet ne rend te kundert jane: ");
	for(int i=9; i>=0; i--) {   //cikel for per afishimin e numrave ne rend te kundert
		System.out.print(tabela[i]+" ");
	}
	//c)
	System.out.println(" ");
	System.out.print("Elementi i pare dhe i fundit: ");
	for(int i=0; i<10; i++) {   
		if(i==0 || i==9)
		System.out.print(tabela[i]+" ");
	}
	
	scan.close();
	}

}
