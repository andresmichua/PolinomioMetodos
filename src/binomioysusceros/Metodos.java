package binomioysusceros;

public class Metodos {

    //metodo calcula el discrimantes
    //@param a,b,c 
    private int res = 0;

    
    //discriminante
    //@param a
    //@param b
    //@param c
    //Calcula el discriminante tomando en  cuenta los parametros de entrada
    //muestra el resultado en pantalla y clasifica los casos
    //cuando dsicriminantes > 0
    //discriminante < 0
    //discriminante = 0
    public void discriminante(int a, int b, int c) {
        int valor = 4;
        int cuadrado = (int) Math.pow(b, 2);
        int multi = a * c;
        int por4 = multi * 4;
        res = cuadrado - por4;

        if (res > 0) {
            System.out.println("Tipo 1: Existen dos raices distintas");
        }
        if (res == 0) {
            System.out.println("Tipo 2: Existe una raiz (doble)");
        }
        if (res < 0) {
            System.out.println("Tipo 3: No tiene raices reales");
        }
        System.out.println(res);
    }

    
    //calculaRAiz
    //@param a
    //@param b
    //@param c
    //Obtiene las raices dependiendo de los valores de entrada 
    //Calcula dos raices o una dependiendo del caso obtenido
    public void calculaRaiz(int a, int b, int c) {
        int discriminante = res;
        double raiz1, raiz2;
        float disraiz;

        if (discriminante > 0) {
            System.out.println("Primer Raiz");

            raiz1 = -b / 2 * a + ((disraiz = (float) Math.sqrt(res)) / 2 * a);
            System.out.println(raiz1);

            System.out.println("Segunda Raiz");
            raiz2 = -b / 2 * a - ((disraiz = (float) Math.sqrt(res)) / 2 * a);
            System.out.println(raiz2);
        }
        if (discriminante == 0) {

            raiz1 = -b / 2 * a;
            System.out.println(raiz1);

        }
        if (discriminante < 0) {

            System.out.println("Primer raiz");
            float resultado1 = -b / 2 * a;
            float resultado2 = ((disraiz = (float) Math.sqrt(-res)) / 2 * a);
            System.out.println(resultado1 + "+" + resultado2 + "i");
            
            System.out.println("Segundaraiz");
            System.out.println(resultado1 + "-" + resultado2 + "i");

        }
    }
}
