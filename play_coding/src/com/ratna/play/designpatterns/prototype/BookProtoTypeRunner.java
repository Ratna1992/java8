package com.ratna.play.designpatterns.prototype;

public class BookProtoTypeRunner {

	public static void main(String[] args) throws CloneNotSupportedException {

		BookShop bookShop1 = new BookShop();
		bookShop1.setShopName("R Books");
		// loading from database
		bookShop1.loadBooks();

		BookShop bookShop2 = (BookShop) bookShop1.clone();
		bookShop2.setShopName("L Books");
		// we shouldn't load it again from database but here loading from prototype
		// bookShop2.loadBooks();
		// bookShop1.getBookList().remove(0);
		System.out.println(bookShop1);
		System.out.println(bookShop2);
	}
}
