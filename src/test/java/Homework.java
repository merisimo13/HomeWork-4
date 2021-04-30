import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.Test;
import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;

public class Homework {
    @Test
    public void homeWork_4(){
        Configuration.browser = "chrome";
        System.setProperty("webdriver.chrome.driver", "files/chromedriver.exe");
        Configuration.startMaximized = true;

        Selenide.open("https://www.google.com/");
        $(".gLFyf").setValue("ესპანეთის შუქურა").sendKeys(Keys.ENTER);
        sleep (500);
    }

}
