import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static java.lang.Thread.sleep;

public class RemindPassword extends Data {

    private By buttonRemind = By.linkText("Забули пароль?");
    private By inputEmail = By.xpath("//div[@class='row']//input[@id='email']");
    private By buttonSend = By.xpath("/html/body/app-root/div/div/app-remind-password/div/div/div/form/div/div[2]/button");

    @Test
    public void remindPassword() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        Data getDate = new Data();


        driver.get(getDate.getURL);
        driver.manage().window().maximize();
        driver.findElement(buttonRemind).click();
        sleep(2000);
        driver.findElement(inputEmail).sendKeys(getDate.email);
        driver.findElement(buttonSend).click();
    }


}
