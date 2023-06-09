package poo.ConInterfaces;

import poo.SinInterfaces.Empleado;

import java.util.List;

public class EmpleadoCRUDMySQL implements EmpleadoCRUD,EmpleadoReader {

    @Override
    public void save(Empleado empleado) {

    }

    @Override
    public List<Empleado> mostrarEmpleados() {
        return null;
    }

    @Override
    public void delete(Empleado empleado) {

    }
}
