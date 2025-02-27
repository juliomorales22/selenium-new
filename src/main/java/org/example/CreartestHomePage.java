package org.example;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public  class CreartestHomePage {

    private WebDriver driver;
    private WebDriverWait wait;

    public WebElement agreeCookies;
    private WebElement textPaste;
    private WebElement textTitulo;
    private WebElement textDescripcion;
    private WebElement selectExpiration;
    private WebElement submitButtonHtml;
    private WebElement selectCategoria;
    private WebElement checkAceptar;
      public CreartestHomePage(WebDriver driver){
        this.driver = driver;
        // explicit wait
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(60));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@aria-label=\"Consent\"]")));

        agreeCookies = driver.findElement(By.xpath("//button[@aria-label=\"Consent\"]"));
        selectCategoria = driver.findElement(By.name("Categoria"));

        textTitulo = driver.findElement(By.name("titulo"));
        textDescripcion = driver.findElement(By.name("descripcion_test"));
        checkAceptar= driver.findElement(By.name("Aceptar"));
        //selectExpiration = driver.findElement(By.id("postform-expiration"));
        //submitButtonHtml = driver.findElement(By.cssSelector("#w0 > div.post-form__bottom > div.post-form__left > div.form-group.form-btn-container > button"));
    }

    public void acceptCookies() {
        agreeCookies.click();
    }
    public void enterTextTitulo(String text) {
        textTitulo.sendKeys(text);
    }
    public void enterTextDescripcion(String text) {
        textDescripcion.sendKeys(text);
    }
    public void seleccionaCheckAceptar() {
        checkAceptar.click();
    }

    public String getPasteText() {
        return textPaste.getAttribute("value");
    }
    public void selectFormCategoria(String value) {
        Select select = new Select(selectCategoria);
        select.selectByValue(value);
    }
    public void selectPasteExpiration(String value) {
        Select select = new Select(selectExpiration);
        select.selectByValue(value);
    }

    public void clickSubmit() {
        submitButtonHtml.click();
    }
}


