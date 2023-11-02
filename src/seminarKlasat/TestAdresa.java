package seminarKlasat;

import java.util.Scanner;

public class TestAdresa {

	public static void main(String[] args) {
		//krijojme 2 objektet e klases Adresa
		Adresa adr1= new Adresa(355, " Sami Frasheri ", " Tirane ", " Shqiperi ", 2107);
		Adresa adr2 = new Adresa(355, "Sami Frasheri", 15, "Tirane", "Shqiperi", 2109);

	
		int kod1 = adr1.getKodi();
		
	
		int kodi2 = adr2.getKodi();
		
		
		System.out.println("Adresa 1 vjen para adreses 2: "+adr1.comesBefore(adr2));
		
		adr2.print(); //afishon te gjithe te dhenat
	}

}
