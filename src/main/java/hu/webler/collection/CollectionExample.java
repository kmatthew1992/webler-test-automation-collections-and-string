package hu.webler.collection;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionExample {

    public static void main(String[] args) {

        Collection<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        for (Integer num : numbers){
        System.out.println(num);
        }
    }
}
