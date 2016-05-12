package stepdefinationfile;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class dailysteps {
	protected WebDriver driver;
	@Before public void setup() 
	{ driver = new FirefoxDriver(); }
	
	
	@Given ("^i am on  ([^\"]*)$")
	public void in(String str){
		driver.navigate().to("http://gcloud-todos.appspot.com/examples/angularjs/#/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	
	}
	
	@When ("i delete all todo")
	
	public void delete (String str){
		List<WebElement> objElements1 = driver.findElements(By.id("filters"));
		
		if (objElements1.size()>0)
			driver.findElement(By.xpath("//*[@id='filters']/li[1]/a")).click();
		driver.findElement(By.id("toggle-all")).click();
		driver.findElement(By.id("clear-completed")).click();
		}

	@Then ("i dont see any todo in the list")
	public void idDoesnotexist (String str){
		List<WebElement> objElements1 = driver.findElements(By.id("filters"));
		{
		if (objElements1.size()>0){			
			System.out.println(" - Obct not found");
		}else{			
			System.out.println(" - Object not found");
		}
		}
	}
	
	@When("i add a new ToDo")
	
	public void imeet (String str){
		driver.findElement(By.id("new-todo")).sendKeys("firsttodo");
		driver.findElement(By.id("new-todo")).sendKeys(Keys.ENTER);
	}
@When("i check the new todo as completed")
	
	public void acttod(String str1)
	{
	{
	driver.findElement(By.xpath("//*[@id='todo-list']/li[1]/div/input")).click();
	driver.findElement(By.xpath("//*[@id='filters']/li[3]/a")).click();
	driver.findElement(By.id("clear-completed")).click();
	}
List<WebElement> objElements1 = driver.findElements(By.xpath("//*[@id='todo-list']/li[2]/div/label"));
{
if (objElements1.size()>0){			
	System.out.println(" - Obct not found");
}else{			
	System.out.println(" - Object not found");
}
}}

@Then ("i dont see any todo to be completed")

public void dontseeAnytodo(String str)
{{
	List<WebElement> objElements1 = driver.findElements(By.xpath("//*[@id='todo-list']/li[1]/div/label"));
	{
	if (objElements1.size()>0){			
		System.out.println(" - Obct not found");
	}else{			
		System.out.println(" - Object not found");
	}
	}}}
	
@Then ("i complete one todo")

public void completeonetodo(String str)
{
driver.findElement(By.xpath("//*[@id='filters']/li[2]/a")).click();
List<WebElement> objElements1 = driver.findElements(By.xpath("//*[@id='todo-list']/li[3]/div/input"));
{
if (objElements1.size()>0){			
	System.out.println(" - Obct not found");
}else{			
	System.out.println(" - Object not found");
}}}}
	




		


