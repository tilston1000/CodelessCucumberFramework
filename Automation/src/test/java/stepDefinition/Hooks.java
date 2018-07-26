package stepDefinition;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
	
	@Before("@MobileTest")
	public void beforeMobileValidation()
	{
		System.out.println("Before Mobile hook");
	}
	
	@After()
	public void afterMobileValidaton()
	{
		System.out.println("After Mobile hook");
	}
	
	@Before("@WebTest")
	public void beforeWebValidation()
	{
		System.out.println("Before Web hook");
	}
	
	@After("@WebTest")
	public void afterWebValidaton()
	{
		System.out.println("After Web hook");
	}

}
