package io.learn.java8.lambda;


interface OddEven{
void check(int a);
}

public class LambdaImplementation {
	
	public static void main(String args[])
	{ 
		OddEven oddeven=(a)->{
			if(a%2==0)
			{
				System.out.println("Number "+a+" is even.");
			}
			else
			{
				System.out.println("Number "+a+" is odd.");
			}	
		};
		oddeven.check(3);
	}

}
