package com.ratna.play.multiplelists;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import com.ratna.play.model.Person;
import com.ratna.play.model.PersonModel;
import com.ratna.play.model.Role;

public class GetSingleObjectFromMultipleLists {

	public static List<Person> getPersonList() {
		Person p1 = new Person("ratna", 30, "1234", "8499899121");
		Person p2 = new Person("rana", 25, "1235", "8499899122");
		Person p3 = new Person("ramana", 27, "1236", "8499899123");
		return Arrays.asList(p1, p2,p3);
	}

	public static List<Role> getRoleList() {
		Role r1 = new Role("1234", "CEO");
		Role r2 = new Role("1235", "admin");
		Role r3 = new Role("1236", "programmer");
		Role r4 = new Role("1237", "engineer");
		return Arrays.asList(r1, r2, r3, r4);
	}

	public static void main(String[] args) {

		List<PersonModel> collect = getPersonList().stream().map(person -> {
			Optional<Role> role = getRoleList().stream()
					.filter(r -> r.getDesignationId().equalsIgnoreCase(person.getDesgId())).findAny();
			if (role.isPresent()) {
				return new PersonModel(person.getName(), person.getAge(), person.getDesgId(), person.getMobileNo(),
						role.get().getDesignation());
			} else {
				return null;
			}
		}).filter(persondetails -> persondetails != null).collect(Collectors.toList());

		collect.forEach(System.out::println);
	}

}
