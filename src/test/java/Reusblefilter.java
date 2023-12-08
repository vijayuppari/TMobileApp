import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Reusblefilter {

     static WebDriver driver;

    public static void selectfilter(String deals, List<String> products) throws InterruptedException {

        WebElement filterexpandlink = driver.findElement(By.xpath("//legend[normalize-space()='" + deals + "']"));
        filterexpandlink.click();
        if(!products.contains("all")) {
            for (int i = 0; i < products.size(); i++) {
                WebElement productcheckbox = driver.findElement(By.xpath("//span//legend[contains(text(),'" + deals + "')]/ancestor::fieldset//div[@role='group']//span[contains(text(),'" + products.get(i) + "')]"));
                productcheckbox.click();
                Thread.sleep(5000);
            }
        }
        else{
            List<WebElement> allcheckboxes = driver.findElements(By.xpath("//label[contains(@for,'mat-checkbox')]//span[@class='mat-checkbox-inner-container']"));
            allcheckboxes.forEach(check->check.click());
        }
    }
}
