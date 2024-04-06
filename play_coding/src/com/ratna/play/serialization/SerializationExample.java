package com.ratna.play.serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationExample {

	public static void main(String[] args) {
		try {
			Student stu = new Student("Parmander", "MCA", "MCA/07/27");
			// Creating FileOutputStream object.
			FileOutputStream fos = new FileOutputStream("student.json");

			// Creating an ObjectOutputStream object.
			ObjectOutputStream oos = new ObjectOutputStream(fos);

			// write object.
			oos.writeObject(stu);

			// close streams.
			oos.close();
			fos.close();

			System.out.println("Serialized data is saved in " + "student.ser");
		} catch (IOException e) {
			System.out.println(e);
		}
	}

}
