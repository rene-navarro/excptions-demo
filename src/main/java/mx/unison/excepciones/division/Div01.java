package mx.unison.excepciones.division;

public class Div01 {

    public static void main(String args[]) {

        double dividendo = Double.parseDouble(args[0]);
        double divisor = Double.parseDouble(args[1]);

        double cociente = dividendo / divisor;

        System.out.printf("%4.4f / %4.4f = %4.4f%n", dividendo,divisor,cociente);

    }
}
