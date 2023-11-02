package seminarKlasat;
/*Implementoni klasën Student. Studenti ka emrin dhe numrin total të pikëve në quiz. Ndërtoni
konstruktorin dhe metodat getName (), addQuiz(int score), getTotalScore () dhe
getAverageScore(). Ju duhet të ruani dhe numrin e quiz-eve qe ka kryer studenti. Testoni klasën
Student.*/

public class Student {
	
	private String emri;
	private int nrPikeve;
	private int nrQuiz=0;
	
	public Student(String emri, int nrPikeve, int nrQuiz) {
		super();
		this.emri = emri;
		this.nrPikeve = nrPikeve;
		this.nrQuiz = nrQuiz;
	}
	public String getEmri() {
		return emri;
	}

	public int addQuiz(int score) {
		return nrQuiz++;
	}

	public int getNrPikeve() {
		return nrPikeve;
	}
	
	public double getAverageScore() {
		return nrPikeve/nrQuiz;
	}
	
	
}
