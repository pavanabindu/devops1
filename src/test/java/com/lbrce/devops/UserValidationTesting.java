package com.lbrce.devops;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UserValidationTesting {

	@Test

	public void testCase1()

	{

		UserValidation uv=new UserValidation();

		Assert.assertEquals(false,uv.check("bindu","bindu@46"));

	}

	public void testCase2()

	{

		UserValidation uv=new UserValidation();

		Assert.assertEquals(false,uv.check("bindu","bindu@47"));

	}

	public void testCase3()

	{

		UserValidation uv=new UserValidation();

		Assert.assertEquals(true,uv.check("bindu","bindu@49"));

	}

	public void testCase4()

	{

		UserValidation uv=new UserValidation();

		Assert.assertEquals(false,uv.check("bindu","bindu@48"));

	}



}