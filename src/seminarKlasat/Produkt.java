package seminarKlasat;
/*Implementoni nj� klas� Product. Nj� produkt ka nj� em�r dhe nj� �mim, p�r shembull ne� Product
(�Tost�, 29.95). Nd�rtoni metodat getName, getPrice dhe reducePrice. Nd�rtoni nj� program
ProductPrinter i cili do afishoj� emrin dhe �mimin e dy produkteve, do t� reduktoj� �mimin e tyre
me 5$ dhe do t� afishoj� p�rs�ri �mimet e tyre.*/

public class Produkt {

		private String name;
		private double price;
		
		public Produkt(String name, double price) {
			this.name = name;
			this.price = price;
		}
		
		public String getName() {
			return name;
		}
		
		public double getPrice() {
			return price;
		}
		
		public void reducePrice(double redukto) {
			price -= redukto;
		}
		
		public double getReducedPrice() {
			return price;
		}
	
}
