import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //con Try Catch centramos las excepciones en un solo lugar
        try{
            leerNombres();

        }catch(NameFormatException e){
            e.printStackTrace();
        }
    }
    //con @throws creamos una exception para lanzarla hacia un constructor de una clase
    //es este caso el metodo que la invoco
    private static void leerNombres() throws NameFormatException{
        Scanner scanner = new Scanner(System.in);
        System.out.println("ingrese un nombre");
        while (scanner.hasNext()){
            System.out.println("introduce un nombre");
            String nombre = scanner.nextLine();
            if(nombre.length() < 8 ) {
                scanner.close();
                throw new NameFormatException("el nombre debe tener minimo 8 caracteres");
            }
        }
        scanner.close();
    }
}