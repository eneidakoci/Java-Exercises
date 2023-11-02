package seminarKlasat;
/*Ush 1: Implementoni një klasë Adresa. Një adresë ka numrin, rrugën, numrin e apartamentit (opsional),
qytetin, shtetin dhe kodin postar ndërtoni dy konstruktorë: një me numrin e apartamentit dhe
tjetri pa të. Ndërtoni metodën print që afishon të dhënat. Ndërtoni një metodë method public
boolean comesBefore(Address other) që teston nëse kjo adresë vjen përpara adresës tjetër, duke
u nisur nga kodi postar.*/

public class Adresa {

	//variablat e instances
	private int numri;
	private String rruga;
	private int nrApartamentit;
	private String qyteti;
	private String shteti;
	private int kodiPostar;
	
	//krijimi i konstruktorit me numrin e apartamentit
	public Adresa(int numri, String rruga, int nrApartamentit, String qyteti, String shteti, int kodiPostar) {
		this.rruga = rruga;
		this.nrApartamentit = nrApartamentit;
		this.qyteti = qyteti;
		this.shteti = shteti;
		this.kodiPostar = kodiPostar;
	}
	//krijimi i konstruktorit pa numrin e apartamentit
	public Adresa(int numri, String rruga, String qyteti, String shteti, int kodiPostar) {
		this.rruga = rruga;
		this.qyteti = qyteti;
		this.shteti = shteti;
		this.kodiPostar = kodiPostar;
	}
	
	public void setKodPost(int p) {
		kodiPostar=p;
	}
	//int numri, String rruga, int nrApartamentit, String qyteti, String shteti, int kodiPostar
	public void print() {
		System.out.println("Numri: "+numri+"  Rruga: "+rruga+"  Numri i Apartamentit: "+nrApartamentit+"  Qyteti: "+qyteti+"  Shteti: "+shteti+"  Kodi Postar: "+kodiPostar);
	}
	//get per kodin postar
	public int getKodi() {
		return kodiPostar;
	}
	
	public boolean comesBefore(Adresa tjeter) {
		if(kodiPostar < tjeter.kodiPostar) {
			return true;
		}else {
			return false;
		}	
	}
	
}
