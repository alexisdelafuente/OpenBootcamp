import java.util.List;

public class CocheCRUDimpl implements CocheCRUD{

    @Override
    public void save() {
        System.out.println("Guardar un nuevo coche");
    }

    @Override
    public List<CocheCRUDimpl> coches() {
        System.out.println("Buscar un coche en la lista");
        return null;
    }

    @Override
    public void delete() {
        System.out.println("Eliminar un coche guardado");
    }
}
