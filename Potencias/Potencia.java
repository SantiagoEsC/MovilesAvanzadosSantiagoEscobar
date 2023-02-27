import java.util.Scanner;
public class Potencia {


    public static void main(String[] args) {
        int resultado, base, potencia;
        Scanner num = new Scanner(System.in);
        System.out.print("Ingresa la base: ");
        base = num.nextInt();
        System.out.print("Ingresa la potencia: ");
        potencia = num.nextInt();
        resultado = potencia(base, potencia);
        System.out.println("El numero " + base + " elevado a " + potencia + " es = " + resultado);
    }
    //Funcion similar a un for
    static int potencia(int base, int potencia){
        int resultado;
        if(potencia == 0){
            resultado = 1;
        }
        else{
            //Método recursivo
            resultado = base * potencia(base, potencia - 1);
        }      
        return resultado;
    }
}