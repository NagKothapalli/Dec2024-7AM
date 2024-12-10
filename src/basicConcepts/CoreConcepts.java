package basicConcepts;

public class CoreConcepts
{
	//Modifier[optional    class  Name{ Members: variables / functions   }
	
	//Access Modifiers : private , default , public , protected
	
	//Non Access Modifier : static , final ....
	
	//signature : variable
	
	//Modifier[opt]  Datatype name ;            Modifier[opt]  Datatype name = value ;
	
	public int stdNum = 22;
	
	private double stdMarks = 80.45;
	
	char stdGrade = 'A';
	
	protected boolean stdResult = true;
	
	public String stdName = "Ram";
	
	public static final String collegeName = "JNTU";
	
	//signature of function : 
	
	 // Modifier[opt]    ReturnType Name(){  body  }
	
	 // Modifier[opt]    ReturnType Name(arguments.....){  body  }
	
	//Every java class will have only one entry point : main method
	
	//Naming conventions of class member : variable / function 
	
	       // _ , a-z , A-Z , $ 
	       //  camelCasing
	
	int _stdNum;   int studentName ; int StudentName;  int $stdName; int std1Name;   int stdName1;
	
	public void _addition() { }
	
	public void $addition() { }
	
	public void Addition() { }
	
	public void addition1() { }
	
	//int stdName;
	
	//psvm
	
	public static void main(String[] args)
	{
		System.out.println("Welcome to Java");
		addition();
		addition(22,25);
		//addition(40,80);
		//addition(120,160);
		addition(400,600,200);
		//addition(400,600,200,600);
		int sum = addition(20,40,60,80);
		int avg = sum/4;
		System.out.println("Sum of four numbers :" + sum);
		System.out.println("Average of four nubers :" + avg);
	}
	
	// 0  0 
	public static void addition()
	{
		//body
		int num1 = 22;
		int num2 = 25;
		int sum = num1 + num2 ;
		System.out.println("Sum of two numbers :" + sum);
	}
	//0 1
	public static void addition(int a,int b)
	{
		int sum = a + b ; 
		System.out.println("Sum of two numbers - 2 :" + sum);
	}
	
	public static void addition(int a,int b,int c)
	{
		int sum = a + b + c; 
		System.out.println("Sum of three numbers - 3 :" + sum);
	}
	// 1 1
	
	public static int addition(int a,int b,int c,int d)
	{
		int sum = a+b+c+d;
		return sum; //output of the function
	}
	
	
	
	
	
	
	


}


class Yahoo
{
	public static void Main(String[] args)
	{
		System.out.println(CoreConcepts.collegeName);
		//CoreConcepts.collegeName = "JNTUH";
		//System.out.println(CoreConcepts.);
	}
	
}

















class Amazon
{
	
}
