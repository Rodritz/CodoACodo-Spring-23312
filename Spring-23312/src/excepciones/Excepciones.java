package excepciones;

public class Excepciones {

    public static void main(String[] args) {

        /*System.out.println("1");
        try{
            //FileInputStream fileInputStream = new FileInputStream("prueba.txt"))
            int value = 10/2;
            System.out.println("2");
        }catch (ArithmeticException e){
          //   System.out.println(e.getMessage());
            // e.printStackTrace(System.out);
            System.out.println("3");
        }
        finally {
            System.out.println("4");
        }
        System.out.println("5");
*/
    /*
        Instrumento inst = new Instrumento();
        inst = null;


        try {
            inst.sonar();
        }catch (NullPointerException e){
            e.printStackTrace(System.out);
        }
*/
        /*
        ArrayList<String> array = new ArrayList<>();
        array.add("palabra");


        System.out.println(array.get(1));
        */

        //el throw sirve para lanzar forzozamente una excepcion
        int valor = 2;
        int valor2 = 5;

        if(valor>valor2){
            System.out.println("el valor es mayor");
        }else {
            throw new RuntimeException("hola");
        }

    }

}