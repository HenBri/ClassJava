package vd7;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SampleGenerics {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Fernando");
        list.add("Amilkar");
        list.add("Arminda");
        list.add("Henry");

        for(int i =0; i<list.size();i++){
            System.out.println(list.get(i));

        }
        List<Libro> elementos = new ArrayList<>();
        elementos.add(new Libro());
        elementos.add(new Libro());
        Libreria<Libro, String> libreria = new Libreria<>(elementos, "limpieza");
        for(int i =0; i<elementos.size();i++){
            System.out.println(elementos.get(i).getClass());
        }
        System.out.println(libreria.getMaterial());
        List<Libro> elementos1 = new ArrayList<>();

        elementos1.add(new Libro());
        elementos1.add(new Libro());

        libreria.setElementos(elementos1);
        Libro[] elementos2 = new Libro[2];
        elementos2[0]= new Libro();
        elementos2[1]= new Libro();
        libreria.setElementos2(elementos2);

        libreria.setElementos3(elementos2);

        Libro l1 = new Libro();
        Libro l2 = new Libro();
        Libro l3 = new Libro();

        libreria.setElementos2(new Libro[]{ l1, l2 , l3});
        //esta mejor asi con T...
        libreria.setElementos3(l2,l1,l3,l1);
        SampleGenerics generics = new SampleGenerics();
        //q eee eto ???
        generics.setAction((producto, peso) -> System.out.println("Comprando" + producto));


        // asignar a una variable
        // variable = declaracion del lamda
        //LAMBDA
    }
    public static final byte COMPRAR =1;
    public void setAction(byte action){
        if(action == COMPRAR){
            this.comprar();
        }
    }
    public void setAction(Acction action){
        //action.comprar("palabra", 4);
    }
    public void comprar(){

    }
}
//Investigar Lamda
//apoyar hilos