import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        //EL BIG DECIMAL ES PRECISO CON EL RESULTADO, DANDO LOS NUMEROS EXACTOS
        BigDecimal valorA = new BigDecimal(2.1f);
        BigDecimal valorB = new BigDecimal( 4.3f);
        BigDecimal resultado = new BigDecimal(0f);

        resultado = valorA.add(valorB);
        System.out.println("resultado:"+ resultado.toString());
    }
}