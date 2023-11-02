package seminarKlasat;
/*Implementoni nj� klas� Makina me karakteristikat e m�poshtme. Nj� makine ka nj� efi�ienc�
nafte dhe nj� sasi t� caktuar nafte n� motorr. Efi�ienca p�rcaktohet n� kostruktor dhe niveli
fillestar i naft�s �sht� 0. Nd�rtoni nj� metod� drive e cila simulon l�vizjen e makin�s p�r nj�
distanc� t� caktuar, duke zvog�luar sasin� e naft�s n� motorr. Gjithashtu nd�rtoni metodat
getGazInTank, p�r sasin� e mbetur t� naft�s dhe addGas p�r t� shtuar naft�n.
 P�r shembull:
Makina m = new Makina (50); //50 milje per galon
m.addGaz(20); // mbushet me 20 galon
m.drive(100); // 100 milje lecizje
double gasLeft =a.getGasInTank();*/

public class Makina {
	//variablat e instances
	private double eficienca;
	private double sasiNafte;
	
	//konstruktori me parametra
	public Makina(double eficienca) {
		this.eficienca = eficienca;
		this.sasiNafte = 0;
	}
	
	public void addGas(double liter) {
		sasiNafte += liter;
	}
	
	public double getsasiNafte() {
		return sasiNafte;
	}
	public void drive(double km) {
		System.out.println("Makina ka pershkuar "+km+" km.");
		double sasiHarxhuar = (double) km/eficienca;
		sasiNafte -= sasiNafte;
		System.out.println("Makina harxhoi "+sasiHarxhuar+" litra nafte.");
	}
	
	
}
