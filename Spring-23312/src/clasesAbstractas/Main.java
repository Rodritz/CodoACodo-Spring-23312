package clasesAbstractas;

public class Main {
    public static void main(String[] args) {

        Triangulo t1 = new Triangulo(2.0,4.0);

        Cuadrado c1 = new Cuadrado(4);

        Figura f = new Cuadrado(2);

        f = new Triangulo(8.0,2.0);
        /*
        t1.dibujar();
        System.out.println("area del triangulo: "+ t1.calcularArea());

        c1.dibujar();
        System.out.println("area del cuadrado: "+ c1.calcularArea());*/

        System.out.println(f.calcularArea());

    }
}