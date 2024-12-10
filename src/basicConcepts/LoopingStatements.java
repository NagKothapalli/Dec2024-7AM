package basicConcepts;

import org.junit.Test;

public class LoopingStatements
{
	@Test
	public void applyColorToSteps()
	{
		System.out.println("Apply color to step : 1");
		System.out.println("Apply color to step : 2");
		System.out.println("Apply color to step : 3");
		System.out.println("Apply color to step : 4");
		System.out.println("Apply color to step : 5"); // 10 steps , 20 steps 
	}
	
	// for  -  from where to start , how long to go , step size
	
	// for(step=1;step<50;step = step+1) { Task / Action } 
	//Definite loop
	@Test
	public void applyColorToSteps_forLoop()
	{
		for(int i=1;i <= 50 ; i = i + 1)
		{
			System.out.println("Apply Color to the Step :" + i);
		}
	}
	
	@Test
	public void applyColorToEvenSteps_Green()
	{
		for(int i=2;i <= 50 ; i=i+2)
		{
			System.out.println("Apply Green Color to the Step :" + i);
		}
	}
	
	@Test
	public void applyColorToOddSteps_Green()
	{
		for(int i=1;i <= 50 ; i=i+2)
		{
			System.out.println("Apply Red Color to the Step :" + i);
		}
	}
	
	//Indefinite
	@Test
	public void findStudent()
	{
		for(int i=1;i<=60;i++)
		{
			System.out.println("Searching the students : "+ i);			
			if(i == 22)
			{
				System.out.println("Found the student");
				break;
			}
		}
	}
	
	@Test
	public void findStudent_while()
	{
		int i=1;
		do
		{
			System.out.println("Searching the students : "+ i);			
			if(i == 22)
			{
				System.out.println("Found the student");
				break;
			}
			i++;
		}
		while(i<=50);
	}
	
	//Nested for loop
	@Test
	public void applyColorToBUilding()
	{
		for(int floor=1;floor<=5;floor++)  // Outer loop
		{
			System.out.println("****************Apply Color in Building Floor :" + floor);
			//we have to apply color to 20 steps in the floor
			//start from step 1 and go till step 20
			for(int step=1;step<=20;step++) // Inner loop
			{
				System.out.println("Apply color to Step :" + step);
			}
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
