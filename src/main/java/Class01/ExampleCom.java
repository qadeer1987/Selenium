package Class01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExampleCom {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.facebook.com");

        // webdriver, locate the email text box and add "qadeerzadran"

        driver.findElement(By.id("email")).sendKeys("qadeerzadran@gmail.com");

       // find element by name "pass" and add text to it

       driver.findElement(By.name("pass")).sendKeys("ABDCDEFZG123");

       // print the url on the console

        String url = driver.getCurrentUrl();
        System.out.println(url);

        // print title of the webpage on hte console

        String title = driver.getTitle();
        System.out.println(title);

        // confirm that the title is "Facebook - log in or sign up"

        if (title.equals("Facebook - log in or sign up")){
            System.out.println("The title is correct");
        }

        // close the web browser

        driver.quit();



    }
}
