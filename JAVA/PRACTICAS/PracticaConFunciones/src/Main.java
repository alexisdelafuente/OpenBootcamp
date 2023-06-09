import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        double precio;

        System.out.println("ingrese el precio del producto que desea calcular: ");
        precio = leer.nextFloat();

      sumarIva(precio);
    }
    static void sumarIva(double precio){
        double iva = 10.5;
        iva = ((iva * precio / 100)+precio);
        System.out.println("el precio del producto con el iva agregado es de: "+iva);
    }
}