package io.learn.java8.lambda;


interface EvenOddNumber {
	void check(int a);
}

public class AnonymousImplementation {
	public static void main(String args[])
	{
		EvenOddNumber evenorodd =new 	EvenOddNumber(){

			@Override
			public void check(int a) {
				// TODO Auto-generated method stub
				if(a%2==0)
				{
					System.out.println("Number "+a+" is even.");
				}
				else
				{
					System.out.println("Number "+a+" is odd.");
				}
				
				
			}
			
		
	};
	evenorodd.check(5);

}
}

