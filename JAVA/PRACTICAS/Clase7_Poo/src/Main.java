public class Main {
    public static void main(String[] args) {
        Coche coche = new Coche();
        coche.acelerar();
        coche.acelerar();
        coche.acelerar();
        System.out.println("velocidad actual: " +coche.velocidadActual);
        System.out.println("cantidad de puertas: " +coche.numeroPuertas);
        coche.desacelerar();
        coche.desacelerar();
        System.out.println("velocidad actual: " +coche.velocidadActual);


    }
}
class Coche {
    int numeroPuertas ;
    int velocidadActual;

    public Coche(){
        numeroPuertas=5;
    }
    public void acelerar () {
        velocidadActual=velocidadActual+60;
    }
    public void desacelerar () {
        velocidadActual=velocidadActual-30;
    }

}