/*
Ejercicio:
    Crear un programa que dado un número determine si es par o impar.
*/

package ejercicio_1;

import java.util.Scanner;

public class Ejercicio_1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int numero = entrada.nextInt();
        if(numero % 2 != 0){
            System.out.println("El numero " + numero + " es IMPAR.");
        }else {
            System.out.println("El numero " + numero + " es PAR.");
        }
    }
    
}
