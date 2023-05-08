import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static java.lang.Thread.sleep;

public class Authorization extends Data{

    private By inputEmail = By.xpath("//div[@class='field-item ng-tns-c23-0']//input[@id='email']");
    private By inputPassword = By.xpath("//div[@class='field-item ng-tns-c23-0']//input[@id='password']");
    private By buttonSignIn = By.xpath("/html/body/app-root/div/div/app-login/div/div[2]/form/button");
    private By getErrorText = By.xpath("/html/body/app-root/div/div/app-login/div/div[2]/form/div[2]/div/span");


    @Test
    public void authorization() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        Data getDate = new Data();


        driver.get(getDate.getURL);
        driver.manage().window().maximize();
        sleep(2000);
        driver.findElement(inputEmail).sendKeys(getDate.email);
        driver.findElement(inputPassword).sendKeys(getDate.password);
        driver.findElement(buttonSignIn).click();
    }
    @Test
    public void negativeAuthorization() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        Data getDate = new Data();


        driver.get(getDate.getURL);
        driver.manage().window().maximize();
        sleep(2000);
        driver.findElement(inputEmail).sendKeys(getDate.email);
        driver.findElement(inputPassword).sendKeys(getDate.negativePassword);
        driver.findElement(buttonSignIn).click();
        sleep(2000);
        String getError = driver.findElement(getErrorText).getText();

        Assert.assertEquals("Невірний логін або пароль", getError);

    }

}
