package clase_1;


public class Guitarra extends Instrumento{
    private int cantCuerdas;
    private String tipoGuitarra;

    //creamos el constructor que hereda todos los atr del padre
    public Guitarra(String material, String tipo, int tamaño, int cantCuerdas, String tipoGuitarra) {
        super(material, "cuerda", 654);//super llama al constructor de la clase padre
        this.cantCuerdas = cantCuerdas;
        this.tipoGuitarra = tipoGuitarra;
    }
    //creamos el constructor que no hereda los atr del padre(cosntructor vacio)
    public Guitarra(int cantCuerdas, String tipoGuitarra) {
        this.cantCuerdas = cantCuerdas;
        this.tipoGuitarra = tipoGuitarra;
    }
    //creamos un constructor completamente vacio
    public Guitarra() {
    }
    public int getCantCuerdas() {
        return cantCuerdas;
    }
    public void setCantCuerdas(int cantCuerdas) {
        this.cantCuerdas = cantCuerdas;
    }
    public String getTipoGuitarra() {
        return tipoGuitarra;
    }
    public void setTipoGuitarra(String tipoGuitarra) {
        this.tipoGuitarra = tipoGuitarra;
    }
    //sobreescritura modifica un metodo de la clase padre
    @Override
    public void sonar() {
        System.out.println("estoy sonando como una guitarra");
    }

    //el static nos permite acceder al metodo sin la necesidad de haber instanciado un objeto
    public static void mensaje(){
        System.out.println("hola");
    }
    //sobrecarga del metodo sonar.... (cambia la firma, void por int)
    public int sonar(int a, int b){
        return 0;
    }

}
