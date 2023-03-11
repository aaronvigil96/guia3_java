/*
Ejercicio:
    Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa 
    pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto. Nota: investigar la función equals() en Java.
*/
package ejercicio_2;

import java.util.Scanner;

public class Ejercicio_2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String frase = entrada.nextLine();
        if(frase.equals("eureka")){
            System.out.println("Correcto");
        }else {
            System.out.println("Incorrecto");
        }
    }
    
}
