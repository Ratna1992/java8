package com.ratna.play.collectors;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.ratna.play.model.Item;

public class PartitioningMethodExample {

	public static void main(String[] args) {
		List<Item> itemsList = Arrays.asList(new Item("apple", 10, new BigDecimal("9.99")),
				new Item("banana", 20, new BigDecimal("19.99")), new Item("orang", 10, new BigDecimal("29.99")),
				new Item("watermelon", 10, new BigDecimal("29.99")), new Item("papaya", 20, new BigDecimal("9.99")),
				new Item("apple", 10, new BigDecimal("9.99")), new Item("banana", 10, new BigDecimal("19.99")),
				new Item("apple", 20, new BigDecimal("9.99")));
		int threshold=10;

		Map<Boolean, List<Item>> map = itemsList.stream().collect(Collectors.partitioningBy(item -> item.getPrice().intValue() > threshold));
		map.forEach((isAboveThreshold, group) -> {
			if (isAboveThreshold) {
				System.out.println("Items above or equal to " + threshold + " price:");
			} else {
				System.out.println("Items below " + threshold + " price:");
			}
			group.forEach(item -> System.out.println("- " + item.getName() + " (" + item.getPrice() + " price)"));
		});
		//Items below 10 price:
		//- apple (9.99 price)
		//- papaya (9.99 price)
		//- apple (9.99 price)
		//- apple (9.99 price)
		//Items above or equal to 10 price:
		//- banana (19.99 price)
		//- orang (29.99 price)
		//- watermelon (29.99 price)
		//- banana (19.99 price)

	}

}
