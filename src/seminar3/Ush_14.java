package seminar3;
import java.util.Scanner;

public class Ush_14 {

	public static void main(String[] args) {
		/*Shkruani një program që lexon emrin dhe pagën për orë të një punonjësi. Më pas kërkon orët e
punuara javën e kaluar dhe llogarisni pagesën. Çdo punë jashtë orarit (mbi 40 orë për javë)
paguhet me 150 % të pagës së rregullt.*/
		
		Scanner scan=new Scanner(System.in);
		String emri;
		double ora,p1, paga;
		System.out.println("Jepni emrin tuaj:  ");
		emri=scan.next();
		System.out.println("Jepni pagen per 1 ore: ");
		p1=scan.nextDouble();
		System.out.println("Jepni sa ore keni punuar kete jave: ");
		ora=scan.nextDouble();
		if(ora>40) {
			paga=1.5*p1*ora;
			System.out.println("Paga juaj eshte: "+paga);
		} 
		else {
			paga=p1*ora;
			System.out.println("Paga juaj eshte: "+paga);
		}

	}

}