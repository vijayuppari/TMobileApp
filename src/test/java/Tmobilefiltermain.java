import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Arrays;
import java.util.List;

public class Tmobilefiltermain extends  Reusblefilter{

    public static void main(String[] args) throws InterruptedException {

        driver = new ChromeDriver();
        driver.get("https://www.t-mobile.com/tablets");
        driver.manage().window().maximize();
        Thread.sleep(5000);


        List<String> products = Arrays.asList("all");
        List<String> productsOS = Arrays.asList("Android","iPadOS","Other");
        List<String> productsDeals = Arrays.asList("New");

        selectfilter("Brands",products);
        selectfilter("Operating System",productsOS);
        selectfilter("Deals",productsDeals);

    }
}
