import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;
import java.util.List;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)

public class AssignmentJunit {

    WebDriver driver;

    @BeforeAll

    public void setUp(){

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

    }

    @DisplayName("Visit the Website and get Title")

    @Test

    public void getTitle(){

        driver.get("https://www.digitalunite.com/practice-webform-learners");
        String title_actual = driver.getTitle();
        String title_expected = "Practice webform for learners | Digital Unite";
        System.out.println(title_actual);
        Assertions.assertTrue(title_actual.contains(title_expected));

        driver.findElement(By.className("banner-close-button")).click(); //removed un-necessary pop-up Window

    }

    @DisplayName("check if Banner Image exists of Website")

    @Test

    public void checkIfImageExists(){

        driver.get("https://www.digitalunite.com/practice-webform-learners");
        boolean isExists = driver.findElement(By.id("block-digitalunite-branding")).isDisplayed();
        System.out.println(isExists);
        Assertions.assertTrue(isExists);

        driver.findElement(By.className("banner-close-button")).click(); //removed un-necessary pop-up Window

    }

    @DisplayName("User can Hover Necessary Tabs")

    @Test

    public void mouseHover() {

        driver.get("https://www.digitalunite.com/practice-webform-learners");
        List<WebElement> hoover = driver.findElements(By.className("tbm-link-container"));

        Actions actions = new Actions(driver);

        actions.moveToElement(hoover.get(0)).perform();
        actions.moveToElement(hoover.get(4)).perform();
        actions.moveToElement(hoover.get(9)).perform();
        actions.moveToElement(hoover.get(10)).perform();
        actions.moveToElement(hoover.get(16)).perform();
        actions.moveToElement(hoover.get(17)).perform();
        actions.moveToElement(hoover.get(18)).perform();

        driver.findElement(By.className("banner-close-button")).click(); //removed un-necessary pop-up Window

    }

    @DisplayName("User must Fill up the WebForm correctly")

    @Test

    public void getWebForm(){

        driver.get("https://www.digitalunite.com/practice-webform-learners");
        List<WebElement> WebForm = driver.findElements(By.tagName("input"));

        WebForm.get(0).sendKeys("Sajjad Rahman");
        WebForm.get(1).sendKeys("01787651682");

        PractiseUtils.doScroll(driver);

        WebForm.get(2).sendKeys("20-30");

        WebForm.get(7).sendKeys("sajjad.rahman909090@gmail.com");

        driver.findElement(By.id("edit-tell-us-a-bit-about-yourself-")).sendKeys("I am Muslim and Bangladeshi");

        driver.findElement(By.className("banner-close-button")).click(); //removed un-necessary pop-up Window

    }

    @DisplayName("User must choose Date properly")

    @Test

    public void datePicker(){

        driver.get("https://www.digitalunite.com/practice-webform-learners");
        WebElement datePickerElement = driver.findElement(By.id("edit-date"));
        //WebElement datePickerElement = driver.findElement(By.className("form-date"));
        PractiseUtils.doScroll(driver);
        datePickerElement.click();
        datePickerElement.sendKeys("07/09/2023", Keys.ENTER);

        driver.findElement(By.className("banner-close-button")).click(); //removed un-necessary pop-up Window

    }

    @DisplayName("User must upload the document")

    @Test

    public void uploadDocument(){

        driver.get("https://www.digitalunite.com/practice-webform-learners");
        PractiseUtils.doScroll(driver);
        WebElement DOCUMENT = driver.findElement(By.id("edit-uploadocument-upload"));

        DOCUMENT.sendKeys("F:\\New Microsoft Word Document-2.docx");
        String expected_docx = driver.findElement(By.className("file--x-office-spreadsheet")).getText();

        Assertions.assertTrue(expected_docx.contains("New Microsoft Word Document-2.docx"));

        driver.findElement(By.className("banner-close-button")).click(); //removed un-necessary pop-up Window

    }

    @DisplayName("Tick the box and Submit the User form")

    @Test

    public void tickAndSubmit(){

        driver.get("https://www.digitalunite.com/practice-webform-learners");

        PractiseUtils.doScroll(driver);

        driver.findElement(By.id("edit-age")).click();

        String actual_message = driver.findElement(By.id("edit-submit")).getText();
        String expected_message = "Thank you for your submission!";

        Assertions.assertTrue(actual_message.contains(expected_message));

    }


    @AfterAll

    public void closeDriver(){

        driver.quit();

    }


}
