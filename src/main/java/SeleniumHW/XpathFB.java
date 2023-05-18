package SeleniumHW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathFB {

    /*
    HW  (only use XPATH)
navigate to fb.com
click on create new account
fill up all the textboxes
close the popup
close the browser
Note : in order for ur code to work
u have to put Thread.sleep(2000) after clicking on Create new account

     */
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.facebook.com/");

        WebElement createAccount = driver.findElement(By.xpath("//a[text()='Create new account']"));
        createAccount.click();

        Thread.sleep(2000);

        driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Qadeer");
        driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Zadran");
        driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("1234567");
        driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("ABCDef123");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//img[@class='_8idr img']")).click();

        Thread.sleep(3000);


        driver.close();

    }
}
