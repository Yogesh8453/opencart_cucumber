/*
 * Login
 * Search
 * Logout
 * Login
 * Advance Search 
 * Logout
 */


package testngpackage;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AnnotationsDemo {

	@BeforeMethod
	void login()
	{
		System.out.println("Login success");
	}
	@Test(priority = 1)
	void search() {
		System.out.println("Search Success");
	}
	@Test(priority = 2)
	void advaceSearch() {
		System.out.println("Advance Search Success");
	}
	@AfterMethod
	void logout() {
		System.out.println("Logout sucess");
	}
}
