public class Main {

    public static void main(String[] args) {
        CocheCRUD cocheCRUD = new CocheCRUDimpl();
        cocheCRUD.save();
        cocheCRUD.coches();
        cocheCRUD.delete();
    }
}
