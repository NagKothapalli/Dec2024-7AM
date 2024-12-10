package basicConcepts;

import org.junit.Test;

public class ConditionalStatements
{
	 int a = 20;
	 int b = 25;
	
	/*
	 * public  void main(String[] args) { compareNumbers_ifelse(22,22);
	 * compareNumbers_ifelse(22,28); }
	 */
	
	// if(expression -> boolean : true / false) {  task } 
	@Test
	public  void compareNumbers()
	{
		if(a==b)  // = : assignment operator ,  == : relational operator
		{
			//true
			//task
			System.out.println("Both A and B are equal");
		}
	}
	@Test
	public  void compareNumbers_ifelse()
	{
		if(a==b)  // = : assignment operator ,  == : relational operator
		{
			//true
			//task
			System.out.println("Both A and B are equal");
		}
		else
		{
			System.out.println("Both A and B are not equal");
		}
	}
	
	@Test
	public void compareNumbers_ifelse_unitTest() // Unit Test Case // TDD : Test Driven Development
	{
		compareNumbers_ifelse(22,22); //  5/10 = 50 %
		compareNumbers_ifelse(22,62); // 5/10 = 50 %
	}
	
	// Write a Java program to read two integers as input and compare the numbers
	public  void compareNumbers_ifelse(int a,int b)  // Dev code
	{
		System.out.println("A value : " + a);
		System.out.println("B value :" + b);
		if(a==b)  // = : assignment operator ,  == : relational operator
		{
			//true
			//task
			System.out.println("Both A and B are equal");
		}
		else
		{
			System.out.println("Both A and B are not equal");
		}
	}
	
	// Write a Java program to read two integers as input , perform addition if they are equal , subtraction a>b , multiplication a < b
	@Test
	public void compareNumbers_elseif_unitTest()
	{
		compareNumbers_elseif(44,44); // 33.3333 %
		compareNumbers_elseif(454,44); // 33.3333 %
		compareNumbers_elseif(44,84); // 33.3333 %
	}
	
	public  void compareNumbers_elseif(int x,int y)  // Dev code
	{
		System.out.println("First Number : " + x);
		System.out.println("Second Number :" + y);
		if(x==y)  // = : assignment operator ,  == : relational operator
		{
			int sum = (x+y);
			System.out.println("Sum of two numbers :" + sum);
		}
		else if(x>y)
		{
			int diff = (x-y);
			System.out.println("Difference of two numbers :" + diff);
		}
		else if(x<y)
		{
			int prod = (x * y);
			System.out.println("Product of the two numbers :" + prod);
		}
	
	}
	
	// Write a Java program to read two integers as input , perform the below task if and only if both inputs are above 10
	
	  // Task : perform addition if they are equal , subtraction a>b , multiplication a < b
	@Test
	public void nestedIfCondition_unitTest()
	{
		nestedIfCondition(6,8);
		nestedIfCondition(66,8);
		nestedIfCondition(6,88);
		nestedIfCondition(66,66);
		nestedIfCondition(666,77);
		nestedIfCondition(46,887);
	}
	public void nestedIfCondition(int x,int y)
	{
		System.out.println("First Number : " + x);
		System.out.println("Second Number :" + y);
		//   T           T
		if((x >10) && (y>10))   // Nested if -  Outer IF   , > < : Relaational   , && : logical
		{
			//T
			if(x==y)  // Inner IF// = : assignment operator ,  == : relational operator
			{
				int sum = (x+y); // arithematic
				System.out.println("Sum of two numbers :" + sum);
			}
			else if(x>y)
			{
				int diff = (x-y);  // = : assignment
				System.out.println("Difference of two numbers :" + diff);
			}
			else if(x<y)
			{
				int prod = (x * y);
				System.out.println("Product of the two numbers :" + prod);
			}
		}
		else
		{
			System.out.println("Both x and y or any one of them might be below 10");
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
