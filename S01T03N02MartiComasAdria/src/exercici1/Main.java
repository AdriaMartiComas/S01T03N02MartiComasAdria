package exercici1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;

public class Main {

	public static void main(String[] args) {
		
		//EXERCICI 1
		HashSet<Restaurant> hashSetList = new HashSet<Restaurant>();

		hashSetList.add(new Restaurant("Les Cols", 8));
		hashSetList.add(new Restaurant("Bulli", 9));
		hashSetList.add(new Restaurant("Sagarra", 2));
		hashSetList.add(new Restaurant("Les Cols", 8));
		hashSetList.add(new Restaurant("Les Cols", 9));
		
		System.out.println("LLISTA HASH SET");
		for(Restaurant r : hashSetList) {
			System.out.println(r);
		}
		
		
		//EXERCICI 2
		 ArrayList<Restaurant> list = new ArrayList<Restaurant>(hashSetList);
		 
		 Collections.sort(list, Comparator.comparing(Restaurant::getNom).reversed()
				    .thenComparingInt(Restaurant::getPuntuacio).reversed());
		 
		 
		 System.out.println("\nLLISTA ORDENADA");
		 for(Restaurant r : list) {
				System.out.println(r);
			}

	}

}
