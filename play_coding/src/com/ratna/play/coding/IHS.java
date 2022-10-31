package com.ratna.play.coding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class IHS {

	public static List<String> getAllPossibleWordsFromChar() {
		char[] charArray = new char[] { 'c', 'a', 't' };
		List<String> wordList = new ArrayList<String>();
		try {

			// character[] converted to List<String>
			for (int i = 0; i < charArray.length; i++) {
				Character c = charArray[i];
				for (int j = 0; j < charArray.length; j++) {
					Character d = charArray[j];
					for (int k = 0; k < charArray.length; k++) {
						Character e = charArray[k];
						wordList.add(new String(c.toString() + d.toString() + e.toString()));
					}
				}
			}

			// let's check for other words

		} catch (Exception e) {
			e.printStackTrace();
		}

		return wordList;
	}

	public static void main(String[] args) {
		List<String> allPossibleWordsFromChar = getAllPossibleWordsFromChar();
		List<Future<Boolean>> list = new ArrayList<>();
		ExecutorService newFixedThreadPool = Executors.newFixedThreadPool(allPossibleWordsFromChar.size());
		try {
			for (String word : allPossibleWordsFromChar) {
				Callable<Boolean> call = () -> mockApi(word);
				list.add(newFixedThreadPool.submit(call));
			}
		} catch (Exception e) {

		} finally {
			newFixedThreadPool.shutdown();
		}
		list.forEach(s -> {
			try {
				System.out.println(s.get());
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ExecutionException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});
	}

	public static boolean mockApi(String name) throws InterruptedException {
		List<String> mockList = Arrays.asList("cat", "act");
		Thread.sleep(300);
		return mockList.contains(name);

	}

}
