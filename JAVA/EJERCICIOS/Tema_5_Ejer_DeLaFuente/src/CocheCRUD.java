import java.util.List;

public interface CocheCRUD {
    void save();

    List<CocheCRUDimpl>coches();

    void delete();

}
