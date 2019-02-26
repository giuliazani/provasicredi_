import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.util.concurrent.TimeUnit;

import static junit.framework.TestCase.assertEquals;

public class grocerycrud {

    public static void main(String[] args) {
        File file = new File("C:\\Users\\GiuliaMarquesZanidos\\Desktop\\ibm-automationcourse\\TesteSicredi\\src\\test\\java\\chromedriver.exe");

        System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());

        WebDriver driver = new ChromeDriver();

        WebDriverWait wait = new WebDriverWait(driver, 5);

        //Maximiza a página

        driver.manage().window().maximize();

        //Abre o browser

        driver.get(" https://www.grocerycrud.com/demo/bootstrap_theme");

        //Muda para Bootstrap V4 Theme

        new Select(driver.findElement(By.xpath("//*[@id=\"switch-version-select\"]"))).selectByVisibleText("Bootstrap V4 Theme");

        //Adiciona o cliente

        driver.findElement(By.xpath("//*[@id=\"gcrud-search-form\"]/div[1]/div[1]/a")).click();

        //Teste Sicredi

        driver.findElement(By.id("field-customerName")).sendKeys("Teste Sicredi");

        //Teste

        driver.findElement(By.id("field-contactLastName")).sendKeys("Teste");

        //Nome

        driver.findElement(By.id("field-contactFirstName")).sendKeys("Giulia");

        //Telefone

        driver.findElement(By.id("field-phone")).sendKeys(" 51 9999-9999");

        //Endereço 1

        driver.findElement(By.id("field-addressLine1")).sendKeys(" Av Assis Brasil, 3970");

        //Endereço 2

        driver.findElement(By.id("field-addressLine2")).sendKeys(" Torre D");

        //Cidade

        driver.findElement(By.id("field-city")).sendKeys("Porto Alegre");

        //Estado

        driver.findElement(By.id("field-state")).sendKeys("RS");

        // CEP

        driver.findElement(By.id("field-postalCode")).sendKeys("91000-000");

        //País

        driver.findElement(By.id("field-country")).sendKeys("Brasil");

        //Checkbox

        driver.findElement(By.id("field_salesRepEmployeeNumber_chosen")).click();
        driver.findElement(By.xpath("//*[@id=\"field_salesRepEmployeeNumber_chosen\"]/div/ul/li[8]")).click();

        //200

        driver.findElement(By.id("field-creditLimit")).sendKeys("200");

        //Clicar no botão save

        driver.findElement(By.id("form-button-save")).click();

        driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);

        //AssertEquals

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Your data has been successfully stored into the database.')]")));

        System.out.println(driver.findElement(By.xpath("//p[contains(text(),'Your data has been successfully stored into the database.')]")).getText());

        assertEquals("Your data has been successfully stored into the database. Edit Customer or Go back to list", driver.findElement(By.xpath("//p[contains(text(),'Your data has been successfully stored into the database.')]")).getText());

        driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);

        //Fechar o browser

        //driver.close();



        //Clicar no botão Go back to list

        driver.findElement(By.xpath("//*[@id=\"report-success\"]/p/a[2]")).click();

        //Clicar na lupa

        driver.findElement(By.xpath("//*[@id=\"gcrud-search-form\"]/div[1]/div[2]/a[3]/i")).click();

        //Escrever Teste Sicredi

        driver.findElement(By.xpath("//*[@id=\"gcrud-search-form\"]/div[1]/div[2]/a[3]/input")).sendKeys("Teste Sicredi" + Keys.ENTER);

        //Checkbox

        driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//td[contains(text(),'Porto Alegre')]")));
        driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
        driver.findElement(By.className("select-all-none")).click();

        //Clicar no botão delete

        driver.findElement(By.xpath("//*[@id=\"gcrud-search-form\"]/div[2]/table/thead/tr[2]/td[2]/div[1]/a")).click();

        //Validar Mensagem

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[2]/div[2]/div[3]/div/div/div[2]/p[2]")));

        System.out.println(driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[3]/div/div/div[2]/p[2]")).getText());

        assertEquals("Are you sure that you want to delete this 1 item?", driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[3]/div/div/div[2]/p[2]")).getText());

        driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);

        //Deletar

        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[3]/div/div/div[3]/button[2]")).click();

        //Validar Mensagem

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Your data has been successfully deleted from the database.')]")));

        System.out.println(driver.findElement(By.xpath("//p[contains(text(),'Your data has been successfully deleted from the database.')]")).getText());

        assertEquals("Your data has been successfully deleted from the database.", driver.findElement(By.xpath("//p[contains(text(),'Your data has been successfully deleted from the database.')]")).getText());

        driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);

        driver.close();



    }
    }

