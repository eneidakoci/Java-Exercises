package perseritje;
import java.util.ArrayList; //mqs kemi krijuar nje array list na duhen te deklarojme paketen java util me klasen ArrayList

public class ArrayLists {
//Array lists: array qe mund t'i vendosim nje gjatesi te re (resizeable array)
	//Elementet te ajo mund te shtohen ose te hiqen
	//Mbajne vetem reference data types
	//nqs na duhet te mbaje tip primitiv na duhet te perdorim klasen wrapper, duke qene se mban vetem reference data types, (objects)
	public static void main(String[] args) {
		
		ArrayList<String> food = new ArrayList<String>();//kemi krijuar nje ArrayList me emrin food qe do mbaje stringje.
		//si te shtojme vlera ne arrayList?
		//-Shkruajme emrin e arrayList dhe funksionin e gatshem add
		food.add("pizza");
		food.add("hamburger");
		food.add("mac & cheese");
		
		//metoda te rendesishme
		food.set(0, "sushi"); //zv vleren tek indeksi 0=pizza me vleren e dyte tek metoda set qe eshte sushi. pra tani indeksi 0 ka vleren sushi
		food.remove(2); //me kete metode remove() heqim vleren e dhene te ai indeks. tani na fshihet mac & cheese
		//food.clear();//fshin gjithe array list
		food.add(0,"ham");//shton tek indeksi 0, fjalen ham
		
		for(int i = 0; i < food.size(); i++) { //Tek arrays per madhesine e tyre perdornim arrayName.length ndersa per arrayLists perdorim emriarraylist.size()
			System.out.println(food.get(i));//funksioni get() per te marre elementet
			
		}

	}

}
