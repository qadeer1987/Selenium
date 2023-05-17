package Class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {

    public static void main(String[] args) throws InterruptedException {
//declare the intance
        WebDriver driver = new ChromeDriver();

        // use the .get(url) to navigate to the desired url
        driver.get("https://www.google.com");

        //****** MAXIMIZE THE WINDOW

        driver.manage().window().maximize();



// ***** GET THE CURRENT URL
        String currentUrl = driver.getCurrentUrl ();
// print on the console
        System.out.println("The current URL of the website is : "+currentUrl);
// ************ GET THE TITLE OF THE PAGE
        String title = driver.getTitle();
// print on hte console
        System.out.println("The title of the page is : "+title);

        // ***** ADD WAIT TIME BEFORE THE BROWSER CLOSES

       Thread.sleep(5000);

        // close the webBrowser
        driver.quit();

    }
}
