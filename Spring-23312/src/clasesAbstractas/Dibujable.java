package clasesAbstractas;

public interface Dibujable {
    //las interfaces solo pueden extender de otras Interfaces

    Double PI = 3.14;

    //los metodos son publicos siempre en la interface
    //no se crean metodos de instancia
    void dibujar();

}