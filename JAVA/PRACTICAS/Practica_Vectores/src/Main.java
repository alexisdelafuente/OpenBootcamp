import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        Vector<Integer>vector = new Vector();
        vector.add(43);
        vector.add(41);
        vector.add(54);
        vector.add(86);
        vector.add(34);
        vector.add(6);
        vector.add(4);
        vector.add(33);
        vector.add(7);
        vector.add(99);
        vector.remove(3); //REMOVER EL VECTOR INDICADO POR EL NUMERO DE INDICE

        System.out.println("capacidad "+vector.capacity());
        System.out.println("vectores" +vector);

        for (int i = 0; i < vector.size();i++){
            System.out.println("valor "+ vector.get(i));
        }

        vector.add(43);
        vector.add(66);

        System.out.println("capacidad "+vector.capacity());

        vector.trimToSize(); // REDUCE LA CAPACIDAD DEL VECTOR A LO QUE ESTA EN USO

        System.out.println("capacidad "+vector.capacity());
    }
}