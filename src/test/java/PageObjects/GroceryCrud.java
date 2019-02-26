package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GroceryCrud {
    public WebElement selectVersion(WebDriver driver){
        String id = "switch-version-select";
        return driver.findElement(By.id(id));
    }

    public WebElement clickAddCustomer(WebDriver driver){
         String xpath = "//*[@id=\"gcrud-search-form\"]/div[1]/div[1]/a";
         return driver.findElement(By.xpath(xpath));
    }

    public WebElement fieldName(WebDriver driver){
        String id = "field-customerName";
        return driver.findElement(By.id(id));
    }

    public WebElement fieldLastName(WebDriver driver){
        String id = "field-contactLastName";
        return driver.findElement(By.id(id));
    }

    public WebElement fieldContactFirstName(WebDriver driver){
        String id = "field-contactFirstName";
        return driver.findElement(By.id(id));
    }

    public WebElement fieldPhone(WebDriver driver){
        String id = "field-phone";
        return driver.findElement(By.id(id));
    }

    public WebElement fieldAddressLine1(WebDriver driver){
        String id = "field-addressLine1";
        return driver.findElement(By.id(id));
    }

    public  WebElement fieldAddressLine2(WebDriver driver){
        String id = "field-addressLine2";
        return driver.findElement(By.id(id));
    }

    public WebElement fieldCity(WebDriver driver){
        String id = "field-city";
        return driver.findElement(By.id(id));
    }

    public WebElement fieldState(WebDriver driver) {
        String id = "field-state";
        return driver.findElement(By.id(id));
    }

    public WebElement fieldPostalCode(WebDriver driver){
        String id = "field-postalCode";
        return driver.findElement(By.id(id));
    }

    public WebElement fieldCountry(WebDriver driver){
        String id = "field-country";
        return driver.findElement(By.id(id));
    }
    public WebElement fieldEmployeer(WebDriver driver){
        String id = "field_salesRepEmployeeNumber_chosen";
        return driver.findElement(By.id(id));
    }

    public WebElement fieldEmployeerFixter(WebDriver driver){
        String xpath = "//*[@id=\"field_salesRepEmployeeNumber_chosen\"]/div/ul/li[8]";
        return driver.findElement(By.xpath(xpath));
    }

    public WebElement fieldCreditLimit(WebDriver driver) {
        String id = "field-creditLimit";
        return driver.findElement(By.id(id));
    }

    public WebElement clickSave(WebDriver driver){
        String id = "form-button-save";
        return driver.findElement(By.id(id));
    }

    public WebElement clickGoBackToList(WebDriver driver){
        String xpath = "//*[@id=\"report-success\"]/p/a[2]";
        return driver.findElement(By.xpath(xpath));
    }

    public WebElement clickSearchBox(WebDriver driver){
        String xpath = "//*[@id=\"gcrud-search-form\"]/div[1]/div[2]/a[3]/i";
        return driver.findElement(By.xpath(xpath));
    }

    public WebElement typeName(WebDriver driver){
        String xpath = "//*[@id=\"gcrud-search-form\"]/div[1]/div[2]/a[3]/input";
        return driver.findElement(By.xpath(xpath));
    }

    public WebElement checkBox(WebDriver driver){
        String className = "select-all-none";
        return driver.findElement(By.className(className));
    }

    public WebElement clickDelete(WebDriver driver){
        String xpath = "//*[@id=\"gcrud-search-form\"]/div[2]/table/thead/tr[2]/td[2]/div[1]/a";
        return driver.findElement(By.xpath(xpath));
    }

    public WebElement clickDeletePopup(WebDriver driver){
        String xpath = "/html/body/div[2]/div[2]/div[3]/div/div/div[3]/button[2]";
        return driver.findElement(By.xpath(xpath));
    }


}
