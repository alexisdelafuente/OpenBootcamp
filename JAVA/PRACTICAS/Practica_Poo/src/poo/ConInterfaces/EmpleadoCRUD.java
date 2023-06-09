package poo.ConInterfaces;

import poo.SinInterfaces.Empleado;

import java.util.List;

public interface EmpleadoCRUD {
    /**
     * En las interfaces declaramos los pasos de los metodos,
     * no los vamos a usar, si no nos dice como usar los metodos
     * LAS INTERFACES solamente nos dicen que hacer
     * @param empleado
     */
    public void save(Empleado empleado);

    List<Empleado>mostrarEmpleados();
    void delete(Empleado empleado);

}
