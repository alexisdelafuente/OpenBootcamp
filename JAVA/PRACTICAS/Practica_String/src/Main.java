public class Main {
    public static void main(String[] args) {
        String cadena = "cadena de texto";

        /*
        int longcadena = cadena.length();//con length mostramos la longitud del String
        System.out.println("la longitud de la cadena es : "+longcadena);

        String cadenaMin = cadena.toLowerCase();//con toLowerCase pasamos todo el String a minuscula
        System.out.println("toda la cadena en minuscula: " +cadenaMin);

        String cadenaMayus = cadena.toUpperCase(); //con toUpperCase pasamos pasamos el String a Mayuscula
        System.out.println("toda la cadena a mayuscula: "+cadenaMayus);

        boolean resultadoCadena= cadena.startsWith("men");//startWitch para buscar si la cadena empieza con las palabra que  buscamos
        if(resultadoCadena){
            System.out.println("la cadena de texto empieza con la palabra requerida");
        }else {
            System.out.println("la cadena de texto NO empieza con la palabra requerida");
        }
        boolean finCadena = cadena.endsWith("to");//endsWith para buscar si la cadena termina con la pabra que buscamos
        if (finCadena){
            System.out.println("la cadena de texto termina con la pabraba buscada");
        }else {
            System.out.println("la cadena de texto NO termina con la palabra buscada");
        }

        char letraPosicion = cadena.charAt(0);//charAt colocamos la posicion que queremos obtener de la cadena de texto y la guardamos en el char
        System.out.println("el caracter es: "+letraPosicion);
         */

        //CON ESTE BUCLE IMPRIMIMOS LA CADENA AL REVES
        //CADENA DE TEXTO
        //OTXET ED ANEDAC
        for (int i = cadena.length()-1; i >= 0; i --  ) {

            System.out.println("caracter actual: "+ cadena.charAt(i));
        }
    }

}