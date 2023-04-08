package ejercicioAbstractoEInterfaces;

import lombok.*;

@Data

public class Perro extends Animal implements Carnivoro{


    @Override
    public void emitirSonido() {
        System.out.println("guauuuu");
    }



    @Override
    public void comerCarne() {
        System.out.println("me alimento de carne");
    }

    @Override
    public void comerAnimal() {

    }


}
