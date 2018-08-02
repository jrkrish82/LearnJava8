
package io.learn.java8.lambda;

interface EvenOdd {
	void check(int a);
}

public class InterfaceImplementation{
	public static void main(String args[])
	{
		CheckOddorEven oddoreven=new CheckOddorEven();
		oddoreven.check(7);
	}
}

 class CheckOddorEven implements EvenOdd {

	@Override
	public void check(int a) {
		if(a%2==0)
		{
			System.out.println("Number "+a+" is even.");
		}
		else
		{
			System.out.println("Number "+a+" is odd.");
		}
		
	}
}