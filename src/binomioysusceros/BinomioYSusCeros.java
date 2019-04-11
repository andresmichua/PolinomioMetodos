package binomioysusceros;

import java.util.InputMismatchException;
import java.util.Scanner;

public class BinomioYSusCeros {

    static int a, b, c;
    static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {

        //Clase principal 
        //Se le pide al usuario ingresar datos meramente numericos
        
        //Estructura try catch para evitar que el programa colapse y termine de manera correcta
        try {
        System.out.println("Calculo de discriminantes");
        System.out.println("Asegure que los datos ingresados sean ***NUMERICOS***");
        System.out.println("ingrese el valor de a");
        a = leer.nextInt();
        
        if(a==0){
            System.out.println("El valor de a no puede ser 0");
            System.exit(0);
        }
        System.out.println("ingrese el valor de b");
        b = leer.nextInt();
        System.out.println("ingrese el valor de c");
        c = leer.nextInt();

        Metodos met = new Metodos();
        System.out.println("Tipo de discriminante");
        met.discriminante(a, b, c);
        met.calculaRaiz(a, b, c);

    
         } catch (InputMismatchException e ) {
            System.out.println("No se permite ingresar letras "+e);
        }
    }

}
