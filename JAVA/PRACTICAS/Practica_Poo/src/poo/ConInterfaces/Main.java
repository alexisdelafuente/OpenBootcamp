package poo.ConInterfaces;

import poo.SinInterfaces.Empleado;

public class Main {

    static EmpleadoCRUD empleadoCRUD;

    public static void main(String[] args) {

        empleadoCRUD.mostrarEmpleados();
        empleadoCRUD.save(new Empleado());

    }
}
