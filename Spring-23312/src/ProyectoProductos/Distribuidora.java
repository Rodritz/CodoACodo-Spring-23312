package ProyectoProductos;

import java.util.ArrayList;
import java.util.List;

public class Distribuidora {
    public static void main(String[] args) {

        List<Producto> productos = new ArrayList<>();

        productos.add(new ProductoPerecedero("banana", 10, 6));
        productos.add(new ProductoPerecedero("manzana", 5, 3));
        productos.add(new ProductoPerecedero("naranja", 15, 2));
        productos.add(new ProductoPerecedero("pomelo", 25, 8));
        productos.add(new ProductoPerecedero("melon", 35, 1));

        productos.add(new ProductoNoPerecedero("leche", 15, "lacteo"));
        productos.add(new ProductoNoPerecedero("arroz", 5, "legumbre"));
        productos.add(new ProductoNoPerecedero("arvejas", 10, "legumbre"));
        productos.add(new ProductoNoPerecedero("lentejas", 8, "legumbre"));
        productos.add(new ProductoNoPerecedero("anana", 8, "frutaEnlatada"));

        double precioTotal = 0.0;

        for (Producto p : productos) {
            precioTotal += p.calcular(5);
        }

        System.out.println("El precio total de vender 5 productos de cada item es " + precioTotal);
    }
}

