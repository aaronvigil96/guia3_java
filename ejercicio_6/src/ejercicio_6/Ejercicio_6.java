/*
    Realizar un programa que pida dos números enteros positivos por teclado y muestre por pantalla el siguiente menú:
    El usuario deberá elegir una opción y el programa deberá mostrar el resultado por pantalla y luego volver al menú.
    El programa deberá ejecutarse hasta que se elija la opción 5. Tener en cuenta que, si el usuario selecciona la opción 5,
    en vez de salir del programa directamente, se debe mostrar el siguiente mensaje de confirmación: 
    ¿Está seguro que desea salir del programa (S/N)? Si el usuario selecciona el carácter ‘S’ se sale del programa,
    caso contrario se vuelve a mostrar el menú.
*/
package ejercicio_6;

import java.util.Scanner;

public class Ejercicio_6 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresá el primer numero");
        int numA = entrada.nextInt();
        System.out.println("Ingresá el segundo numero");
        int numB = entrada.nextInt();
        if(numA < 0 || numB < 0){
            System.out.println("Solamente se acepetan numeros positivos");
        }
        
    }
    
}
