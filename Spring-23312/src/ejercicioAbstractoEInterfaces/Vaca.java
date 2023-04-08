package ejercicioAbstractoEInterfaces;

import lombok.*;

@Data



public class Vaca extends Animal implements Herviboro {
    @Override
    public void emitirSonido() {
        System.out.println("muuuuuuu");
    }



    @Override
    public void comerHierba() {
        System.out.println("como hierva");
    }
}
