package io.learn.after.java8.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import io.learn.before.java8.Child;

public class AfterJava8 {

	public static void main(String[] args) {

	//	foreach();
		 //filter();
		 //map();
		//reduce();
		 //collect();
		// flatmap();
		//minMax();
		//parllelstream();
		 performance();

	}

	public static void foreach() {
		List<String> lines = Arrays.asList("Welcome", "to", "Java8");
		lines.forEach(System.out::println);
	}

	public static void filter() {
		List<Child> list = new ArrayList<Child>();
		list.add(new Child(111, "name1", 5, "J2EE"));
		list.add(new Child(112, "name2", 7, "Spring Core"));
		list.add(new Child(113, "name3", 10, "Spring MVC"));
		list.add(new Child(114, "name4", 13, "SpringBoot"));

		list.stream().filter(s -> s.getExperiance() > 5).forEach(p -> System.out.println(p.getName()));
	}

	public static void map() {
		List<Child> list = new ArrayList<Child>();
		list.add(new Child(111, "name1", 5, "J2EE"));
		list.add(new Child(112, "name2", 7, "Spring Core"));
		list.add(new Child(113, "name3", 10, "Spring MVC"));
		list.add(new Child(114, "name4", 13, "SpringBoot"));
		list.stream().filter(s -> s.getExperiance() > 5).map(a -> a.getName() + "-" + a.getTechnology())
				.forEach(System.out::println);
		
		
	}

	public static void reduce() {
		List<Child> list = new ArrayList<Child>();
		list.add(new Child(111, "name1", 5, "J2EE"));
		list.add(new Child(112, "name2", 7, "Spring Core"));
		list.add(new Child(113, "name3", 10, "Spring MVC"));
		list.add(new Child(114, "name4", 13, "SpringBoot"));

		list.stream().filter(s -> s.getExperiance() > 5).map(get -> get.getExperiance()).reduce((x, y) -> (x + y))
				.ifPresent(s -> System.out.println(s));
		list.stream().filter(s -> s.getExperiance() > 5).map(get -> get.getName()).reduce((x, y) -> (x + "," + y))
				.ifPresent(s -> System.out.println(s));
		int multiple = list.stream().filter(s -> s.getExperiance() > 5).map(get -> get.getExperiance()).reduce(1,
				(x, y) -> (x * y));
		System.out.println(multiple);
		list.stream().filter(s -> s.getExperiance() > 5).map(get -> get.getExperiance()).reduce(Integer::sum)
				.ifPresent(s -> System.out.println(s));
	}

	public static void collect() {
		List<Child> list = new ArrayList<Child>();
		list.add(new Child(111, "name1", 5, "J2EE"));
		list.add(new Child(112, "name2", 7, "Spring Core"));
		list.add(new Child(113, "name3", 10, "Spring MVC"));
		list.add(new Child(114, "name4", 13, "SpringBoot"));
		List<String> modList1 = list.stream().filter(s -> s.getExperiance() > 5)
				.map(a -> a.getName() + "-" + a.getTechnology()).collect(Collectors.toList());
		System.out.println(modList1);
	}

	public static void flatmap() {
		List<Child> users = Arrays.asList(new Child(111, "name1", Arrays.asList("90000000001", "90000000002")),
				new Child(112, "name2", Arrays.asList("90000000003", "90000000004")),
				new Child(113, "name3", Arrays.asList("90000000005", "90000000006")));

		List<String> flatList = users.stream().map(x -> x.getPhonenumbers()).flatMap(y -> y.stream())
				.collect(Collectors.toList());
		System.out.println("FLATLIST-" + flatList);
	}

	public static void minMax() {
		List<Child> users = Arrays.asList(new Child(111, "name1", Arrays.asList("90000000001", "90000000002")),
				new Child(112, "name2", Arrays.asList("90000000003", "90000000004")),
				new Child(113, "name3", Arrays.asList("90000000005", "90000000006")));

		Child minObject = users.stream().min(Comparator.comparing(Child::getId)).get();
		Child maxObject = users.stream().max(Comparator.comparing(Child::getId)).get();

		System.out.println("minObject = " + minObject);
		System.out.println("maxObject = " + maxObject);
	}
	
	
	
	public static void parllelstream() {
		List<Child> list = new ArrayList<Child>();
		list.add(new Child(111, "name1", 5, "J2EE"));
		list.add(new Child(112, "name2", 7, "Spring Core"));
		list.add(new Child(113, "name3", 10, "Spring MVC"));
		list.add(new Child(114, "name4", 13, "SpringBoot"));
		list.parallelStream().filter(s -> s.getExperiance() > 5).map(a -> a.getName() + "-" + a.getTechnology())
				.forEach(System.out::println);
		
		
	}
	
	
	public static void performance() {
		List numList = new ArrayList();
		
		  for (int i = 0; i < 1000; i++) {
	        	numList.add(i);
	        }
	 
	        // Processing sequentially
	        long startTime = System.currentTimeMillis();
	        numList.stream().forEach(i -> processData((int) i));
	        long endTime = System.currentTimeMillis();
	        double sequentialStreamTimetaken = (endTime - startTime) / 1000;
	        System.out.println("Time required with stream() : " + sequentialStreamTimetaken);
	 
	        // Parallel processing 
	        startTime = System.currentTimeMillis();
	        numList.parallelStream().forEach(i -> processData((int) i));
	        endTime = System.currentTimeMillis();
	        long parallelStreamTimetaken = (endTime - startTime) / 1000;
	        System.out.println("Time required with parallelStream() : " + parallelStreamTimetaken);
	        System.out.println("Differential time : " + (sequentialStreamTimetaken - parallelStreamTimetaken));
	}
	
	public static void processData(int num) {
		 try {
	            Thread.sleep(10);
	        } catch (InterruptedException e) {
	            // TODO Auto-generated catch block
	            e.printStackTrace();
	        }
	}
	

}
