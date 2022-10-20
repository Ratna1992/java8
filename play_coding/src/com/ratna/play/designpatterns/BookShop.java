package com.ratna.play.designpatterns;

import java.util.ArrayList;
import java.util.List;

public class BookShop implements Cloneable {

	private String shopName;

	private List<Book> bookList = new ArrayList<>();

	public String getShopName() {
		return shopName;
	}

	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

	public List<Book> getBookList() {
		return bookList;
	}

	public void setBookList(List<Book> bookList) {
		this.bookList = bookList;
	}

	@Override
	public String toString() {
		return "BookShop [shopName=" + shopName + ", bookList=" + bookList + "]";
	}

	public void loadBooks() {
		for (int i = 0; i < 10; i++) {
			Book b = new Book(i, "Book " + i);
			getBookList().add(b);
		}
	}

	// shallow cloning
	/*
	 * @Override protected Object clone() throws CloneNotSupportedException { //
	 * TODO Auto-generated method stub return super.clone(); }
	 */

	// deep cloning
	@Override
	protected BookShop clone() throws CloneNotSupportedException {
		BookShop bookShop = new BookShop();
		for (Book book : this.getBookList()) {
			bookShop.getBookList().add(book);
		}
		return bookShop;
	}
}
