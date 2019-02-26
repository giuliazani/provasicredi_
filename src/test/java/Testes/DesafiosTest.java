package Testes;

import PageObjects.GroceryCrud;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;

import static junit.framework.TestCase.assertEquals;

public class DesafiosTest {

    public static WebDriver driver = null;
    GroceryCrud teste = new GroceryCrud();

    @Before
    public void setUp(){
        File file = new File("C:\\Users\\GiuliaMarquesZanidos\\Drivers\\chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(" https://www.grocerycrud.com/demo/bootstrap_theme");
    }

    @Test
    public void Test1(){
        teste.selectVersion(driver).sendKeys("Bootstrap V4 Theme");
        teste.clickAddCustomer(driver).click();
        teste.fieldName(driver).sendKeys("Teste Sicredi");
        teste.fieldLastName(driver).sendKeys("Teste");
        teste.fieldContactFirstName(driver).sendKeys("Giulia");
        teste.fieldPhone(driver).sendKeys("51 9999-9999");
        teste.fieldAddressLine1(driver).sendKeys("Av Assis Brasil, 3970");
        teste.fieldAddressLine2(driver).sendKeys("Torre D");
        teste.fieldCity(driver).sendKeys("Porto Alegre");
        teste.fieldState(driver).sendKeys("RS");
        teste.fieldPostalCode(driver).sendKeys("91000-000");
        teste.fieldCountry(driver).sendKeys("Brasil");
        teste.fieldEmployeer(driver).click();
        teste.fieldEmployeerFixter(driver).click();
        teste.fieldCreditLimit(driver).sendKeys("200");
        teste.clickSave(driver).click();
        sleep(4000);
        assertEquals("Your data has been successfully stored into the database. Edit Customer or Go back to list",
        driver.findElement(By.xpath("//p[contains(text(),'Your data has been successfully stored into the database.')]")).getText());
    }

    @Test
    public void Test2(){
        Test1();
        teste.clickGoBackToList(driver).click();
        teste.clickSearchBox(driver).click();
        teste.typeName(driver).sendKeys("Teste Sicredi" + Keys.ENTER);
        sleep(1000);
        teste.checkBox(driver).click();
        teste.clickDelete(driver).click();
        assertEquals("Are you sure that you want to delete this 1 item?",
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[3]/div/div/div[2]/p[2]")).getText());
        teste.clickDeletePopup(driver).click();
        sleep(1000);
        assertEquals("Your data has been successfully deleted from the database.",
        driver.findElement(By.xpath("//p[contains(text(),'Your data has been successfully deleted from the database.')]")).getText());
    }

    public static void sleep(int time){
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @After
    public void tearDown(){
        driver.close();
        driver.quit();
    }


}
