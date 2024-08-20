package mx.unison.excepciones.division;

public class Div02 {
    public static void main(String args[]) {

        if( args.length > 2 ) {
            System.out.println("Faltan argumentos");
            System.exit(1);
        }
        double dividendo = 0.0;
        try {
             dividendo = Double.parseDouble(args[0]);
        }catch (NumberFormatException e)    {
            System.out.println("Error de formato en el dividendo.");
            System.exit(2);
        }
        double divisor = 0.0;
        try {
             divisor = Double.parseDouble(args[1]);
        }catch (NumberFormatException e)    {
            System.out.println("Error de formato en el divisor. ");
            System.exit(3);
        }

        double cociente = dividendo / divisor;
        System.out.printf("%4.4f / %4.4f = %4.4f%n", dividendo,divisor,cociente);

    }
}
