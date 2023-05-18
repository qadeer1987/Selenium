package SeleniumHW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


/*

enter the username "Tester"
enter the password "test"
get the title of the webPage and confirm that it is  "Web Orders Login"
 */
public class SmartBearSoftware {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");

        driver.findElement(By.name("ctl00$MainContent$username")).sendKeys("Tester");
        driver.findElement(By.name("ctl00$MainContent$password")).sendKeys("tester");


        String title = driver.getTitle();
        System.out.println(title);

        if (title.equals("Web Orders Login")){
            System.out.println("The title for the SmartBearSoftware website is confirmed");
        }


    }
}
