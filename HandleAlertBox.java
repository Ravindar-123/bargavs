//(9) How to handle Alerts in WebPage using Selenium WebDriver ?

package selenium.AlertBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandleAlertBox {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
		driver.manage().window().maximize();

		//1.Alert box
		driver.findElement(By.id("alertBox")).click();
		System.out.println(driver.switchTo().alert().getText());
        driver.switchTo().alert().accept();
		System.out.println(driver.findElement(By.id("output")).getText());

		//2.Confirm box
		//	System.out.println(driver.findElement(By.id("output")).getText());
		driver.findElement(By.id("confirmBox")).click();
		System.out.println( driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		System.out.println(driver.findElement(By.id("output")).getText());
		Thread.sleep(2000);


		driver.findElement(By.id("confirmBox")).click();
		System.out.println( driver.switchTo().alert().getText());
		driver.switchTo().alert().dismiss();
		System.out.println(driver.findElement(By.id("output")).getText());
		Thread.sleep(2000);

		//3.Prompt box
		driver.findElement(By.id("promptBox")).click();
		System.out.println( driver.switchTo().alert().getText());
		driver.switchTo().alert().sendKeys("HYR Tutorials");
		driver.switchTo().alert().accept();
		System.out.println(driver.findElement(By.id("output")).getText());
		Thread.sleep(2000);

		driver.findElement(By.id("promptBox")).click();
		System.out.println( driver.switchTo().alert().getText());
		driver.switchTo().alert().sendKeys("HYR Tutorials");
		driver.switchTo().alert().dismiss();
		System.out.println(driver.findElement(By.id("output")).getText());
		Thread.sleep(2000);
		driver.quit();
	}

}
