package clase06.ejercicio;

import java.io.File;

public class Main {
    
    public static void main(String [] args){
            
        File file = new File("entrada/estudiante_1.in");
        
        String linea;
        try{
            java.util.Scanner sc = new java.util.Scanner(file);
            while(sc.hasNextLine()){
                linea = sc.nextLine();
                
                String[] datos = linea.split(" ");
                Double notas [] = new Double[datos.length-1];
                
                String materia = datos[0];
                for(int i = 0; i < datos.length-1; i++){
                    notas[i] = Double.parseDouble(datos[i+1]);
                }
                System.out.println(materia);                
                for(int i = 0; i < notas.length; i++){
                    
                    System.out.print(notas[i] + " ");
                }
                System.out.println();
            }
            sc.close();
        }catch(Exception e){
            System.out.println("Error al leer el archivo");
        }
    }

}
