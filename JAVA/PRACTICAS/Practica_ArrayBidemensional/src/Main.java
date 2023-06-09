public class Main {
    public static void main(String[] args) {
        int arrayBide[][] = new int[2][4];
        arrayBide[0][0] = 1;
        arrayBide[0][1] = 2;
        arrayBide[0][2] = 3;
        arrayBide[0][3] = 4;
        arrayBide[1][0] = 6;
        arrayBide[1][1] = 7;
        arrayBide[1][2] = 8;
        arrayBide[1][3] = 9;

        for (int i = 0; i < arrayBide.length; i++) {
            for (int j = 0; j < arrayBide[i].length; j++) {
                System.out.println("estoy en i: " + i + ", j = " + j);
                System.out.println("valor : " + arrayBide[i][j]);
            }
        }

        String arrayNombres[][] = {{"alexis", "lorenzo", "camila", "pepe", "pepito"},
                {"ALE", "CAMI", "LOLO", "PEPI", "YAMIL"}};

        for (int i = 0; i < arrayNombres.length; i++) {
            System.out.println("fila: " + i);

            for (int j = 0; j < arrayBide[i].length; j++) { //PRESTAR ATENCENCION EN COMO IMPRIMIR LAS CELDAS
                System.out.println(arrayNombres[i][j]);
            }
        }
    }
}
