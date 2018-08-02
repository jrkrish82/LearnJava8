package io.learn.java8.lambda;

import java.util.function.Supplier;

public class SupplierExample {
	public static void main(String[] args) {
		Supplier<String> supplierStr = () -> {
			return "Hello world.";
		};

		Supplier<Number> supplierNum = () -> {
			return 07;
		};

		System.out.println(supplierStr.get());
		System.out.println(supplierNum.get());
	}

}
