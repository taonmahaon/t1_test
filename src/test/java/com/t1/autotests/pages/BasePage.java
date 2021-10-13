package com.t1.autotests.pages;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
    protected final WebDriver driver;
    protected final WebDriverWait wait;

    public BasePage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    public void openSiteByUrl(String url) {
        driver.navigate().to(url);
    }

    public void openCategoryFromTopMenu(String categoryName) {
        List<WebElement> displayNoneBypass = driver.findElements(By.xpath(String.format("//a[@title='%s']", categoryName)));
        wait.until(ExpectedConditions.elementToBeClickable(
            By.xpath(String.format("(//a[@title='%s'])[%s]", categoryName, displayNoneBypass.size())))).click();
        System.out.println(wait.until(ExpectedConditions.elementToBeClickable(
            By.className("cat-name"))).getText());
    }
}
