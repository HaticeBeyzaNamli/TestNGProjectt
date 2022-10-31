import Utility.BaseStaticDriver;
import com.google.inject.spi.Dependency;
import org.junit.rules.Timeout;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class proje extends BaseStaticDriver {


    @Test
    void testI5() {

        WebElement laptop = driver.findElement(By.linkText("Laptops"));
        laptop.click();

        WebElement sonyI5 = driver.findElement(By.xpath("//*[contains(text(),'vaio i5')]"));
        sonyI5.click();

        WebElement addToCard1 = driver.findElement(By.cssSelector("[onclick=\"addToCart(8)\"]"));
        addToCard1.click();

        wait.until(ExpectedConditions.alertIsPresent());

        driver.switchTo().alert().accept();

        BekleKapat();

    }

    @Test
    void testI7() {

        WebElement laptop2 = driver.findElement(By.linkText("Laptops"));
        laptop2.click();

        WebElement dellI7 = driver.findElement(By.xpath("//*[contains(text(),'Dell i7')]"));
        dellI7.click();

        WebElement addToCart = driver.findElement(By.xpath("//*[contains(text(),'to cart')]"));
        addToCart.click();

        wait.until(ExpectedConditions.alertIsPresent());
        driver.switchTo().alert().accept();

        WebElement cart = driver.findElement(By.xpath("//*[contains(text(),'Cart')]"));
        cart.click();

        WebElement delete = driver.findElement(By.linkText("Delete"));
        delete.click();

        wait.until(ExpectedConditions.textToBe(By.id("totalp"),""));

        WebElement placeOrder = driver.findElement(By.xpath("//*[text()='Place Order']"));
        placeOrder.click();

        WebElement name=driver.findElement(By.cssSelector("[id=\"name\"]"));
        name.sendKeys("Beyza");

        WebElement country=driver.findElement(By.cssSelector("[id=\"country\"]"));
        country.sendKeys("Türkiye");

        WebElement city= driver.findElement(By.cssSelector("input[id=\"city\"]"));
        city.sendKeys("Istanbul");

        WebElement creditCard=driver.findElement(By.cssSelector("[id=\"card\"]"));
        creditCard.sendKeys("123456987");

        WebElement month=driver.findElement(By.cssSelector("[id=\"month\"]"));
        month.sendKeys("june");

        WebElement year=driver.findElement(By.cssSelector("[id=\"year\"]"));
        year.sendKeys("2021");

        WebElement purchase=driver.findElement(By.xpath("//*[text()=\"Purchase\"]"));
        purchase.click();

        WebElement liste=driver.findElement(By.cssSelector("[class=\"lead text-muted \"]"));
        System.out.println(liste.getText());

        Assert.assertTrue(liste.getText().contains("0 USD"));

        BekleKapat();
    }
}
