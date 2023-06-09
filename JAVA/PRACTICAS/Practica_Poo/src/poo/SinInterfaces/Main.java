package poo.SinInterfaces;

import java.util.List;

public class Main {
    public static void main(String[] args) {
    EmpleadoCRUD empleadoCRUD = new EmpleadoCRUD();

    Empleado juan= new Empleado("Juan",24,40000,true);
    Empleado roberto = new Empleado("Roberto",45,60000,true);
    Empleado mario = new Empleado("Mario",32,45000,false);

    //Guardar empleados
    empleadoCRUD.guardar(juan);
    empleadoCRUD.guardar(roberto);
    empleadoCRUD.guardar(mario);

    //Consultar Empleados

        List<Empleado> empleados = empleadoCRUD.mostrarEmpleados();
        System.out.println(empleados);
    }
}
