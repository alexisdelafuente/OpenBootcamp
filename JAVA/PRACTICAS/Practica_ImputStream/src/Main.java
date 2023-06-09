import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Main {
    public static void main(String[] args) {
        try {
            InputStream fichero = new FileInputStream("C:\\Users\\alexi\\Desktop\\fichero.txt");
            BufferedInputStream bufferFichero = new BufferedInputStream(fichero); // como crear un Buffer

            try {
                int dato = fichero.read(); //agregamos a dato el dato de Fichero actual

                while (dato != -1){        //mientras dato sea DISTINTO A -1

                    System.out.print((char)dato); //con CHAR colocamos lo que tiene el CHAR, con DATO solo solo se coloca el binario

                    dato=fichero.read(); //agremos el siguiente data a la vaariable dato para poder mostrarla
                }

            }catch (IOException e){
                System.out.println("no puedo leer el fichero: "+ e.getLocalizedMessage());
            }
        }catch (IOException e){
            System.out.println("error, no se leyo el fichero: "+ e.getLocalizedMessage());
        }
    }
}