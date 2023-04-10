package clasesAbstractas;

import lombok.*;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Cuadrado extends Figura implements Dibujable{

    private double lado;

    @Override
    public void dibujar() {

        System.out.println("dibujamos un cuadrado");
    }

    @Override
    public Double calcularArea() {

        return lado*lado;
    }
}

