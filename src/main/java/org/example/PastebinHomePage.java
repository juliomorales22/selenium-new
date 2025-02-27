package org.example;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public  class PastebinHomePage {

    private WebDriver driver;
    private WebDriverWait wait;

    public WebElement agreeCookies;
    private WebElement textPaste;
    private WebElement selectExpiration;
    private WebElement submitButtonHtml;

    //public PastebinHomePage(WebDriver driver) throws InterruptedException {
        //Thread.sleep(5000);
      public PastebinHomePage(WebDriver driver){
        this.driver = driver;
        // explicit wait
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(60));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[contains(@mode, 'primary')]")));
        agreeCookies = driver.findElement(By.xpath("//button[contains(@mode, 'primary')]"));
        textPaste = driver.findElement(By.id("postform-text"));
        selectExpiration = driver.findElement(By.id("postform-expiration"));
        submitButtonHtml = driver.findElement(By.cssSelector("#w0 > div.post-form__bottom > div.post-form__left > div.form-group.form-btn-container > button"));
    }

    public void acceptCookies() {
        agreeCookies.click();
    }

    public void enterPasteText(String text) {
        textPaste.sendKeys(text);
        textPaste.sendKeys(Keys.ENTER);
    }

    public String getPasteText() {
        return textPaste.getAttribute("value");
    }

    public void selectPasteExpiration(String value) {
        Select select = new Select(selectExpiration);
        select.selectByValue(value);
    }

    public void clickSubmit() {
        submitButtonHtml.click();
    }
}


