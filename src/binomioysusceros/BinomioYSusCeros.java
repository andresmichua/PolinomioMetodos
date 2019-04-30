package binomioysusceros;

import java.util.InputMismatchException;
import java.util.Scanner;

public class BinomioYSusCeros {

    static int a, b, c;
    static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {
        long TInicio, TFin, tiempo; //Variables para determinar el tiempo de ejecución
        TInicio = System.currentTimeMillis(); //Tomamos la hora en que inicio el algoritmo y la almacenamos en la variable inicio

        //Clase principal 
        //Se le pide al usuario ingresar datos meramente numericos
        //Estructura try catch para evitar que el programa colapse y termine de manera correcta
//        try {
//        System.out.println("Calculo de discriminantes");
//        System.out.println("Asegure que los datos ingresados sean ***NUMERICOS***");
//        System.out.println("ingrese el valor de a");
//        a = leer.nextInt();
//        
//        if(a==0){
//            System.out.println("El valor de a no puede ser 0");
//            System.exit(0);
//        }
//        System.out.println("ingrese el valor de b");
//        b = leer.nextInt();
//        System.out.println("ingrese el valor de c");
//        c = leer.nextInt();
//
//        Metodos met = new Metodos();
//        System.out.println("Tipo de discriminante");
//        met.discriminante(a, b, c);
//        met.calculaRaiz(a, b, c);
//
//    
//         } catch (InputMismatchException e ) {
//            System.out.println("No se permite ingresar letras "+e);
//        }
        Metodos met = new Metodos();

        met.cuandoAEsIgualAUno(1, 7, 12);
        met.cuandoAEsIgualAUno(1, -3, 2);
        met.cuandoAEsIgualAUno(1, -2, -15);
        met.cuandoAEsIgualAUno(1, -19, -88);
        met.cuandoAEsIgualAUno(1, 7, 12);

        met.cuandoBesCero(2, 0, -18);
        met.cuandoBesCero(3, 0, -48);
        met.cuandoBesCero(5, 0, -55);
        met.cuandoBesCero(7, 0, -14);

        met.cuandoByCEsCero(3, 0, 0);
        met.cuandoByCEsCero(24, 0, 0);
        met.cuandoByCEsCero(32, 0, 0);
        met.cuandoByCEsCero(18, 0, 0);
        met.cuandoByCEsCero(9, 0, 0);

        TFin = System.currentTimeMillis(); //Tomamos la hora en que finalizó el algoritmo y la almacenamos en la variable T
        tiempo = TFin - TInicio; //Calculamos los milisegundos de diferencia
        System.out.println("Tiempo de ejecución en milisegundos: " + tiempo); //Mostramos en pantalla el tiempo de ejecución en milisegundos
    }

}
