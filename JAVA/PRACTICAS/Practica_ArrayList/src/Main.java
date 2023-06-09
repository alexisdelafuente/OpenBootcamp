import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> arrayNombres = new ArrayList();

        LinkedList<String> ListaNombres = new LinkedList(); // funciona muy similar al ArrayList
        arrayNombres.add("alexis");
        arrayNombres.add("lolo");
        arrayNombres.add("camila");
        arrayNombres.add("pepe");

        System.out.println(arrayNombres);

        for (int i = 0; i < arrayNombres.size(); i++){
            System.out.println("contiene: "+arrayNombres.get(i));
        }

        String arrays[] =  new String[arrayNombres.size()];

        for (int i = 0; i < arrayNombres.size(); i++){
            arrays[i]=arrayNombres.get(i);
        }

        for (int i = 0 ; i < arrays.length; i++){
            System.out.println("el array contiene: " +arrays[i]);
        }

        Vector<Integer>numeros = new Vector();
        numeros.add(232);
        numeros.add(3434);
        System.out.println("mostrando vectores"+numeros);
    }

}