package ejercicioAbstractoEInterfaces;

public class Main {
    public static void main(String[] args) {

        Perro perro = new Perro();
        perro.emitirSonido();
        perro.comerCarne();

        Gato gato = new Gato();
        gato.emitirSonido();
        gato.comerCarne();

        Vaca vaca = new Vaca();
        vaca.emitirSonido();
        vaca.comerHierba();

        Animal a1 = new Perro();
        Animal a2 = new Gato();
        Animal a3 = new Vaca();





    }
}
