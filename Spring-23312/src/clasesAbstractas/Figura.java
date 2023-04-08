package clasesAbstractas;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode



public abstract class Figura {

    //las clases abstractas no se pueden instanciar, sirven
    //unicamente para crear subclases que hereden sus metodos abstractos
    private Integer numeroDeLados;


    public abstract Double calcularArea();
}
