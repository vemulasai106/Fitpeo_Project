package Sai_Package;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Fitpeo123 {

	public static void main(String[] args) throws InterruptedException {
		
		//System.setProperty("WebDriver.Chrome.driver", "E:\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.fitpeo.com/");
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        driver.findElement(By.linkText("Revenue Calculator")).click();

        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,500)");
        Actions actions = new Actions(driver);

        Thread.sleep(5000);
        WebElement slider = driver.findElement(By.xpath("//*[contains(@class, 'MuiSlider')]//input[@type='range']"));
        actions.dragAndDropBy(slider, 93, 0).perform();
        WebElement getInputValue = driver.findElement(By.xpath("//input[@type='number']"));
        Thread.sleep(5000);
        String numberToEnter = "560";

        actions.click(getInputValue)
                .keyDown(Keys.CONTROL)
                .sendKeys("a")
                .keyUp(Keys.CONTROL)
                .sendKeys(Keys.BACK_SPACE)
                .sendKeys(numberToEnter)
                .perform();

        actions.click(getInputValue)
                .keyDown(Keys.CONTROL)
                .sendKeys("a")
                .keyUp(Keys.CONTROL)
                .sendKeys(Keys.BACK_SPACE)
                .sendKeys("820")
                .perform();

        Thread.sleep(1000);



        driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[1]/label/span[1]/input")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[2]/label/span[1]/input")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[3]/label/span[1]/input")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[8]/label/span[1]/input")).click();


        String actual = driver.findElement(By.xpath("(//div[contains(@class,'MuiBox')]/header/div/p)[4]")).getText();

        System.out.println(actual);
        System.out.println("expected result");


        Thread.sleep(5000);
        driver.close();


	}

}
