import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        HashMap<String, Integer> mapas = new HashMap<>();
        mapas.put("clave1", 332);
        mapas.put("clave2", 54422);
        mapas.put("clave3", 4331112);
        mapas.put("clave4", 43419888);
        mapas.put("clave5", 300434342);

        System.out.println(mapas.get("clave1")); //mapas.get() indicamos la clave que queremos imprimir
        mapas.replace("clave2", 43555);// mapas.replace reemplazamos el valor del indicice indicado en el mapa


        for (Map.Entry valores : mapas.entrySet()) {     //For aplicado para mostrar los valores del Mapa
            System.out.println("claves: " + valores.getKey()); //getKey mostramos las claves del mapa, este caso con VALORES
            System.out.println("valores de claves: " + valores.getValue()); //get.Value mostramos la constraseña de las claves
            //en este caso usando VALORES.GETVALUE()
            // "VALORES" ES LA VARIABLES CREADA EN Map.Entry

        }
    }
}