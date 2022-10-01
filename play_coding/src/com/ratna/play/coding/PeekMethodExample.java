package com.ratna.play.coding;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.ratna.play.model.User;

public class PeekMethodExample {

	public static void main(String[] args) {
		Stream<String> nameStream = Stream.of("Alice", "Bob", "Chuck");
		nameStream.peek(System.out::println);

		Stream.of("one", "two", "three", "four").filter(e -> e.length() > 3)
				.peek(e -> System.out.println("Filtered value: " + e)).map(String::toUpperCase)
				.peek(e -> System.out.println("Mapped value: " + e)).collect(Collectors.toList());

		Stream<User> userStream = Stream.of(new User("Alice"), new User("Bob"), new User("Chuck"));
		userStream.peek(u -> u.setName(u.getName().toLowerCase())).forEach(System.out::println);
	}

}
