package seminarKlasat;
/*Implementoni një klasë Makina me karakteristikat e mëposhtme. Një makine ka një efiçiencë
nafte dhe një sasi të caktuar nafte në motorr. Efiçienca përcaktohet në kostruktor dhe niveli
fillestar i naftës është 0. Ndërtoni një metodë drive e cila simulon lëvizjen e makinës për një
distancë të caktuar, duke zvogëluar sasinë e naftës në motorr. Gjithashtu ndërtoni metodat
getGazInTank, për sasinë e mbetur të naftës dhe addGas për të shtuar naftën.
 Për shembull:
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
