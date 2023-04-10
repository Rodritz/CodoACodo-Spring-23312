package lambdasYStreams;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        /*------Lambdas----------

        ()->sentencia; sin parametros
        parametro -> sentencia; un parametro
        (parametroA, parametroB) -> sentencia; mas de un parametro
        (parametros varios) -> {sentencia1;
                                sentencia2}; con mas de una sentencia



        //Consumidores (Consumer<T>) ==> Lambdas con un parametro
        int p = 6;
        p -> System.out.println(p);

        //BiConsumidores (BiConsumer<T,U>) ==> Lambdas con 2 parametros
        (p,q)-> System.out.println(p+q);

        //Proveedores (Suplier<T>) ==> Lambdas sin parametros
        ()->10;

        //Funciones (BiFunction<T,U>) ==> Lamndas con un parametro
        p->p+10;

        //BiFunciones (BIFunctios<T,U,R>) ==> Lamndas que reciben varios parametros
        (p,q)-> p+q;

        //Predicados (Predicate<T>) ==>Lambdas con un parametro
        p-> p=10;

        //BiPredicados (BiPredicate<T,U>) ==> Lambda con 2 parametros que retorna un booleano
        (p,q) -> p==q;


        ArrayList<String> a = new ArrayList<>();
        a.forEach(System.out::println);//lambda Consumer

         */

        /*--------Streams----------
        se usa cuando se trabaja sobre collections
        consta de 3 partes
        1-invocacion a fuente ==>ej: Collections.stream()
        2-operacion intermedia ==>ej: filter()
                                       map()
                                       mapToInt()

        3-operaciones terminales==> ej: findFirst
                                        count() min() max()
                                        forEach()
                                        collect()



        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("hola");
        arrayList.add("palabra");
        arrayList.add("chau");
        arrayList.add("si");

        //invocacion==>operacion intermedia(puede haber varias)==>operacion terminal(solo puede haber una)
        arrayList.stream().filter(elemento-> elemento.equals("hola"))//recorre el array y busca dentro de los elementos "hola
         .collect(Collectors.toList());                               //si esta retorna TRUE, sino FALSE
                                                        //collector.toList me lo guarda en una lista


        arrayList.stream().filter(elemento-> elemento.toUpperCase())
                .forEach(System.out::println); //recorro, cambio a mayuscula y lo muestro por pantalla
    */

        List<Integer> arrayNumeros = List.of(15, 5, 26, 8);
        List<String> arrayNombres = List.of("Marcos", "Julieta", "Nacho");
        List<String> arrayNombresNuevos = List.of("Martin", "Pedro", "Marcos", "Jose");


        //sumamos todos los elementos de la lista de numeros enteros
        //el stream recorre la lista, utilizamos una lambda que arranque en 0 y va a acumular los numeros

        int result = arrayNumeros.stream().reduce(0, (accum, num) -> accum + num);//el reduce devuelve un resultado
        System.out.println(result);

        //calculamos el promedio de la lista de numeros enteros
        //el average requiere del mapToInt y siempre es un OptionalDouble
        OptionalDouble resultado = arrayNumeros.stream().mapToInt(num -> num).average();
        System.out.println(resultado.getAsDouble());//el optional me devuelve si o si un valor aunque los elementos fueran null

        //filtramos la lista de nombres y la guardamos en una nueva lista
        List<String> listaResult = arrayNombres.stream()
                .filter(nombre -> !nombre.equalsIgnoreCase("Marcos"))
                .collect(Collectors.toList());

        listaResult.forEach(System.out::println);

        //buscamos una concurrencia en una lista y solo retornamos el primero
        String palabra = arrayNombres.stream().filter(nombre -> nombre.equals("Nacho")).findFirst().get();

        System.out.println("el resultado de la busqueda es : " + palabra);

        //comparamos dos listas con nombre para verificas duplicados
        List<String> union = arrayNombres.stream()
                .filter(nombre -> !arrayNombresNuevos.contains(nombre))
                .collect(Collectors.toList());

        union.addAll(arrayNombresNuevos);

        union.forEach(System.out::println);

    }
}
