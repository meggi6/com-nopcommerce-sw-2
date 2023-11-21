package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/**
 *  Write down the following test into ‘RegisterTest’ class
 *  1. userShouldNavigateToRegisterPageSuccessfully * click on the ‘Register’ link * Verify the text ‘Register’
 * 2. userSholdRegisterAccountSuccessfully * click on the ‘Register’ link * Select gender radio button
 * * Enter First name * Enter Last name
 * * Select Day Month and Year * Enter Email address * Enter Password * Enter Confirm password
 * * Click on REGISTER button
 * * Verify the text 'Your registration completed’
 */
public class RegisterTest extends BaseTest {
    static String baseUrl = "https://demo.nopcommerce.com/";

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
    public void userShouldNavigateToRegisterPageSuccessfully(){
        //Find Register link element and click on it
        WebElement registerLinkElement = driver.findElement(By.className("ico-register"));
        registerLinkElement.click();
        //Expected text according to requirement
        String expectedRegisterText ="Register";
        //Find Register text element and get it's text
        WebElement registerTextElement = driver.findElement(By.xpath("//h1[text() = 'Register']"));
        String actualRegisterText = registerTextElement.getText();
        //Verify expected and actual text
        Assert.assertEquals("Text is not matching", expectedRegisterText, actualRegisterText);
    }

    //Test annotation for executing the method
    @Test
    //Method for registration
    public void userSholdRegisterAccountSuccessfully(){
        //Find Register link element and click on it
        WebElement registerLinkElement = driver.findElement(By.className("ico-register"));
        registerLinkElement.click();
        //Find radio button element and click on it
        WebElement radioButtonElement = driver.findElement(By.xpath("//span[@class= 'male' or @class = 'female']"));
        radioButtonElement.click();
        //Find first name field element and enter first name
        WebElement firstNameElement = driver.findElement(By.id("FirstName"));
        firstNameElement.sendKeys("Ajay");
        //Find last name field element and enter last name
        WebElement lastNameElement = driver.findElement(By.name("LastName"));
        lastNameElement.sendKeys("Kumar");
        //Find day field element and enter the day
        WebElement dayFieldElement = driver.findElement(By.xpath("//select[@name = 'DateOfBirthDay']"));
        dayFieldElement.sendKeys("2");
        //Find month field element and enter the month
        WebElement monthFieldElement = driver.findElement(By.xpath("//select[@name = 'DateOfBirthMonth']"));
        monthFieldElement.sendKeys("2");
        //Find year field element and enter the year
        WebElement yearFieldElement = driver.findElement(By.xpath("//select[@name = 'DateOfBirthYear']"));
        yearFieldElement.sendKeys("2000");
        //Find email field element and enter email id
        WebElement emailFieldElement = driver.findElement(By.xpath("//input[@id = 'Email' and @data-val= 'true']"));
        emailFieldElement.sendKeys("ajaykumar123@gmail.com");
        //Find password field element and enter password
        WebElement passwordFieldElement = driver.findElement(By.xpath("//input[contains(@data-val-required, 'Password is required.') and @name = 'Password']"));
        passwordFieldElement.sendKeys("anil123");
        //Find confirm password field element and enter confirm password
        WebElement confirmPasswordFieldElement = driver.findElement(By.xpath("//input[starts-with(@data-val-equalto, 'The password and confirmation password do ')]"));
        confirmPasswordFieldElement.sendKeys("anil123");
        //Find Register button element and click on it
        WebElement registerButtonElement = driver.findElement(By.id("register-button"));
        registerButtonElement.click();
        //Expected text according to requirement
        String expectedRegistrationText = "Your registration completed";
        //Find Registration text element and get it's text
        WebElement registrationTextElement = driver.findElement(By.xpath("//div[text() = 'Your registration completed']"));
        String actualRegistrationText = registrationTextElement.getText();
        //Verify expected and actual text
        Assert.assertEquals("Register text is not matching", expectedRegistrationText, actualRegistrationText);
    }

}
