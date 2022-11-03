
package com.ratna.play.collectors;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.stream.Collectors;

import com.ratna.play.model.BlogPost;
import com.ratna.play.model.BlogPostType;
import com.ratna.play.model.Item;

public class GroupingMethodExample {

	public static void main(String[] args) {

		List<BlogPost> list = Arrays.asList(new BlogPost("abc", "hij", BlogPostType.GUIDE, 23),
				new BlogPost("def", "jkl", BlogPostType.GUIDE, 25), new BlogPost("ghi", "hij", BlogPostType.NEWS, 21),
				new BlogPost("xyz", "pqrs", BlogPostType.REVIEW, 43));

		// grouping by single property
		Map<BlogPostType, List<BlogPost>> collect = list.stream().collect(Collectors.groupingBy(BlogPost::getType));
		System.out.println("grouping by single property blogposttype " + collect);

		// grouping by two properties and using mapping
		Map<String, List<Integer>> collect2 = list.stream().collect(Collectors.groupingBy(BlogPost::getAuthor,
				Collectors.mapping(BlogPost::getLikes, Collectors.toList())));

		System.out.println("grouping by two properties and using mapping " + collect2);

		// grouping by one property and using counting
		Map<BlogPostType, Long> collect3 = list.stream()
				.collect(Collectors.groupingBy(BlogPost::getType, Collectors.counting()));
		System.out.println("grouping by one property and using counting " + collect3);

		// grouping by two properties and using mapping and converting to treemap
		TreeMap<Integer, List<String>> collect4 = list.stream().collect(Collectors.groupingBy(BlogPost::getLikes,
				TreeMap::new, Collectors.mapping(BlogPost::getAuthor, Collectors.toList())));
		System.out.println("grouping by two properties and using mapping and converting to treemap " + collect4);

		List<String> items = Arrays.asList("apple", "apple", "banana", "apple", "orange", "banana", "papaya");
		Map<String, Long> collect5 = items.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(collect5);

		Map<String, Long> collect6 = items.stream()
				.collect(Collectors.groupingBy(String::toUpperCase, Collectors.counting()));
		System.out.println(collect6);

		// sorting a map and storing in new map
		LinkedHashMap<String, Long> collect7 = collect6.entrySet().stream().sorted(Map.Entry.comparingByValue())
				.collect(Collectors.toMap(Entry::getKey, Entry::getValue, (oldValue, newValue) -> newValue,
						LinkedHashMap::new));
		System.out.println(collect7);

		// sorting a map and storing in new map
		LinkedHashMap<String, Long> collect8 = collect6.entrySet().stream().sorted(Map.Entry.comparingByKey()).collect(
				Collectors.toMap(Entry::getKey, Entry::getValue, (oldValue, newValue) -> newValue, LinkedHashMap::new));
		System.out.println(collect8);

		List<Item> itemsList = Arrays.asList(new Item("apple", 10, new BigDecimal("9.99")),
				new Item("banana", 20, new BigDecimal("19.99")), new Item("orang", 10, new BigDecimal("29.99")),
				new Item("watermelon", 10, new BigDecimal("29.99")), new Item("papaya", 20, new BigDecimal("9.99")),
				new Item("apple", 10, new BigDecimal("9.99")), new Item("banana", 10, new BigDecimal("19.99")),
				new Item("apple", 20, new BigDecimal("9.99")));

		// group by name and count

		Map<String, Long> collect9 = itemsList.stream()
				.collect(Collectors.groupingBy(Item::getName, Collectors.counting()));
		System.out.println(collect9);

		// group by name and sum
		Map<String, Integer> collect10 = itemsList.stream()
				.collect(Collectors.groupingBy(Item::getName, Collectors.summingInt(Item::getQty)));
		System.out.println(collect10);

		// group by price
		Map<BigDecimal, Set<Item>> collect11 = itemsList.stream()
				.collect(Collectors.groupingBy(Item::getPrice, Collectors.mapping(Function.identity(), Collectors.toSet())));
		System.out.println(collect11);
	}

}
