package stepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ShoppingCartStep {
    WebDriver driver;


        @Given("^I navigate to the website$")
                public void iNavigateToTheWebsite() throws InterruptedException {
            System.setProperty("webdriver.chrome.driver", "/Users/Wiley/BlueSky/Chrome/chromedriver");

            WebDriver driver = new ChromeDriver();
            driver.get("https://www.abelandcole.co.uk/");
            //Thread.sleep(5000);
            //driver.quit();
        }

    @When("^I click on start my shop$")
    public void iClickOnStartMyShop() throws InterruptedException {
            Thread.sleep(5000);
            driver.findElement(By.cssSelector("#prospect-home-page > div > section.headerSection > div > div > a > button")).click();
    }

    @And("^I hoover on Meat to select Chicken$")
    public void iHooverOnMeatToSelectChicken() {
            new Select(driver.findElement(By.xpath("//*[@id=\"menu-parent\"]/ul/li[2]"))).selectByVisibleText("Chicken");
    }

    @And("^I add two chicken whole to the basket$")
    public void iAddTwoChickenWholeToTheBasket() {

    }
}

