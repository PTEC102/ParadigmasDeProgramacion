package clase06;

import java.util.*;

public class Ejemplo05 {
    public static void main(String[] args) {

		//https://www.geeksforgeeks.org/differences-between-hashmap-and-hashtable-in-java/
		
		//Dictionary example
		HashMap<String, String> diccionario_map = new HashMap<String, String>();

		diccionario_map.put("hola", "hello");
		diccionario_map.put("adios", "bye");
		diccionario_map.put("buenos dias", "good morning");
		diccionario_map.put("buenas tardes", "good afternoon");

		System.out.println(diccionario_map);

		System.out.println(diccionario_map.get("hola"));

		Hashtable<String, String> diccionario_hashtable = new Hashtable<String, String>();

		diccionario_hashtable.put("hola", "hello");
		diccionario_hashtable.put("adios", "bye");
		diccionario_hashtable.put("buenos dias", "good morning");
		diccionario_hashtable.put("buenas tardes", "good afternoon");

		System.out.println(diccionario_hashtable);
		System.out.println(diccionario_hashtable.get("adios"));		
	}
}
