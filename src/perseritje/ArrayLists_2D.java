package perseritje;
import java.util.*;
public class ArrayLists_2D {

	public static void main(String[] args) {
		
		//2D ArrayLists: liste dinamike e listave
		//mund te ndryshojme madhesine e listave gjate ekzekutimit
		
		//Krijojme nje liste 2d qe do mbaje listat e mesiperme 
		ArrayList<ArrayList<String>> groceryList = new ArrayList();
		
		//krijojme nje array list
		ArrayList<String> bakeryList = new ArrayList();
		bakeryList.add("pasta");
		bakeryList.add("bread");
		bakeryList.add("donut");
		
		System.out.println(bakeryList);//per te printuar gjithe listen
		System.out.println(bakeryList.get(0));//metoden get(index) per te marre nje nga elementet e listes
		
		//Krijojme lista te reja
		ArrayList<String> produceList = new ArrayList();
		produceList.add("tomatoes");
		produceList.add("zucchini");
		produceList.add("peppers");
		
		ArrayList<String> drinksList = new ArrayList();
		drinksList.add("soda");
		drinksList.add("coffee");
		
		groceryList.add(bakeryList); //i shtojme listes 2D listen e quajtur bakeryList
		groceryList.add(produceList);
		groceryList.add(drinksList);

		System.out.println(groceryList); //afishon listen e krijuar nga listat
		System.out.println(groceryList.get(0));//afishon nje liste nga lista2d
		System.out.println(groceryList.get(0).get(0));//afishon elementin e pare te listes se pare nga lista 2d
		System.out.println(groceryList.get(2).get(1));

	}

}
