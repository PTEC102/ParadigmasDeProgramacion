package clase06;

import java.util.*;

public class Ejemplo04 {
    public static void main(String[] args) {

		HashSet<Integer> hashSet = new HashSet<Integer>(); 

		for (int i = 1; i <= 10; i++) {
			hashSet.add((int) (Math.random() * 10));
		}

		//print del hashSet
		System.out.println(hashSet);

		Set<Integer> set = new HashSet<Integer>(hashSet);

		//print del set
		System.out.println(set);

		//Contiene los elementos ordenados
		TreeSet<Integer> sorted = new TreeSet<Integer>(set);
		System.out.println(sorted);
	}
}
