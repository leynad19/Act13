/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package act13;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

/**
 *
 * @author danyg
 */
public class Act13 {

     private static String[] Palabras = {"Zambrano", "Goyzueta", "Ramirez", "Lopez", "Fernandez",
        "Arenas", "Jimenez", "Montemayor", "Sauceda", "Villarreal", "Barbanegra", "Nuñez", 
        "Casas"};
    
    public static List<String> fillList(List list, int size){
        
        Random rand = new Random();
        
        for(int i= 0; i<size; i++){
            list.add(Palabras[rand.nextInt(Palabras.length)]);
            
        }
        
        return list;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        List<String> list = new ArrayList();
        
        //AnonClass Alfabetica
        Comparator<String> alphabeticalAnon = new Comparator<String>(){
            public int compare(String string1, String string2) {
                return Integer.compare(string1.charAt(0), string2.charAt(0));
            }
        };
        
        //AnonClass Tamaño
        Comparator<String> sizeAnon = new Comparator<String>(){
            public int compare(String string1, String string2) {
                return Integer.compare(string1.length(), string2.length());
            }
        };
        
        //AnonClass Alfabetica
        Comparator<String> alphabeticalLambda = (String string1, String string2) -> Integer.compare(string1.charAt(0), string2.charAt(0));
        
        //AnonClass Tamaño
        Comparator<String> sizeLambda = (String string1, String string2) -> Integer.compare(string1.length(), string2.length());
        
        //Método de referencia alfabetico
        Comparator<String> alphabeticalMethod = alphabeticalAnon::compare;
        
        //Método de referencia tamaño
        Comparator<String> sizeMethod = sizeAnon::compare;
        
        //Ordenar AnonClass Alfabetico
        System.out.println("\nOrdenar AnonClass Alfabetico");
        fillList(list,10);
        System.out.println("Lista antes: \n" + list);
        list.sort(alphabeticalAnon);
        System.out.println("Lista después: \n" + list);
        list.clear();
        
        //Ordenar AnonClass Tamaño
        System.out.println("\nOrdenar AnonClass Tamaño");
        fillList(list,10);
        System.out.println("Lista antes: \n" + list);
        list.sort(sizeAnon);
        System.out.println(" Lista después: \n" + list);
        list.clear();
        
        //Ordenar Lambda Alfabetico
        System.out.println("\nOrdenar Lambda Alfabetico");
        fillList(list,10);
        System.out.println("Lista antes: \n" + list);
        list.sort(alphabeticalLambda);
        System.out.println(" Lista después: \n" + list);
        list.clear();
        
        //Ordenar Lambda Tamaño
        System.out.println("\nOrdenar Lambda Tamaño");
        fillList(list,10);
        System.out.println("Lista antes: \n" + list);
        list.sort(sizeLambda);
        System.out.println("Lista después: \n" + list);
        list.clear();
        
        //Ordenar Metodo de referencia Alfabetico
        System.out.println("\nOrdenar Método de referencia Alfabetico");
        fillList(list,10);
        System.out.println("Lista antes: \n" + list);
        list.sort(alphabeticalMethod);
        System.out.println(" Lista después: \n" + list);
        list.clear();
        
        //Ordenar Metodo de referencia Tamaño
        System.out.println("Ordenar Método de referencia Tamaño");
        fillList(list,10);
        System.out.println("\nLista antes: \n" + list);
        list.sort(sizeMethod);
        System.out.println(" Lista después: \n" + list);
        list.clear();
    }
    
}
