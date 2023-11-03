package seminar10;

public class Menaxher extends Punonjes {
	protected String departament;

	public Menaxher(String emri, int paga, String departament) {
		super(emri, paga);
		this.departament = departament;
	}
	
	public String getDepartament() {
		return departament;
	}

	public void setDepartament(String departament) {
		this.departament = departament;
	}

	public void ToString() {
		System.out.println("\nEmri i menaxherit:  "+emri+"\nPaga: "+paga+"\nDepartamenti: "+departament);
	}
	
	
	
}
