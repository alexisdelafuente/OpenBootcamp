import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    try {
        movimientos();
    }catch (ArithmeticException e){
        e.printStackTrace();
    }
    }
    private static void movimientos () throws ArithmeticException{
        Scanner leer = new Scanner(System.in);
        int sueldo = 1500;
        int retiro;
        System.out.println("ingre el monto que desea retirar: ");
        retiro=leer.nextInt();
        if(retiro>sueldo){
            leer.close();
            throw new ArithmeticException("no posee fondos suficientes");
        }
    }

}