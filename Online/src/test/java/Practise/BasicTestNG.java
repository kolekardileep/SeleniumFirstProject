package Practise;

import org.testng.annotations.Test;

public class BasicTestNG {
@Test
public void createProduct() 
	{
		System.out.println("Product Created");
	}
@Test(dependsOnMethods="createProduct")
public void modifyProduct()
	{
		System.out.println("Product Modified");
	}

@Test(dependsOnMethods="createProduct")
public void deleteProduct()
{
	System.out.println("Product Delete");

}

}
