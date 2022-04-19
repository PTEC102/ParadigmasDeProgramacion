package clase06;

import java.util.*;

public class Ejemplo03 {
    public static void main(String[] args) {

		Set<Integer> set = new HashSet<Integer>(); 

		for (int i = 1; i <= 10; i++) {
			set.add(i);
		}

		//print the set
		System.out.println(set);

		//remove the element 3
		set.remove(3);

		//remove the element 4
		set.remove(4);

		//print the set
		System.out.println(set);
	}
}
