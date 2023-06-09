import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        double valor;
        System.out.println("ingrese el precio del producto: ");
        valor = leer.nextFloat();
        precioConIva(valor);
    }
        static void precioConIva(double valor){
            double sumaIva;
            sumaIva= ((valor * 10.5)/100) + valor;
            System.out.println("el precio del producto con iva es "+sumaIva);
    }
}