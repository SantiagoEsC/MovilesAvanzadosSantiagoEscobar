import java.util.Scanner;

public class Notas{
    static String materia;
    static String alumno;
    static String nota;
    

    public void entradaNotas(){
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Materia: ");
        materia = entrada.next();

        System.out.println("Alumno: ");
        alumno = entrada.next();

        System.out.println("Nota: ");
        nota = entrada.next();
    }
}




