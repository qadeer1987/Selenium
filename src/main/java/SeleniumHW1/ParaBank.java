package SeleniumHW1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ParaBank {

    public static void main(String[] args) throws InterruptedException {

        /*
        fill out the form
            close the browser
            Note: use name or id as locators
         */

        WebDriver driver = new ChromeDriver();

        driver.get("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");

        driver.findElement(By.id("customer.firstName")).sendKeys("Qadeer");
        driver.findElement(By.id("customer.lastName")).sendKeys("Zadran");
        driver.findElement(By.name("customer.address.street")).sendKeys("1939 Brooke Farm");
        driver.findElement(By.name("customer.address.city")).sendKeys("Ashburn");
        driver.findElement(By.id("customer.address.state")).sendKeys("Virginia");
        driver.findElement(By.id("customer.address.zipCode")).sendKeys("222223");
        driver.findElement(By.id("customer.phoneNumber")).sendKeys("757-788-1269");
        driver.findElement(By.id("customer.ssn")).sendKeys("123-456-7891");
        driver.findElement(By.id("customer.username")).sendKeys("Qadeer123");
        driver.findElement(By.id("customer.password")).sendKeys("ABCDEFG123");
        driver.findElement(By.id("repeatedPassword")).sendKeys("ABCDEFG123");

        Thread.sleep(2000);

        driver.quit();

    }
}
