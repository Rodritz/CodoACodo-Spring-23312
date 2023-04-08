package clase_1;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        //Instrumento i = new Instrumento();
        //Instrumento guitarra = new Guitarra();
        //Instrumento piano = new Piano();

        //List<Instrumento> array = new ArrayList(); es otra forma de instanciar un ArrayList
        ArrayList<Instrumento> array = new ArrayList();

        array.add(new Instrumento("madera","cuerda",654));
        array.add(new Guitarra());
        array.add(new Piano());
        array.add(new Instrumento());

        System.out.println(array.get(0).getMaterial());

        //1-llamamos al toString
        for(int i = 0; i<array.size(); i++){
            System.out.println(array.get(i));
        }

        //2-hacemos lo mismo con el forEach
        array.forEach(System.out::println);

        //HashMap<key, value> nombre = new HashMap()
        HashMap<Integer, String> mapa = new HashMap();

        //para agregar un elemento en el HashMap
        mapa.put(123456, "palabra");

        //buscamos el value por medio de la key
        System.out.println(mapa.get(123456));



    }
}