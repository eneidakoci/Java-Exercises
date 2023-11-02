package seminarKlasat;
/*Implementoni një klasë Product. Një produkt ka një emër dhe një çmim, për shembull neë Product
(“Tost”, 29.95). Ndërtoni metodat getName, getPrice dhe reducePrice. Ndërtoni një program
ProductPrinter i cili do afishojë emrin dhe çmimin e dy produkteve, do të reduktojë çmimin e tyre
me 5$ dhe do të afishojë përsëri çmimet e tyre.*/

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
