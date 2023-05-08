import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import static java.lang.Thread.sleep;

public class Registration extends Data{

    private By buttonRegist = By.linkText("Зареєструватись");
    private By inputFirstName = By.xpath("//div[@class='field-item ng-tns-c30-2']//input[@id='name']");
    private By inputLastName = By.xpath("//div[@class='field-item ng-tns-c30-2']//input[@id='surname']");
    private By inputEmail = By.xpath("//div[@class='field-item ng-tns-c30-2']//input[@id='email']");
    private By inputPhone = By.xpath("//div[@class='field-item ng-tns-c30-2']//input[@id='phone']");
    private By inputRole = By.xpath("/html/body/app-root/div/div/app-register/div/div/form/div[5]/div[2]/div");
    private By inputOurRole = By.xpath("/html/body/app-root/div/div/app-register/div/div/form/div[5]/ul/li[2]");
    private By inputCompany = By.xpath("//div[@class='field-item ng-tns-c30-2']//input[@id='companyName']");
    private By buttonFam = By.xpath("/html/body/app-root/div/div/app-register/div/div/form/label/p");
    private By buttonRegistr = By.xpath("/html/body/app-root/div/div/app-register/div/div/form/div[7]/button");


    @Test
    public void registration() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        Data getDate = new Data();


        driver.get(getDate.getURL);
        driver.manage().window().maximize();
        driver.findElement(buttonRegist).click();
        sleep(3000);
        driver.findElement(inputFirstName).sendKeys(getDate.firstName);
        driver.findElement(inputLastName).sendKeys(getDate.lastName);
        driver.findElement(inputEmail).sendKeys(getDate.email);
        driver.findElement(inputPhone).sendKeys(getDate.phone);
        driver.findElement(inputRole).click();
        driver.findElement(inputOurRole).click();
        driver.findElement(inputCompany).sendKeys(getDate.company);
        driver.findElement(buttonFam).click();
        sleep(3000);
        driver.findElement(buttonRegistr).click();
    }
}
