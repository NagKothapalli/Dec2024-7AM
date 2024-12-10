package multilevelInheritance;

import org.junit.Test;
//   A extends B  extends C -> A inherits C indirectly
public class TestSuites extends TestCases //,ReusableComponents
{
	//****************************Smoke / Regression ****************************
	@Test
	public void smoke() // BVT : Build Validation Test
	{
		//TestCases.launchApplication("htts://yahoo.com");
		System.out.println("Test Suite : SMOKE");
		composeAndSendAnEmail();
		replyToAnEmail();
	}
	@Test
	public void regression() 
	{
		System.out.println("Test Suite : REGRESSION");
		composeAndSendAnEmail();
		replyToAnEmail();
		forwardAnEmail();
		deleteAnEmail();
	}


}
