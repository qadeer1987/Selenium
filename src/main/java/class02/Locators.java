package class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        driver.get ("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/dashboard");

        driver.manage().window().maximize();

       // driver.findElement(By.id("txtUsername")).sendKeys("Admin");
        // or you can use

        WebElement userNameTxtBox = driver.findElement(By.id("txtUsername"));
        userNameTxtBox.sendKeys("Admin");

        // slow down

        Thread.sleep(2000);

        // after sending the username to the textbox, clear the text box  (jsut for practice)

        userNameTxtBox.clear();

        // sending username again
        userNameTxtBox.sendKeys("Admin");

        // find the password box
        WebElement password = driver.findElement(By.name("txtPassword"));
        password.sendKeys("Hum@nhrm123");

    // find the loging button

        WebElement loginBtn = driver.findElement(By.className("button"));
        loginBtn.click();

// get the "Welcome" message

        WebElement message = driver.findElement(By.linkText("Welcome Admin"));
        String text = message.getText();

        System.out.println(text);

        driver.findElement(By.partialLinkText("Recru")).click();










    }
}
