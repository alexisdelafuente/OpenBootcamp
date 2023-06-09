import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Bienvenido al Programa CONTRACIONES+Plus ");
        Scanner leer = new Scanner(System.in);
        int respuesta;
        System.out.println("Ingresa una de las opciones disponibles que podras realizar:");
        System.out.println("1. Cargar listado de postulantes a un puesto de trabajo: ");
        System.out.println("2. ver el listado de los empleados activos de la empresa: ");
        System.out.println("3. Tareas a realizar en la Empresa: ");
        System.out.println("4. Para salir");
        respuesta = leer.nextInt();
        String readCarpeta;
        while (respuesta < 0 || respuesta > 5) {
            System.out.println("ingresa una opcion correcta, recuerda que nuestro Menu va de las Opciones 1 al 5.!");
            respuesta = leer.nextInt();
        }
            switch (respuesta) {
                case 1:
                    String comprobar, comprobarMayus;
                    ArrayList<String> empleados = new ArrayList<>();
                    System.out.println("a continuacion intruce la direccion donde se encuentra el listado guardado: ");
                    readCarpeta = leer.next();
                    try {
                        InputStream fileIn = new FileInputStream(readCarpeta);
                        System.out.println("¿Deseas comprobar que se a realizado la carga exitosamente?");
                        comprobar = leer.next();
                        comprobarMayus = comprobar.toUpperCase();
                        if (comprobarMayus.equals("SI")) {
                            readFiles(fileIn);
                            System.out.println("¿Deseas modificar personal del listado?");
                            comprobar = leer.next();
                            comprobarMayus = comprobar.toUpperCase();
                            if (comprobarMayus.equals("SI")) {

                                PrintStream fileOut = new PrintStream(readCarpeta);
                                rellenarEmpleados(empleados);
                                System.out.println("se cargaran el nuevo listado de postulantes a la siguiente carpeta ---> "+ readCarpeta);
                                for (String empleado : empleados) {
                                    fileOut.println(empleado);

                                }
                                System.out.println("Finalizo la carga, gracias por usar nuestro Servicio.!");
                            }
                        }

                    } catch (Exception e) {
                        System.out.println("No se logro leer el listado, por favor verifica que este bien escrita la direeccion" + e.getLocalizedMessage());
                    }
                    System.out.println("Gracias por usar nuestro servicio.!");
                    break;
                case 2:
                    HashMap<String,Integer> listaEmpleados = new HashMap<>();
                    System.out.println("A continuacion visualizaras la lista de los empleados ACTIVOS de la empresa: ");
                    mostrarListaEmpl(listaEmpleados);
                    System.out.println("Gracias por hacer uso de nuestro servicio.!");
                    break;
                case 3:
                    System.out.println("A continuacion te enviariamos al menua de tareas diarias de la empresa: ");
                    tareasEmpresa();
                    break;
                default:
                    System.out.println("Gracias por utilizar nuestro servicio.!");
            }
        }
    //Funcion para leer archivos
    public static void readFiles(InputStream fileIn) {
        try {
            int datos = fileIn.read();
            while (datos != -1 ){
                System.out.print((char)datos);
                datos=fileIn.read();
            }
            System.out.println("||| FINALIZO EL ARCHIVO CARGADO |||");
        }catch (IOException e){
            System.out.println("Ocurrio un error en la lectura del fichero"+e.getLocalizedMessage());
        }
    }
    //Funcion para rellenar listas de empleados
    public static void rellenarEmpleados(ArrayList<String> empleados){
        Scanner leer = new Scanner(System.in);
        int cantidadEmpl;
        String nombEmpl;
        System.out.println("ingrese la cantidad de postulantes que desea ingresar: ");
        cantidadEmpl= leer.nextInt();
        System.out.println("ingrese el nombre y apellido del empleado: ");
        for (int i = 0 ; i < cantidadEmpl+1 ; i ++){
            nombEmpl=leer.nextLine();
            empleados.add(nombEmpl);
        }
    }

    public static void mostrarListaEmpl(HashMap<String, Integer> listaEmpleados) {
        listaEmpleados.put("Roberto Firmino", 834);
        listaEmpleados.put("Margarita Veron", 213);
        listaEmpleados.put("Alexis Sanchez", 434);
        listaEmpleados.put("Gustavo Albornoz", 124);
        listaEmpleados.put("Federico Lujan", 43);
        listaEmpleados.put("Luciana Ortiz", 566);
        listaEmpleados.put("Eva Bonilla", 988);
        listaEmpleados.put("David Farias", 544);
        listaEmpleados.put("Javier Burlando", 331);
        listaEmpleados.put("Mario Benisares", 731);
        for (Map.Entry usarios : listaEmpleados.entrySet()) {
            System.out.println("Empleado: " + usarios.getKey() + " , Usuario: " + usarios.getValue());
        }
    }

    public static void tareasEmpresa() {
        Scanner leer2 = new Scanner(System.in);
        int respuesta;
        System.out.println("Ingresa el numero del dia que necesitas informacion ->");
        System.out.println("1. LUNES:");
        System.out.println("2. MARTES:");
        System.out.println("3. MIERCOLES:");
        System.out.println("4. JUEVES:");
        System.out.println("5. VIERNES:");
        System.out.println("6. SABADO:");
        System.out.println("7. DOMINGO:");
        System.out.println("8. Para Salir");
        respuesta = leer2.nextInt();
        while (respuesta > 8) {
            System.out.println("ingresa un numero valido al dia :");
            respuesta = leer2.nextInt();
        }
        switch (respuesta) {
            case 1:
                System.out.println("Dia Lunes: nos toca realizar un control de Stock de los productos actuales, y sumando los  productos entrantes" +
                        " y realizar un control de  la bolsa del mercado para los precios de la semana");
                break;
            case 2:
                System.out.println("Dia Martes: Controlaremos el listado de clientes, y estaremos atentos antes cualquier" +
                        " tipo de consulta que requieran");
                break;
            case 3:
                System.out.println("Dia Miercoles: Se programa el Marketing de redes para la empresa que inicia los dias jueves" +
                        " potenciadose los fines de semana, sumando a un control de stock");
                break;
            case 4:
                System.out.println("Dia Jueves: Limpieza en equipos y oficinas: ante cualquier tipo de visita, se iran controlando las redes de Marketing" +
                        "y estando nuevamente atentos a las dudas de los clientes, siempre tratando de brindales el mejor servicio posible, se realizaran " +
                        "pedidos de productos si asi se lo requiere");
                break;
            case 5:
                System.out.println("Dia viernes: Se realiza un control de Stock nuevamente, controlando si hay productos proximos a agotarse, se realizara " +
                        "un control en el listado de clientes fieles a la empresa, y opiniones que recibe la misma actualmente, y por ultimo se analizara el mercado" +
                        "de competencia");
                break;
            case 6:
                System.out.println("Dia Sabado: No sera laboral, a menos que surgan urgencias con clientes fieles con los que cuenta la empresa");
                break;
            case 7:
                System.out.println("Dia Domingo: No laboral");
                break;
        }
    }
}