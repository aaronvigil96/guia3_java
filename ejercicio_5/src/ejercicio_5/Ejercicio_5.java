/*
    Escriba un programa en el cual se ingrese un valor limite positivo, y a continuacion solicite numeros al usuario hasta que la suma de
    los numeros introducidos supere el límite inicial.
*/

package ejercicio_5;

import java.util.Scanner;

public class Ejercicio_5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese un numero limite positivo");
        int numeroLimite = entrada.nextInt();
        int contador = 0;
        do{
            System.out.println("Ingresa un numero");
            int numero = entrada.nextInt();
            contador = contador + numero;
        }while(numeroLimite > contador);
        System.out.println("El numero superó al limite");
    }
}
