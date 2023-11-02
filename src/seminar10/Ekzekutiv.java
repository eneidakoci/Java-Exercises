package seminar10;

public class Ekzekutiv extends Menaxher{
	
	public Ekzekutiv(String emri, int paga, String departament) {
		super(emri, paga, departament);
	}

	public void ToString() {
		System.out.println("\nEmri i menaxherit:  "+emri+"\nPaga: "+paga+"\nDepartamenti: "+departament);
	}

}
