package io.learn.java8.lambda;

import java.util.function.BiConsumer;

public class BiConsumerExample {

public static void main(String[] args) {
	BiConsumer<Integer, String> consumer = (a, b) -> {
		System.out.println(a + b);
	};
	consumer.accept(8, " Java8");
}
}
