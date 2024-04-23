package com.ratna.play.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TerminalOperationsExample {
    public static void main(String[] args) {
        List<Product> productsList = new ArrayList<Product>();
        //Adding Products
        productsList.add(new Product(1, "HP Laptop", 25000f));
        productsList.add(new Product(2, "Dell Laptop", 30000f));
        productsList.add(new Product(3, "Lenevo Laptop", 28000f));
        productsList.add(new Product(4, "Sony Laptop", 28000f));
        productsList.add(new Product(5, "Apple Laptop", 90000f));

        //filter/foreach
        productsList.stream().filter(product -> product.getPrice() == 30000).forEach(product -> System.out.println(product.getName()));

        //mapreduce
        Float reduce = productsList.stream().map(product -> product.getPrice()).reduce(0.0f, Float::sum);
        System.out.println(reduce);

        //max()
        Product maxProduct = productsList.stream().max((product1, product2) -> product1.getPrice() > product2.getPrice() ? 1 : -1).get();
        System.out.println(maxProduct);

        //min()
        Product minProduct = productsList.stream().min((product1, product2) -> product1.getPrice() > product2.getPrice() ? 1 : -1).get();
        System.out.println(minProduct);

        //count()
        long count = productsList.stream().filter(product -> product.getPrice() < 30000).count();
        System.out.println(count);

        // Converting product List into Set
        Set<Float> productPriceList = productsList.stream().filter(product -> product.getPrice() < 30000)   // filter product on the base of price
                .map(product -> product.getPrice()).collect(Collectors.toSet());   // collect it as Set(remove duplicate elements)
        System.out.println(productPriceList);

        // Converting Product List into a Map
        Map<Integer, Product> productPriceMap = productsList.stream().collect(Collectors.toMap(p -> p.getId(), p -> p));
        System.out.println(productPriceMap);

        List<Integer> numbers = new ArrayList<Integer>();
        numbers.add(100);
        numbers.add(110);
        numbers.add(120);
        numbers.add(150);
        numbers.add(110);
        System.out.println(numbers);
        Stream<Integer> stream = numbers.stream();
        Object[] intArray = stream.toArray();
        for(Object element:intArray) {
            System.out.print(element+" ");
        }


    }
}
