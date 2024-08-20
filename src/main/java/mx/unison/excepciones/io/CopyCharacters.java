package mx.unison.excepciones.io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyCharacters {
    public static void main(String[] args)  {

        if( args.length == 2 ) {
            System.out.println("CopyCharacters <archivoEntrada> <archivoSalida>");
            System.exit(1);
        }

        FileReader inputStream = null;
        FileWriter outputStream = null;

        try {
            inputStream = new FileReader(args[0]);
        } catch (FileNotFoundException e) {
           System.out.println( e.getMessage() );
            System.exit(2);
        }

        try {
            outputStream = new FileWriter(args[1]);
        } catch (IOException e) {
            System.out.println( e.getMessage() );
            System.exit(3);
        }

        try {
            int c;
            while ((c = inputStream.read()) != -1) {
                outputStream.write(c);
            }

        } catch (IOException e) {
            System.out.println( e.getMessage() );
            //System.exit(4);
        } finally {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (outputStream != null) {
                try {
                    outputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}