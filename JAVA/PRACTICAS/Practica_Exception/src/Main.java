import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        int valor1,valor2;
        System.out.println("ingrese el primer valor: ");
        valor1=leer.nextInt();
        System.out.println("ingrese el segundo valor: ");
        valor2=leer.nextInt();


        try {
            dividir(valor1, valor2);
        }catch (Exception e){
            System.out.println("uso de Error.!");
            }
        }

    public static int dividir(int valor1, int valor2) throws Exception {
        int resultado;
        try {
            resultado = valor1 / valor2;
            System.out.println("resultado: " + resultado);
        } catch (Exception e) {
            throw new Exception();
        }
        return resultado;
    }
}
