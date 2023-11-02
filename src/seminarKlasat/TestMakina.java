package seminarKlasat;

public class TestMakina {

	public static void main(String[] args) {
		Makina m = new Makina (50); //50 km per liter
		m.addGas(20); // mbushet me 20 litra
		m.drive(100); // 100 km levizje
		double gasLeft =m.getsasiNafte();
		System.out.println("Ka mbetur: "+gasLeft+" nafte.");
	}
}
