package constant;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertEquals;

public class constant {
    static ChromeDriver driver = new ChromeDriver();
    public static By typeLocator(String locatorType, String locatorValue) throws IllegalAccessException {
        By locator;
        switch (locatorType.toLowerCase()){
            case "css":
                locator = By.cssSelector(locatorValue);
                break;
            case "tagname":
                locator = By.tagName(locatorValue);
                break;
            case "xpath":
                locator = By.xpath(locatorValue);
                break;
            case "id":
                locator = By.id(locatorValue);
                break;
            case "link text":
                locator = By.linkText(locatorValue);
                break;
            default:
                throw new IllegalAccessException("Type of localization is not valid: "+ locatorType +":" + locatorValue);
        }
        return locator;
    }
    public static void clickElement(String locatorType, String locatorValue) throws IllegalAccessException {
        By element_locator = typeLocator(locatorType,locatorValue);
        driver.findElement(element_locator).click();
    }
    public static void sendKeys(String locatorType, String locatorValue, String key_to_send) throws IllegalAccessException {
        By element_locator = typeLocator(locatorType,locatorValue);
        driver.findElement(element_locator).sendKeys(key_to_send);
    }
    public static void openUrl(String url){
        driver.get(url);
    }
    public static String getElement(String locatorType, String locatorValue) throws IllegalAccessException {
        By element_locator = typeLocator(locatorType,locatorValue);
        String element = driver.findElement(element_locator).getText();
        return element;
    }

    public static void assertContent(String text_to_compare, String locatorValue, String locatorType) throws IllegalAccessException {
        String content = getElement(locatorType,locatorValue);
        assertEquals(text_to_compare,content);
    }

}
