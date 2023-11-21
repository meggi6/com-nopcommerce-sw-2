package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/**
 * Write down the following test into ‘TopMenuTest’ class
 * 1. userShouldNavigateToComputerPageSuccessfully * click on the ‘Computers’ Tab * Verify the text ‘Computers’
 * 2. userShouldNavigateToElectronicsPageSuccessfully * click on the ‘Electronics’ Tab * Verify the
 * text ‘Electronics’
 * 3. userShouldNavigateToApparelPageSuccessfully * click on the ‘Apparel’ Tab * Verify
 * the text ‘Apparel’
 * 4. userShouldNavigateToDigitalDownloadsPageSuccessfully * click on the ‘Digital downloads’ Tab * Verify
 * the text ‘Digital downloads’
 * 5. userShouldNavigateToBooksPageSuccessfully * click on the ‘Books’ Tab * Verify
 * the text ‘Books’
 * 6. userShouldNavigateToJewelryPageSuccessfully * click
 * on the ‘Jewelry’ Tab * Verify the text ‘Jewelry’
 * 7. userShouldNavigateToGiftCardsPageSuccessfully * click on
 * the ‘Gift Cards’ Tab * Verify the text ‘Gift Cards’
 */
public class TopMenuTest extends BaseTest {
    static String baseUrl = "https://demo.nopcommerce.com/";

    //Before annotation run in the beginning of all tests
    @Before
    //Browser set-up method
    public void setUp() {
        openBrowser(baseUrl);
    }

    //After annotation method run at the end of all tests
    @After
   //Browser closing method
    public void tearDown() {
        closeBrowser();
    }

    //Test annotation for executing the method
    @Test
    public void userShouldNavigateToComputerPageSuccessfully() {
        //Find computer link element and click on it
        WebElement computerLink = driver.findElement(By.xpath("//a[text() = 'Computers '] "));
        computerLink.click();
        //Expected text according to requirement
        String expectedComputerText = "Computers";
        //Find computer text element and get it's text
        WebElement computerTextElement = driver.findElement(By.xpath("//h1[text() = 'Computers']"));
        String actualComputerText = computerTextElement.getText();
        //Verify expected and actual text
        Assert.assertEquals("Text is not matching", expectedComputerText, actualComputerText);

    }

    //Test annotation for executing the method
    @Test
    public void userShouldNavigateToElectronicsPageSuccessfully() {
        //Find Electronics link element and click on it
        WebElement electronicLink = driver.findElement(By.xpath("//ul[@class = 'top-menu notmobile']//a[text() = 'Electronics ']"));
        electronicLink.click();
        //Expected text according to requirement
        String expectedElectronicText = "Electronics";
        //Find Electronics text element and get it's text
        WebElement electronicText = driver.findElement(By.xpath("//h1[text() = 'Electronics']"));
        String actualElectronicText = electronicText.getText();
        //Verify expected and actual text
        Assert.assertEquals("Electronic text is not matching", expectedElectronicText, actualElectronicText);
    }

    //Test annotation for executing the method
    @Test
    public void userShouldNavigateToApparelPageSuccessfully() {
        //Find Apparel link element and click on it
        WebElement apparelLink = driver.findElement(By.xpath("//ul[@class = 'top-menu notmobile']//a[text() = 'Apparel ']"));
        apparelLink.click();
        //Expected text according to requirement
        String expectedApparelText = "Apparel";
        //Find Apparel text element and get it's text
        WebElement apparelText = driver.findElement(By.xpath("//h1[text() ='Apparel']"));
        String actualApparelText = apparelText.getText();
        //Verify expected and actual text
        Assert.assertEquals("Electronic text is not matching", expectedApparelText, actualApparelText);
    }

    //Test annotation for executing the method
    @Test
    public void userShouldNavigateToDigitalDownloadsPageSuccessfully() {
        //Find Digital downloads link element and click on it
        WebElement digitalDownloadsLink = driver.findElement(By.xpath("//ul[@class = 'top-menu notmobile']//a[text()= 'Digital downloads ']"));
        digitalDownloadsLink.click();
        //Expected text according to requirement
        String expectedDigitalDownloadsText = "Digital downloads";
        //Find Digital downloads text element and get it's text
        WebElement digitalDownloadsText = driver.findElement(By.xpath("//h1[text() = 'Digital downloads']"));
        String actualDigitalDownloadsText = digitalDownloadsText.getText();
        //Verify expected and actual text
        Assert.assertEquals("Electronic text is not matching", expectedDigitalDownloadsText, actualDigitalDownloadsText);
    }

    //Test annotation for executing the method
    @Test
    public void userShouldNavigateToBooksPageSuccessfully() {
        //Find Books link element and click on it
        WebElement bookLink = driver.findElement(By.xpath("//ul[@class = 'top-menu notmobile']//a[text() = 'Books ']"));
        bookLink.click();
        //Expected text according to requirement
        String expectedBookText = "Books";
        //Find Books text element and get it's text
        WebElement bookTextElement = driver.findElement(By.xpath("//h1[text() = 'Books']"));
        String actualBookText = bookTextElement.getText();
        //Verify expected and actual text
        Assert.assertEquals("Book text is not matching", expectedBookText, actualBookText);
    }

    //Test annotation for executing the method
    @Test
    public void userShouldNavigateToJewelryPageSuccessfully() {
        //Find Jewelry link element and click on it
        WebElement jewelryLink = driver.findElement(By.xpath("//ul[@class = 'top-menu notmobile']//a[text() = 'Jewelry ']"));
        jewelryLink.click();
        //Expected text according to requirement
        String expectedJewelryText = "Jewelry";
        //Find Jewelry text element and get it's text
        WebElement jewelryTextElement = driver.findElement(By.xpath("//h1[text() = 'Jewelry']"));
        String actualJewelryText = jewelryTextElement.getText();
        //Verify expected and actual text
        Assert.assertEquals("Book text is not matching", expectedJewelryText, actualJewelryText);
    }

    //Test annotation for executing the method
    @Test
    public void userShouldNavigateToGiftCardsPageSuccessfully() {
        //Find Gift Cards link element and click on it
        WebElement giftCardsLink = driver.findElement(By.xpath("//ul[@class= 'top-menu notmobile']//a[text() = 'Gift Cards ']"));
        giftCardsLink.click();
        //Expected text according to requirement
        String expectedGiftCardsText = "Gift Cards";
        //Find Gift Cards text element and get it's text
        WebElement giftCardsTextElement = driver.findElement(By.xpath("//h1[text() = 'Gift Cards']"));
        String actualGiftCardsText = giftCardsTextElement.getText();
        //Verify expected and actual text
        Assert.assertEquals("Book text is not matching", expectedGiftCardsText, actualGiftCardsText);
    }
}
