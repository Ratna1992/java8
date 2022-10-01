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

		Map<Boolean, List<Item>> map = itemsList.stream().collect(Collectors.partitioningBy(item -> item.getPrice().intValue() > 10));
		System.out.println(map);
	}

}
