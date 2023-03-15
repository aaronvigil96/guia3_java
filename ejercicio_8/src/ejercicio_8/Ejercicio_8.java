/*
    Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. 
    Por ejemplo, si el cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
    * * * *
    *        *
    *        *
    * * * *

*/

package ejercicio_8;

import java.util.Scanner;

public class Ejercicio_8 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcion, numero;
        boolean estado = true;
        String eleccion;

            while(estado){
            System.out.println("¿Que desea hacer?");
            System.out.println("1)- Mostrar cubo");
            System.out.println("2)- Salir");
            
            try{
                opcion = entrada.nextInt();
            }catch(Exception e){
                System.out.println("Pone un numero, sida");
                opcion = 0;
                break;
            }
            
            switch(opcion){
                case 1: 
                    System.out.println("Ingresá un numero");
                    numero = entrada.nextInt();
                    for (int i = 0; i < numero; i++) {
                        System.out.println("");
                        for (int j = 0; j < numero; j++) {
                            if(i == 0 || i == numero - 1){
                                System.out.print(" * ");
                            }else if(j != 0 && j != numero - 1){
                                System.out.print("   ");
                            }else {
                                System.out.print(" * ");
                            }
                        }
                    }
                    System.out.println("");
                    System.out.println("");
                    break;
                case 2:
                    System.out.println("¿Seguro que quiere salir? S/N");
                    eleccion = entrada.next();
                    if(eleccion.equals("S")){
                        estado = false;
                    }
                    break;
            }
    }
            System.out.println("Fin");
    }
}
