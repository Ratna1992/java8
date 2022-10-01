package com.ratna.play.collectors;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class JoiningMethodExample {

	public static void main(String[] args) {

		List<String> list = List.of("Java", "Java-8", "Java Streams", "Concurrency");
		String appendedString = list.stream().collect(Collectors.joining(","));
		System.out.println(appendedString);

		String appendedString1 = list.stream().collect(Collectors.joining(",", "[", "]"));
		System.out.println(appendedString1);

		// empty stream
		System.out.println(List.<String>of().stream().collect(Collectors.joining(",")));

		// collectors joining new line
		System.out.println(list.stream().collect(Collectors.joining("\n")));

		String noappendedString = list.stream().collect(Collectors.joining());
		System.out.println(noappendedString);

		String collect = list.stream().map(Function.identity()).collect(Collectors.joining("-"));
		System.out.println(collect);

	}

}
