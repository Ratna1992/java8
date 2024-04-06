package com.ratna.play.deserialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import com.ratna.play.serialization.Student;

public class DeserializationExample {

	public static void main(String[] args) {
		try {

			// Creating FileInputStream object.
			FileInputStream fos = new FileInputStream("student.json");

			// Creating an ObjectInputStream object.
			ObjectInputStream oos = new ObjectInputStream(fos);

			// read object.
			Student student = (Student) oos.readObject();
			System.out.println(student.getName() + " " + student.getRollNo());
			// close streams.
			oos.close();
			fos.close();
		} catch (IOException | ClassNotFoundException e) {
			System.out.println(e);
		}
	}

}
