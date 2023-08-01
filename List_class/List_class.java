package List_class;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class List_class {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("Maria");
        list.add("Alex");
        list.add("Mario");
        list.add("Anna");

        list.add(2, "Valcar"); // add an element in the position 1

        System.out.println("Tamanho da lista: " + list.size());

        for (String x : list) {
            System.out.println(x);
        }

        System.out.println("----------------");

        list.removeIf(x -> x.charAt(0) == 'M');
        for (String x : list) {
            System.out.println(x);
        }

        System.out.println("----------------");

        System.out.println("Index of Anna: " + list.indexOf("Anna")); //return how much of the solicited element exist in the list
        System.out.println("Index of Edu: " + list.indexOf("Edu")); // if the element is not in the list then 

        System.out.println("----------------");

        List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList()); //a way to filter all the elements that begin with A
        // transform the list in a stream - filter - transform in a list again 
        for(String x :  result){
            System.out.println(x);
        }

        System.out.println("---------------------");
        String name = list.stream().filter(x -> x.charAt(0) == 'V').findFirst().orElse(null); //find the first word that begins with A
        System.out.println(name);
        

        System.out.println("---------------------");
        name = list.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null); //if do not find what is searching return null
        System.out.println(name);
        

}}
