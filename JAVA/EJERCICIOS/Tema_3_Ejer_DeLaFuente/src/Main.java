public class Main {
    public static void main(String[] args) {
        String nombres[]={"Lorenzo","Alexis","Pepe","Maria"};

        imprimirNombres(nombres);
    }

    static void imprimirNombres(String[] nombres) {
        for (int i=0; i < nombres.length;i++){
            System.out.print(nombres[i]+" | ");
        }
    }
}