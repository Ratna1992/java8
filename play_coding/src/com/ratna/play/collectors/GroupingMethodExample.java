package com.ratna.play.collectors;

import com.ratna.play.model.BlogPost;
import com.ratna.play.model.BlogPostType;
import com.ratna.play.model.Item;

import java.math.BigDecimal;
import java.util.*;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;

public class GroupingMethodExample {

    public static void main(String[] args) {

        List<BlogPost> list = Arrays.asList(new BlogPost("abc", "hij", BlogPostType.GUIDE, 23), new BlogPost("def", "jkl", BlogPostType.GUIDE, 25), new BlogPost("ghi", "hij", BlogPostType.NEWS, 21), new BlogPost("xyz", "pqrs", BlogPostType.REVIEW, 43));

        //grouping by single property blog post type
        // {NEWS=[BlogSpot [title=ghi, author=hij, type=NEWS, likes=21]],
        // GUIDE=[BlogSpot [title=abc, author=hij, type=GUIDE, likes=23], BlogSpot [title=def, author=jkl, type=GUIDE, likes=25]],
        // REVIEW=[BlogSpot [title=xyz, author=pqrs, type=REVIEW, likes=43]]}
        Map<BlogPostType, List<BlogPost>> collect = list.stream().collect(Collectors.groupingBy(BlogPost::getType));
        System.out.println("grouping by single property blog post type " + collect);

        //grouping by two properties and using mapping {pqrs=[43], hij=[23, 21], jkl=[25]}
        Map<String, List<Integer>> collect2 = list.stream().collect(Collectors.groupingBy(BlogPost::getAuthor, Collectors.mapping(BlogPost::getLikes, Collectors.toList())));
        System.out.println("grouping by two properties and using mapping " + collect2);


        //grouping by one property and using counting {NEWS=1, GUIDE=2, REVIEW=1}
        Map<BlogPostType, Long> collect3 = list.stream().collect(Collectors.groupingBy(BlogPost::getType, Collectors.counting()));
        System.out.println("grouping by one property and using counting " + collect3);

        // grouping by two properties and using mapping and converting to treemap {21=[hij], 23=[hij], 25=[jkl], 43=[pqrs]}
        TreeMap<Integer, List<String>> collect4 = list.stream().collect(Collectors.groupingBy(BlogPost::getLikes, TreeMap::new, Collectors.mapping(BlogPost::getAuthor, Collectors.toList())));
        System.out.println("grouping by two properties and using mapping and converting to treemap " + collect4);

        List<String> items = Arrays.asList("apple", "apple", "banana", "apple", "orange", "banana", "papaya");
        //counting each word inside a list {papaya=1, orange=1, banana=2, apple=3}
        Map<String, Long> collect5 = items.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println("collect5 "+collect5);

        //counting each word by converting to uppercase inside a list {APPLE=3, PAPAYA=1, BANANA=2, ORANGE=1}
        Map<String, Long> collect6 = items.stream().collect(Collectors.groupingBy(String::toUpperCase, Collectors.counting()));
        System.out.println("collect6 "+collect6);

        // sorting a map and storing in new map {PAPAYA=1, ORANGE=1, BANANA=2, APPLE=3}
        LinkedHashMap<String, Long> collect7 = collect6.entrySet().stream().sorted(Map.Entry.comparingByValue()).collect(Collectors.toMap(Entry::getKey, Entry::getValue, (oldValue, newValue) -> newValue, LinkedHashMap::new));
        System.out.println("collect7 "+collect7);

        // sorting a map and storing in new map {APPLE=3, BANANA=2, ORANGE=1, PAPAYA=1}
        LinkedHashMap<String, Long> collect8 = collect6.entrySet().stream().sorted(Map.Entry.comparingByKey()).collect(Collectors.toMap(Entry::getKey, Entry::getValue, (oldValue, newValue) -> newValue, LinkedHashMap::new));
        System.out.println("collect8 "+collect8);

        List<Item> itemsList = Arrays.asList(new Item("apple", 10, new BigDecimal("9.99")), new Item("banana", 20, new BigDecimal("19.99")), new Item("orang", 10, new BigDecimal("29.99")), new Item("watermelon", 10, new BigDecimal("29.99")), new Item("papaya", 20, new BigDecimal("9.99")), new Item("apple", 10, new BigDecimal("9.99")), new Item("banana", 10, new BigDecimal("19.99")), new Item("apple", 20, new BigDecimal("9.99")));

        // group by name and count {papaya=1, banana=2, apple=3, orang=1, watermelon=1}
        Map<String, Long> collect9 = itemsList.stream().collect(Collectors.groupingBy(Item::getName, Collectors.counting()));
        System.out.println("collect9 "+collect9);

        // group by name and sum {papaya=20, banana=30, apple=40, orang=10, watermelon=10}
        Map<String, Integer> collect10 = itemsList.stream().collect(Collectors.groupingBy(Item::getName, Collectors.summingInt(Item::getQty)));
        System.out.println("collect10 "+collect10);

        // group by price {19.99=[Item [name=banana, qty=10, price=19.99], Item [name=banana, qty=20, price=19.99]],
        // 29.99=[Item [name=orang, qty=10, price=29.99], Item [name=watermelon, qty=10, price=29.99]],
        // 9.99=[Item [name=apple, qty=10, price=9.99], Item [name=papaya, qty=20, price=9.99], Item [name=apple, qty=20, price=9.99], Item [name=apple, qty=10, price=9.99]]}
        Map<BigDecimal, Set<Item>> collect11 = itemsList.stream().collect(Collectors.groupingBy(Item::getPrice, Collectors.mapping(Function.identity(), Collectors.toSet())));
        System.out.println("collect11 "+collect11);
    }

}
