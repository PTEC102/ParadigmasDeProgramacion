package clase06;

import java.text.MessageFormat;
import java.util.*;

public class Ejemplo02 {
    public static void main(String[] args) {

        Vector<Integer> miVector = new Vector<Integer>();
		
		for (int i = 1; i <= 10; i++){
			miVector.add(i);
		}
		
        //vemos que vector tiene su propia definicion de toString
		System.out.println(miVector);        
		
		miVector.remove(3); //Borramos el 4
		
		miVector.remove(3); //Borramos el 5
		
		System.out.println(miVector);
				
		
		String mensaje = MessageFormat.format("Largo del vector {0}", miVector.size());
		
		System.out.println(mensaje);
		
	}
}
