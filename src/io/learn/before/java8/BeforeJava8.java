package io.learn.before.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class BeforeJava8 {

	public static void main(String[] args) {

		 //foreach();
		 //filter();
		//map();
		 reduce();
		// collect();
		// flatmap();

	}

	public static void foreach() {
		List<String> lines = Arrays.asList("Welcome", "to", "Java8");
		/* Before JAVA8 */
		for (String line : lines) {
			System.out.println(line);
		}
	}

	public static void filter() {
		List<Child> list = new ArrayList<Child>();

		list.add(new Child(111, "name1", 5, "J2EE"));
		list.add(new Child(112, "name2", 7, "Spring Core"));
		list.add(new Child(113, "name3", 10, "Spring MVC"));
		list.add(new Child(114, "name4", 13, "SpringBoot"));

		for (Child lists : list) {
			if (lists.getExperiance() > 5) {
				System.out.println(lists.name);
			}
		}
	}

	public static void map() {
		List<Child> list = new ArrayList<Child>();

		list.add(new Child(111, "name1", 5, "J2EE"));
		list.add(new Child(112, "name2", 7, "Spring Core"));
		list.add(new Child(113, "name3", 10, "Spring MVC"));
		list.add(new Child(114, "name4", 13, "SpringBoot"));
		for (Child lists : list) {
			if (lists.getExperiance() > 5) {
				System.out.println(lists.getName().concat("-" + lists.getTechnology()));
			}
		}
	}

	public static void reduce() {

		List<Child> list = new ArrayList<Child>();

		list.add(new Child(111, "name1", 5, "J2EE"));
		list.add(new Child(112, "name2", 7, "Spring Core"));
		list.add(new Child(113, "name3", 10, "Spring MVC"));
		list.add(new Child(114, "name4", 13, "SpringBoot"));
		int count = 0;
		for (Child lists : list) {
			if (lists.getExperiance() > 5)
				count = count + lists.getExperiance();
		}
		System.out.println("Count is " + count);
	}

	public static void collect() {
		List<Child> list = new ArrayList<Child>();

		list.add(new Child(111, "name1", 5, "J2EE"));
		list.add(new Child(112, "name2", 7, "Spring Core"));
		list.add(new Child(113, "name3", 10, "Spring MVC"));
		list.add(new Child(114, "name4", 13, "SpringBoot"));
		List<String> modList = new ArrayList<String>();
		for (Child lists : list) {
			if (lists.getExperiance() > 5) {
				modList.add(lists.getName().concat("-" + lists.getTechnology()));

			}
		}
		System.out.println(modList);
	}

	public static void flatmap() {
		List<Child> users = Arrays.asList(new Child(111, "name1", Arrays.asList("90000000001", "90000000002")),
				new Child(112, "name2", Arrays.asList("90000000003", "90000000004")),
				new Child(113, "name3", Arrays.asList("90000000005", "90000000006")));

		List<String> flat = new ArrayList<String>();
		for (Child user : users) {
			flat.addAll(user.getPhonenumbers());
		}

		System.out.println(flat);
	}

}
