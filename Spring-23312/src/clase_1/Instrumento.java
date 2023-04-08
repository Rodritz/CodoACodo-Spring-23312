package clase_1;

public class Instrumento {

    protected String material;
    private String tipo;
    private int tamaño;

    public Instrumento(String material, String cuerda, int i) {
        this.material = material;
        this.tipo = tipo;
        this.tamaño = tamaño;
    }
    public Instrumento() {
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getTamaño() {
        return tamaño;
    }

    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }

    public void sonar(){
        System.out.println("estoy sonando!!!");
    }

    @Override
    public String toString() {
        return "Instrumento{" +
                "material='" + material + '\'' +
                ", tipo='" + tipo + '\'' +
                ", tamaño=" + tamaño +
                '}';
    }
}
