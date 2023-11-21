package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/**
 * Write down the following test into ‘LoginTest’ class
 *  * 1. userShouldNavigateToLoginPageSuccessfully * click
 *  * on the ‘Login’ link * Verify the text ‘Welcome, Please Sign In!’
 *  * 2. userShouldLoginSuccessfullyWithValidCredentials * click on the ‘Login’ link * Enter
 *  * valid username * Enter valid password * Click on ‘LOGIN’ button * Verify the ‘Log out’
 *  * text is display
 *  3. verifyTheErrorMessage * click on the ‘Login’ link * Enter invalid
 *  * username * Enter invalid password * Click on Login button * Verify the error
 *  * message ‘Login was unsuccessful. Please correct the errors and try again. No customer account found’
 */
public class LoginTest extends BaseTest {
    String baseUrl = "https://demo.nopcommerce.com/";

    //Before annotation run in the beginning of all tests
    @Before
    //Browser set-up method
    public void setUp(){
        openBrowser(baseUrl);
    }

    //After annotation method run at the end of all tests
    @After
    //Browser closing method
    public void tearDown(){
        closeBrowser();
    }

    //Test annotation for executing the method
    @Test
    public void userShouldNavigateToLoginPageSuccessfully(){
        //Find login element and click on it
        WebElement logInLink = driver.findElement(By.linkText("Log in"));
        logInLink.click();
        //Expected text according to requirement
        String expectedLoginText = "Welcome, Please Sign In!";
        //Find login text element and get it's text
        WebElement loginText = driver.findElement(By.xpath("//h1[contains(text(), 'Welcome')]"));
        String actualLoginText = loginText.getText();
        //Verify expected and actual text
        Assert.assertEquals("Login text is not matched", expectedLoginText, actualLoginText);
    }

    //Test annotation for executing the method
    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials(){
        //Find login element and click on it
        WebElement loginLink = driver.findElement(By.xpath("//a[@class = 'ico-login']"));
        loginLink.click();
        //Find email field element and enter valid email id
        WebElement emailFieldElement = driver.findElement(By.id("Email"));
        emailFieldElement.sendKeys("anilkumar123@gmail.com");
        //Find password field element and enter valid password
        WebElement passwordFieldElement = driver.findElement(By.name("Password"));
        passwordFieldElement.sendKeys("anil123");
        //Find login button element and click on it
        WebElement loginButtonElement = driver.findElement(By.className("login-button"));
        loginButtonElement.click();
        //Expected text according to requirement
        String expectedLogOutText = "Log";
        //Find logout text element and get it's text
        WebElement logOutLinkElement = driver.findElement(By.xpath("//a[text() = 'out']"));
        String actualLogOutText = logOutLinkElement.getText();
        //Verify expected and actual text
        Assert.assertEquals("Log out link text is not matching", expectedLogOutText, actualLogOutText);
    }

    //Test annotation for executing the method
    @Test
    public void verifyTheErrorMessage(){
        //Find login element and click on it
        WebElement loginLink = driver.findElement(By.xpath("//div[@class = 'master-wrapper-page']//a[contains(@class, 'ico-login')]"));
        loginLink.click();
        //Find email field element and enter invalid email id
        WebElement emailFieldElement = driver.findElement(By.xpath("//input[starts-with(@data-val-email, 'Wro')]"));
        emailFieldElement.sendKeys("prime123@gmail.com");
        //Find password field element and enter invalid password
        WebElement passwordFieldElement = driver.findElement(By.xpath("//div[@class = 'inputs']//input[@type = 'password']"));
        passwordFieldElement.sendKeys("prime123");
        //Find login button element and click on it
        WebElement loginButtonElement = driver.findElement(By.xpath("//button[contains(text(), 'Lo')]"));
        loginButtonElement.click();
        //Expected text according to requirement
        String expectedErrorMessageText = "Login was unsuccessful. Please correct the errors and try again.\n" +
                "No customer account found";
        //Find error message element and get it's text
        WebElement errorMessageElement = driver.findElement(By.xpath("//div[contains(text(), 'unsuccess')]"));
        String actualErrorMessageText = errorMessageElement.getText();
        //Verify expected and actual text
        Assert.assertEquals("Error message is not matching", expectedErrorMessageText, actualErrorMessageText);
    }


}
