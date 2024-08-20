package mx.unison.excepciones.demoa;

import java.io.IOException;

public class MainProgram {

    public static  void main(String[] args) {

        ListOfNumbers list = null;

        list = new ListOfNumbers();

       try {
            list.writeList();
       } catch (IOException e) {
           e.printStackTrace();
       }

    }
}
