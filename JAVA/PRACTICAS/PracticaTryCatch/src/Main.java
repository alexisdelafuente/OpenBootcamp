import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {

            Scanner leer = new Scanner(System.in);
            int valor1, valor2, resultado;
            System.out.println("ingrese el pimer valor: ");
            valor1 = leer.nextInt();
            System.out.println("ingrese el segundo valor: ");
            valor2 = leer.nextInt();
            resultado = valor1 / valor2;
            System.out.println("el resultado de la division es: " + resultado);
        }catch (Exception e){
            System.out.println("Error.!!" +e);
        }

    }

}