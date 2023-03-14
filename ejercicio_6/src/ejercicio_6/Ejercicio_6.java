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
        int numA, numB, opcion;
        String salida;
        do{
            do{
                System.out.println("Ingresá un numero positivo");
                numA = entrada.nextInt();
                System.out.println("Ingresá otro numero positivo");
                numB = entrada.nextInt();
            }while(numA < 0 && numB < 0);
            
            do{
                System.out.println("Ingresá una opcion");
                System.out.println("1)- Sumar");
                System.out.println("2)- Restar");
                System.out.println("3)- Multiplicar");
                System.out.println("4)- Dividir");
                System.out.println("5)- Salir");
                opcion = entrada.nextInt();
                switch(opcion){
                case 1:{
                    System.out.println("");
                    System.out.println("La suma de " + numA + " + " + numB + " es: " + (numA + numB));
                    System.out.println("");
                    break;
                }
                case 2: {
                    System.out.println("");
                    System.out.println("La resta de " + numA + " - " + numB + " es: " + (numA - numB));
                    System.out.println("");
                    break;
                }
                case 3: {
                    System.out.println("");
                    System.out.println("La multiplicación de " + numA + " * " + numB + " es: " + (numA * numB));
                    System.out.println("");
                }
                case 4: {
                    System.out.println("");
                    System.out.println("La división de " + numA + " / " + numB + " es: " + (numA / numB));
                    System.out.println("");
                }
                case 5: {
                    break;
                }
                default: {
                    System.out.println("");
                    System.out.println("Tenés que ingresar un número del 1 - 5");
                    System.out.println("");
                }
            }
            }while(opcion != 5);
            
            
            System.out.println("Está seguro que desea salir del programa (S/N)?");
            salida = entrada.next();
            if(salida.equals("s") || salida.equals("S")){
                break;
            }
        }while(!salida.equals("N") || !salida.equals("n"));
        System.out.println("Gracias por utilizar la calculadora.");
    }
}
