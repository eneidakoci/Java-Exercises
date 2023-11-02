package seminar10;

public class Punonjes {
	protected String emri;
	protected int paga;
	
	//konstruktori me parametra
	public Punonjes(String emri, int paga) {
		this.emri = emri;
		this.paga = paga;
	}

	//getters & setters
	public String getEmri() {
		return emri;
	}

	public void setEmri(String emri) {
		this.emri = emri;
	}

	public int getPaga() {
		return paga;
	}

	public void setPaga(int paga) {
		this.paga = paga;
	}

	//ne cdo klase i bejme override metodes ToString
	public void ToString() {
		System.out.println("Emri i punonjesit:  "+emri+"\nPaga: "+paga);
	}

}
