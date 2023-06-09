import java.util.ArrayList;
import java.util.List;

public class ListMain {
    public static void main(String[] args) {
        List<String> nombre = new ArrayList<>(); //->>> LISTA DE ARRAYS
        nombre.add ("nombre1"); // ->CON AL ADD. AGREGAMOS UNA VARIABLE A LA LISTA DE ARRAYS
        nombre.add ("nombre2");
        nombre.add ("nombre3");
        nombre.add ("nombre4");

        System.out.println(nombre);

        for (String nombres : nombre){
            System.out.println(nombres);
        }

        List<Coche> coche = new ArrayList<>();
        coche.add(new Coche("TOYOTA"));
        coche.add(new Coche("PUEGEOT"));
        coche.add(new Coche("CHEVROLET"));
        coche.add(new Coche("AUDI"));
        coche.add(new Coche("BMW"));

        System.out.println(coche);

        for (Coche coches : coche){
            System.out.println(coches);
        }
    }
}