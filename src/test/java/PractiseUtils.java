import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class PractiseUtils {

    public static void doScroll(WebDriver driver){

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
        //js.executeScript("window.scrollBy(0,200)");
        //js.executeScript("window.scrollBy(0,600)");

    }
}
