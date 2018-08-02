package io.learn.java8.lambda;

import java.util.function.Consumer;

public class ConsumerExample {
	
	
		public static void main(String[] args) {
			Consumer<Integer> consumer = a -> System.out.println(a * a);
			consumer.accept(5);
			consumer.accept(10);
		}
	}


