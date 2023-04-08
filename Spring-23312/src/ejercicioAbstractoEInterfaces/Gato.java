package ejercicioAbstractoEInterfaces;

import lombok.*;

@Data

public class Gato extends Animal implements Carnivoro{
    @Override
    public void comerCarne() {
        System.out.println("como carne");
    }

    @Override
    public void comerAnimal() {

    }

    @Override
    public void emitirSonido() {
        System.out.println("miauuuu");
    }




}
