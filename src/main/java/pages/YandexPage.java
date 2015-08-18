package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by def on 18.08.15.
 */
public class YandexPage extends AbstractPage{

    private final String SEARCH_BUTTON_PATH = ".//button[*[text()='Найти']]";

    public YandexPage(WebDriver webDriver) {
        super(webDriver);
    }

    public YandexPage open(String url){
        webDriver.get(url);
        wait.until((WebDriver d) -> d.findElement(By.xpath(SEARCH_BUTTON_PATH)));
        return this;
    }

    public YandexPage fillTextField(String text) {
        WebElement searchField = webDriver.findElement(By.name("text"));
        searchField.clear();
        searchField.sendKeys(text);
        return this;
    }

    public YandexPage clickSearchButton() {
        WebElement searchButton = webDriver.findElement(By.xpath(SEARCH_BUTTON_PATH));
        searchButton.click();
        return this;
    }
}
