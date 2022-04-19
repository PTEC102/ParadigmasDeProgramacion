package clase06;

import java.util.Arrays;
import java.util.Collections;

public class Ejemplo01 {
	
	public static void main(String[] args) {

        //Declaracion de variables
		int num = 0;
		String palabra = "";
		boolean esVerdad = false;
        float numeroPuntoFlotante = 5.8f;
        double numeroPuntoFlotanteDoblePresicion = 6.3;
		
        //Arreglo con 10 elementos aleatorio
        int[] arreglo = new int[10];
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = (int) (Math.random() * 100);
        }

        //muestra el arreglo
        System.out.print("Imprimiendo arreglo for: ");
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i] + " ");
        }
        System.out.println();

        System.out.print("Imprimiendo arreglo: ");
        System.out.println(arreglo);

        //muestra el arreglo con un for each
        System.out.print("Imprimiendo arreglo for each: ");
        for (int i : arreglo) {
            System.out.print(i + " ");
        }

        System.out.println();

        //ordernar el arreglo
        Arrays.sort(arreglo);

        //muestra el arreglo ordenado
        for (int i : arreglo) {
            System.out.print(i + " ");
        }
        System.out.println();

        //Arreglo de string con 10 elementos
        String[] arregloString = new String[10];        
        for (int i = 0; i < arregloString.length; i++) {
            arregloString[i] = "Elemento " + i;
        }

        //muestra el arreglo
        System.out.print("Imprimiendo arregloString for: ");
        for (int i = 0; i < arregloString.length; i++) {
            System.out.print(arregloString[i] + " ");
        }        
        System.out.println();
        
        //muestra el arreglo con un for each
        System.out.print("Imprimiendo arregloString for each: ");
        for (String miString : arregloString) {
            System.out.print(miString + " ");
        }
        System.out.println();

        //muestra arregloString con un while
        System.out.print("Imprimiendo arregloString while: ");
        int i = 0;
        while (i < arregloString.length) {
            System.out.print(arregloString[i] + " ");
            i++;
        }
        System.out.println();

        //shuffle arregloString
        Collections.shuffle(Arrays.asList(arregloString));
        for (String miString : arregloString) {
            System.out.print(miString + " ");
        }
        System.out.println();

	}
}
