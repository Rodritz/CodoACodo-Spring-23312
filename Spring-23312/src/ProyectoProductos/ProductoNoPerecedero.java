package ProyectoProductos;

public class ProductoNoPerecedero extends Producto{
    private String tipo;


    public ProductoNoPerecedero(String nombre, double precio, String tipo) {
        super(nombre, precio);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "ProductoNoPerecedero{" +
                "tipo='" + tipo + '\'' +
                '}';
    }

    @Override
    public double calcular(int cantidadDeProductos) {
        return super.calcular(cantidadDeProductos);
    }
}
