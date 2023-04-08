package iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {

        ArrayList<String> arrPalabras = new ArrayList<>();

        arrPalabras.add("hola");
        arrPalabras.add("palabra");
        arrPalabras.add("chau");
        arrPalabras.add("si");

        //el iterator nos permite interactuar con el array
        Iterator<String> it = arrPalabras.iterator();

        //System.out.println(it.next());//muestra solo el primero

        /*while(it.hasNext()){
            System.out.println(it.next());
        }*/
        //el ciclo for no nos permte interactuar con el array
        //si al recorrerlo quisieramos borra un elemento no nos lo permite

        while (it.hasNext()) {
            if (it.next().equals("hola"))
                it.remove();
        }
        arrPalabras.forEach(System.out::println);
    }


}


