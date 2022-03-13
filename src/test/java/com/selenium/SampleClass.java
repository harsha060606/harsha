package com.selenium;


import io.cucumber.java.ParameterType;
import io.cucumber.java.en.Given;

public class SampleClass {
	
	@Given("I have {int} cucumber in my belly")
	public void sutuation1(Integer x)
	{
		System.out.println("1");
	}
	
	@Given("I have {string} cucumbers in my belly")
	public void sutuation2(String x)
	{
		System.out.println("2");
	}
	
	@Given("i have {int} cucumber(s) in my belly")
	public void sutuation3(Integer x)
	{
		System.out.println("3");	
	}
	
	@Given ("i have {int} cucumber(s) in my bellys/stomaches")
	public void sutuation4(Integer x)
	{
		System.out.println(4);
	}
	
	@Given ("display value {int}")
	public void sutustion5(Integer y)
	{
		System.out.println(y);
	}
@Given ("my {word} is {word} {word}")
public void sut6(String x,String y,String z)
{
	System.out.println(x+"++++"+y);	
}
	@Given("i have {int}\\{what} in my belly \\(amazing!)")
	public void sut7(Integer c)
	{
		System.out.println(c);
		
		
	}
	
	

@Given("i have {int}\\\\\\{what} in my belly \\\\\\(amazing!)")
public void sut8(Integer x)
{
	System.out.println(x); 
}
@Given("my mobile number {mobileno}")
public void sut9(String m)
{
	System.out.println(m);
}

@ParameterType(name="mobileno",value="\"[0-9]{10}\"")
public String gettype(String y)
{
	return(y);
}
@Given("send mail to {string} as subject as {string} and body as")
public void sut10(String a,String b,String c)
{
	System.out.println(a+"===="+b+"====="+c);
}

}
