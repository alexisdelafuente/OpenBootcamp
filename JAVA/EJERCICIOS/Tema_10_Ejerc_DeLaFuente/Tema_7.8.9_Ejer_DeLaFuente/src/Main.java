import java.io.PrintStream;
import java.io.*;
import java.util.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        String texto = "hola mundo";
        System.out.println("EJERCICIO HOLA MUNDO REVERSE =============");
        reverse(texto);
        System.out.println("EJERCICIO ARRAYS UNIDIMENSIONAL ==========");
        ArrayUni();
        System.out.println("EJERCICIO ARRAYS BIDEMENSIONAL ===========");
        ArrayBide();
        System.out.println("EJERCICIO CREAR VECTOR, AGREGAR 5 ELEMENTOS." +
                " ELIMINAR LUEGO EL 2DO Y 3RO Y MOSTRAR POR PANTALLA");
        EliminarVector();
        System.out.println("EJERCICIO SEÑALAR PROBLEMA DE VECTOR AL AÑADIR 1000 ELEMENTOS");
        ProblemaVector();
        System.out.println("EJERCICIO CREAR ARRAYLIST CON 4 ELEMENTOS Y LINKEDLIST, Y MOSTRAR AMBOS");
        CrearArrayList();
        System.out.println("EJERCICIO CREAR ARRAYLIST DE ENTEROS, RELLENARLO CON 10 VALORES Y BORRAR LOS PARES");
        RellenarArrayList();
        System.out.println(" ");
        System.out.println("EJERCICIO CREAR FUNCION DividePorCero Y CREAR EXCEPCION");
        try {
            DividePorCero();
        }catch (ArithmeticException e){
            System.out.println("Esto no puede hacerse "+e.getLocalizedMessage() );
        }

        System.out.println("EJERCICIO DE IMPUTSTREAM Y SOUTSTREAM");
        try {
            InputStream fileIn = new FileInputStream("C:\\Users\\alexi\\Desktop\\fichero.txt");
            PrintStream fileOut = new PrintStream("C:\\Users\\alexi\\Desktop\\TextoOut.txt");
            ReadFile(fileIn, fileOut);
            fileIn.close();
            fileOut.close();
        } catch (IOException e) {
            System.out.println("no se logro leer la carpeta " + e.getLocalizedMessage());
        }
    }

    public static void reverse(String texto) {
        for (int j = texto.length(); j > 0; j--) {
            char[] palabra = new char[]{texto.charAt(j - 1)};
            System.out.println(palabra);
        }
    }

    public static void ArrayUni() {
        String[] nombres = {"Alexis", "Maria", "Fabricio", "Gustavo", "Eugenia"};
        for (String nombre : nombres) {
            System.out.println(nombre);
        }
    }

    public static void ArrayBide() {
        int[][] numeros = {{10, 20, 30, 40, 50}, {100, 200, 300, 400, 500}};
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("=============================");
            for (int j = 0; j < numeros[i].length; j++) {
                System.out.println("fila: " + i + " columna: " + j + " valor: " + numeros[i][j]);
            }
        }
    }

    public static void EliminarVector() {
        Vector<String> nombres = new Vector<>();
        nombres.add(0, "Camila");
        nombres.add(1, "Fabricio");
        nombres.add(2, "Gustavo");
        nombres.add(3, "Maria");
        nombres.add(4, "Daniela");
        System.out.println("Vector con 5 datos");
        System.out.println(nombres);
        nombres.remove("Fabricio");
        nombres.remove("Gustavo");
        System.out.println("vector sin elemento 2 y elemento 3:");
        System.out.println(nombres);
    }

    public static Void ProblemaVector() {
        System.out.println("¿Problemas de usar un vector con capacidad por defector, al añadir 1000 elemento?");
        System.out.println("Respuesta: es que la capacidad del Vector aumenta por si sola, al añardirse los" +
                "1000 elementos al mismo, y no controlar el aumento de la capacidad, consumiria mucha memoria" +
                "en el programa");
        return null;
    }

    public static void CrearArrayList() {
        ArrayList<String> nombres = new ArrayList<>();
        nombres.add("Mario");
        nombres.add("Gustavo");
        nombres.add("Margarita");
        nombres.add("Mariana");
        LinkedList<String> listas = new LinkedList<>(nombres);

        for (String nombre : nombres) {
            System.out.println("ArrayList: " + nombre);
        }
        for (String lista : listas) {
            System.out.println("LinkedList: " + lista);
        }
    }

    public static void RellenarArrayList() {
        Scanner leerValor = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();
        int valor=0;
        System.out.println("ingrese 10 numeros: ");
        for (int i = 0; i < 10; i++) {
            valor = leerValor.nextInt();
            if (valor % 2 != 0) {
                numeros.add(valor);

            }
        }
        System.out.println("numeros inpares: ");
        for (int numero : numeros) {
            System.out.print(" | "+numero);
        }
    }

    public static void DividePorCero() throws ArithmeticException {
        System.out.println("Demo codigo");
        int num1=5;
        System.out.println("primer valor "+num1);
        int num2=0;
        System.out.println("segundo valor "+num2);
        System.out.println("division a realizar: "+ num1 +" / "+ num2);
        int resultado = num1 / num2;
        System.out.println(resultado);
        throw new ArithmeticException();
    }

    public static void ReadFile(InputStream fileIn, PrintStream fileOut) {
        try {
            int datos = fileIn.read();
            while (datos != -1) {
                fileOut.write(datos);
                datos = fileIn.read();
                System.out.print((char) datos);
            }
        } catch (Exception e) {
            System.out.println("error" + e.getLocalizedMessage());
        }
    }
}
