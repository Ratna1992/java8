package com.ratna.play.keywords;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Zee implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private transient String subscriptionCost;
	private String movie;

	public Zee(String subscriptionCost, String movie) {
		super();
		this.subscriptionCost = subscriptionCost;
		this.movie = movie;
	}

	@Override
	public String toString() {
		return "Zee [movie=" + movie + "]";
	}

	public String getSubscriptionCost() {
		return subscriptionCost;
	}

	public void setSubscriptionCost(String subscriptionCost) {
		this.subscriptionCost = subscriptionCost;
	}

	public String getMovie() {
		return movie;
	}

	public void setMovie(String movie) {
		this.movie = movie;
	}

}

public class TransientKeyword {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		Zee zee = new Zee("1200", "RRR");
		// writing object to file
		FileOutputStream fileOutputStream = new FileOutputStream("subscription.txt");
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
		objectOutputStream.writeObject(zee);
		objectOutputStream.flush();
		objectOutputStream.close();
		fileOutputStream.close();

		// reading object from file
		FileInputStream fileInputStream = new FileInputStream("subscription.txt");
		ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
		Zee readObject = (Zee) objectInputStream.readObject();
		System.out.println(readObject.getMovie());
		System.out.print(readObject.getSubscriptionCost());
		objectInputStream.close();
		fileInputStream.close();
	}

}
