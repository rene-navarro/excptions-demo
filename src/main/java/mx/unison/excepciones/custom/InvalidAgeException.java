package mx.unison.excepciones.custom;

public class InvalidAgeException extends Exception  {

    public InvalidAgeException() {
        super()    ;
    }

    public InvalidAgeException (String mensaje)    {
        // calling the constructor of parent Exception
        super(mensaje);

    }

    public InvalidAgeException (String mensaje,  Throwable causa )    {
        // calling the constructor of parent Exception
        super(mensaje, causa);
    }

}
