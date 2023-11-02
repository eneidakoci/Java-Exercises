package seminarKlasat;
import java.util.*;
/*emrat e studenteve, pikeve te tyre ne provim. Ndertoni konstr pa parametra dhe me parametra. Ndertoni metoda aksesuese dhe ndryshuese
  Ndertoni metoden e cila do te marre si parameter nje emer dhe do kontrolloje nqs ai student ndodhet ne listen e studenteve.
  Ndertoni metoden studentetMeTeMire() e cila do te ktheje emrat e studenteve me piket me te larta nga lista e studenteve
  Ndertoni metoden hiqStudent() e cila do kete si parameter emrin e studentit dhe do hiqet emri i studentit dhe nota.
  Nderto klasen testuese
   */
public class Studentet {
private ArrayList<String> emrat;
private ArrayList<Double> piket;


//2 arraylists per emrat dhe piket. jane paralele. 
//konstr
public Studentet() {
	emrat = new ArrayList<String>();
	piket = new ArrayList<Double>();
}

public Studentet(ArrayList<String> emrat, ArrayList<Double> piket) {
	 this.emrat = emrat;//ruan arraylisten te nje arraylist tjeter
	 this.piket = piket;
}

public ArrayList<String> ktheEmrin() {
	return emrat;
}

public ArrayList<Double> kthePiket() {
	return piket;
}

public void ndryshoEmrin(ArrayList<String> emrat) {
	this.emrat = emrat;
}

public void ndryshoPiket(ArrayList<Double> piket) {
	this.piket = piket;
}

//metoda qe kontrollon nqs ndodhet emri ne liste
public boolean kontrollo(String emri) {
	if(emrat.contains(emri)) {
		return true;
	}else 
		return false;
}

//metoda qe kthen studentin me piket me te larta
public double maxPoints() {
	double max = piket.get(0);
	for(int i = 1; i<piket.size(); i++) {
		if(max<piket.get(i)) {
			max=piket.get(i);
		}
	}
	return max;
}

public void bestStudents() {
	for(int i = 0; i<emrat.size(); i++) {
		if (piket.get(i) == maxPoints()) {
			System.out.println(emrat.get(i));
		}
	}
}

//metoda qe heq studentin bashke me noten
public void hiqStudentin(String emri, double piket) {
		if(emrat.contains(emri)) {
			emrat.remove(emri);
			this.piket.remove(piket);
		}
}

}




