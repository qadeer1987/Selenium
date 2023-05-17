package Class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateCommand {
    public static void main(String[] args) throws InterruptedException {

        //1. create an instance

        WebDriver driver = new ChromeDriver();

        //2. go to google.com

        driver.get("https://www.google.com");

        //3. now pause/slow down for 2 seconds (we are slowing it down to see the whole process, otherwise its closing to fast.

        Thread.sleep(2000);

        //4. Navigate to facebook.com

        driver.navigate().to("https://www.facebook.com");

        //5. slow down

        Thread.sleep(2000);

        //6. Refresh the page
        driver.navigate().refresh();
        // slow down
        Thread.sleep(1000);

        //7. go to previous page
        driver.navigate().back();
        //8. after going back, I will wait for 2 seconds
        Thread.sleep(2000);
        //9. go forward
        driver.navigate().forward();

        //10. closing the webbrowser
        driver.quit();

        //11. close the current tab
        // driver.close();


    }
}
