import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.github.dockerjava.core.dockerfile.DockerfileStatement.Add;

public class Main extends Parameters{

	@BeforeTest
	public void beforeTest() {
		driver.get("https://www.demoblaze.com");
		driver.manage().window().maximize();
	}
	
	
	@Test()
	public void A_signUp() throws InterruptedException {
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	WebElement signUp = driver.findElement(By.xpath("/html/body/nav/div[1]/ul/li[8]/a"));
	signUp.click();
		
	WebElement userNamee = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/form/div[1]/input"));
	userNamee.sendKeys(userName);
	Thread.sleep(5000);
	WebElement pass = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/form/div[2]/input"));
	pass.sendKeys(password);
	Thread.sleep(5000);
	WebElement submit =driver.findElement(By.xpath("/html/body/div[2]/div/div/div[3]/button[2]"));
	submit.click();
	Thread.sleep(5000);

    Alert a = driver.switchTo().alert();
  //accept alert
    a.accept();
    driver.findElement(By.xpath("/html/body/div[2]/div/div/div[1]/button")).click();
	
	
		}	
	
	
	
	@Test()
	public void B_signIn() throws InterruptedException {
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	WebElement signUp = driver.findElement(By.xpath("/html/body/nav/div[1]/ul/li[5]/a"));
	signUp.click();
	WebElement userNamee = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/form/div[1]/input"));
	userNamee.sendKeys(userName);
	Thread.sleep(5000);
	WebElement pass = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/form/div[2]/input"));
	pass.sendKeys(password);
	Thread.sleep(5000);
	WebElement submit =driver.findElement(By.xpath("/html/body/div[3]/div/div/div[3]/button[2]"));
	submit.click();
	Thread.sleep(5000);
	
		}	
	
	
	
	@Test()
	public void C_selectSamsungRandomly() throws InterruptedException {
		List<WebElement> selectTab = driver.findElements(By.className("hrefch"));
		Thread.sleep(5000);
		List<WebElement> array = new ArrayList<>();
		
		//get samsung phones only and push them into the array 
		for(int i = 0 ; i< selectTab.size(); i++) {
			String text = selectTab.get(i).getText();

			if(text.contains("Samsung")) {			
				WebElement samsung = selectTab.get(i);
				 array.add(samsung);	
				}	
			}
		//add sumsung phone to the cart 
		for(int i = 0 ; i< array.size(); i++) {
           array.get(i).click();
            
			Thread.sleep(3000);
			WebElement addToCart = driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div[2]/div/a"));
			addToCart.click();
			Thread.sleep(3000);

		    Alert a = driver.switchTo().alert();
		  //accept alert
		    a.accept();
			Thread.sleep(5000);
			driver.navigate().back();
			driver.navigate().back();


			
        }	
	}	
	
	@Test()
	public void D_selectPhonesRandomly() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement phoneTab = driver.findElement(By.xpath("/html/body/div[5]/div/div[1]/div/a[2]"));
		phoneTab.click();
		Thread.sleep(3000);

		List<WebElement> selectTab = driver.findElements(By.className("hrefch"));

		for(int i = 0 ; i< 3; i++) {
			int random = rand.nextInt(selectTab.size());
			selectTab.get(random).click();
			
			Thread.sleep(3000);
			WebElement addToCart = driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div[2]/div/a"));
			addToCart.click();
			Thread.sleep(3000);

		    Alert a = driver.switchTo().alert();
		  //accept alert
		    a.accept();
			Thread.sleep(5000);
			driver.navigate().back();
			driver.navigate().back();
			
		}
	}
	
	@Test()
	public void E_selectLaptopsRandomly() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement laptopTab = driver.findElement(By.xpath("/html/body/div[5]/div/div[1]/div/a[3]"));
		laptopTab.click();
		Thread.sleep(3000);

		List<WebElement> selectTab = driver.findElements(By.className("hrefch"));

		for(int i = 0 ; i< 2; i++) {
			int random = rand.nextInt(selectTab.size());
			selectTab.get(random).click();
			
			Thread.sleep(3000);
			WebElement addToCart = driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div[2]/div/a"));
			addToCart.click();
			Thread.sleep(3000);

		    Alert a = driver.switchTo().alert();
		  //accept alert
		    a.accept();
			Thread.sleep(5000);
			driver.navigate().back();
			driver.navigate().back();

			
		}		
	}
	
	
	@Test()
	public void F_selectMonitorsandomly() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement monitorsTab = driver.findElement(By.xpath("/html/body/div[5]/div/div[1]/div/a[4]"));
		monitorsTab.click();
		Thread.sleep(3000);

		List<WebElement> selectTab = driver.findElements(By.className("hrefch"));
			int random = rand.nextInt(selectTab.size());
			selectTab.get(random).click();
			
			Thread.sleep(3000);
			WebElement addToCart = driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div[2]/div/a"));
			addToCart.click();
			Thread.sleep(3000);

		    Alert a = driver.switchTo().alert();
		  //accept alert
		    a.accept();
			Thread.sleep(5000);
			driver.navigate().back();
			driver.navigate().back();	
	
	}
	
	@Test()
	public void G_screenshot() throws InterruptedException, IOException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.navigate().to("https://www.demoblaze.com/cart.html");
		Thread.sleep(5000);
		Date date = new Date();
		String myDate = date.toString();
		String myUpdateDate = myDate.replace(":","-");
		
		//Convert web driver object to TakeScreenshot
        TakesScreenshot scrShot =((TakesScreenshot)driver);
        //Call getScreenshotAs method to create image file
                File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
            //Move image file to new destination
                File DestFile=new File(".//screenShot/"+myUpdateDate+".png");
                //Copy file at destination
                FileUtils.copyFile(SrcFile, DestFile);
		
//        		driver.navigate().to("https://www.demoblaze.com/cart.html");

		
		
	}
	
	
	@Test()
	public void H_checkOutProcess() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.navigate().to("https://www.demoblaze.com/cart.html");
		Thread.sleep(5000);

		WebElement placeOrder = driver.findElement(By.xpath("/html/body/div[6]/div/div[2]/button"));
		placeOrder.click();
		
		WebElement name = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/form/div[1]/input"));
		name.sendKeys(Name);
		WebElement country = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/form/div[2]/input"));
		country.sendKeys(Country);
		WebElement city = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/form/div[3]/input"));
		city.sendKeys(City);
		WebElement creditCard = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/form/div[4]/input"));
		creditCard.sendKeys(CreditCard);
		WebElement month = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/form/div[5]/input"));
		month.sendKeys(Month);
		WebElement year = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/form/div[6]/input"));
		year.sendKeys(Year);

		WebElement submit = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[3]/button[2]"));
		submit.click();
		
		Thread.sleep(3000);
		WebElement okButton =  driver.findElement(By.xpath("/html/body/div[10]/div[7]/div/button"));
		okButton.click();
	}
	
	
	
	@AfterTest
	public void afterTest() {
//		driver.quit();
		
		
	}
	
}
