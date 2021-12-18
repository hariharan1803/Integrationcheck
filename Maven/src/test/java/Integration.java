import org.testng.annotations.Test;

public class Integration {
	@org.testng.annotations.BeforeSuite
	public void BeforeSuite() {

		System.out.println("Before suite");
	}
	@org.testng.annotations.AfterSuite
	public void AfterSuite() {

		System.out.println("After suite");
	}
	@org.testng.annotations.BeforeTest
	public void BeforeTest() {

		System.out.println("Before Test");
	}
	@org.testng.annotations.AfterTest
	public void AfterTest() {

		System.out.println("After Test");
	}
	@org.testng.annotations.BeforeClass
	public void Beforeclass() {

		System.out.println("Before class");
	}
	@org.testng.annotations.AfterClass
	public void Afterclass() {

		System.out.println("After class");
	}
	@org.testng.annotations.BeforeMethod
	public void Beforemethod() {

		System.out.println("Before method");
	}
	@Test
	public void test() {

		System.out.println("test");
	}
	@org.testng.annotations.AfterMethod
	public void Aftermethod() {

		System.out.println("After method");
	}
	
}
