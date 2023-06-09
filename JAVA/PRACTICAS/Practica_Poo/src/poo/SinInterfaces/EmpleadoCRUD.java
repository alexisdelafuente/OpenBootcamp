package poo.SinInterfaces;

import java.util.ArrayList;
import java.util.List;

/**
 * Porque se usa el termino CRUD?
 * C|reate
 * R|etrieve/read
 * U|pdate
 * D|elete
 */
public class EmpleadoCRUD {

    private List<Empleado>empleados = new ArrayList<>();

    //Metodo: Guardar empleados

    public void guardar(Empleado empleado){
        empleados.add(empleado);

    }
    public List<Empleado> mostrarEmpleados(){
        return empleados;
    }
}

