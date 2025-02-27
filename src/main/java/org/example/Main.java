package org.example;

import static org.assertj.core.api.Assertions.assertThat;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.creartest.com/creartest1.php");
        PastebinHomePage pastebinHomePage = new PastebinHomePage(driver);
        pastebinHomePage.acceptCookies();
        pastebinHomePage.selectFormCategoria("2");

        pastebinHomePage.entertextTitulo("Titulo del test");
        //assertThat(pastebinHomePage.getPasteText()).containsIgnoringCase("selenium");
        //pastebinHomePage.clickSubmit();
       // driver.quit(); // Cierra el navegador
    }
}

