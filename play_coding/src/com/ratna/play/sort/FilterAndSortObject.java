package com.ratna.play.sort;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.ratna.play.model.BlogPost;
import com.ratna.play.model.BlogPostType;

public class FilterAndSortObject {

	public static void main(String[] args) {
		List<BlogPost> list = Arrays.asList(new BlogPost("abc", "hij", BlogPostType.GUIDE, 23),
				new BlogPost("def", "jkl", BlogPostType.GUIDE, 25), new BlogPost("ghi", "hij", BlogPostType.NEWS, 21),
				new BlogPost("xyz", "pqrs", BlogPostType.REVIEW, 43));

		// first approach
		Comparator<BlogPost> comparator = (BlogPost b1, BlogPost b2) -> b1.getTitle().compareTo(b2.getTitle());
		List<BlogPost> collect = list.stream()
				.filter(obj -> obj.getTitle().startsWith("abc") || obj.getAuthor().startsWith("hij")).sorted(comparator)
				.collect(Collectors.toList());
		System.out.println(collect);

		// second approach
		List<BlogPost> collect1 = list.stream()
				.filter(obj -> obj.getTitle().startsWith("abc") || obj.getAuthor().startsWith("hij"))
				.sorted(Comparator.comparing(BlogPost::getTitle).reversed()).collect(Collectors.toList());
		System.out.println(collect1);
	}

}
