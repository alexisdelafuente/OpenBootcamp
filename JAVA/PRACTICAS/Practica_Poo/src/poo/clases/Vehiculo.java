package poo.clases;

public class Vehiculo {

    //1.Atributos
    protected String fabricante;
    protected String modelo;
    protected double cc;
    protected int year;
    protected boolean sport;
    protected int speed;

    Motor motor;

    //2.Constructores

    /**
     * LOS CONSTRUCTORES TRABAJAN DIRECTAMENTE CON LAS CLASES, Y LOS PARAMETROS SON LAS VARIABLES
     * LOS METODOS TRABAJAN DIRECTAMEN CON LAS VARIABLES DE LAS CLASES, APLICANDO UN NUEVO NOMBRE
     * PARA EL COMPORTAMIENTO DEL OBJETO.!
     */
    public Vehiculo(){}

    public Vehiculo(String fabricante, String modelo, double cc, int year, boolean sport, int speed, Motor motor) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.cc = cc;
        this.year = year;
        this.sport = sport;
        this.speed = speed;
        this.motor = motor;
    }

    public Vehiculo(String fabricante, String modelo){} //2do constructor con sobrecarga

    //3.Metodos(Comportamientos) -> LOS METODOS APLICAN SOBRE LAS VARIABLES DE LAS CLASES

    public void Acelerar(int cantidad){
        this.speed=cantidad;
    }
}
