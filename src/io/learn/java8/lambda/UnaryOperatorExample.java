package io.learn.java8.lambda;

import java.util.function.UnaryOperator;

public class UnaryOperatorExample {
	public static void main(String[] args) {

		UnaryOperator<Integer> operator = t -> t * 2;

		System.out.println(operator.apply(5));
		System.out.println(operator.apply(10));
		System.out.println(operator.apply(15));
	}
}
