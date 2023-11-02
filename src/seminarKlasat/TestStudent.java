package seminarKlasat;

public class TestStudent {

	public static void main(String[] args) {
		Student s1 = new Student("Beni", 30, 2);
		
		int total = s1.getNrPikeve();
		double mes = s1.getAverageScore();
		
		System.out.println("Studenti me emer "+s1.getEmri()+" ka "+total+" pike, dhe ka kryer "+s1.addQuiz(total)+" quize.");
		System.out.println("Ka marre mesatarisht "+mes+" pike per quiz.");
	}

}
