package com.t1.autotests;

import com.t1.autotests.assertions.BasePageAssertions;
import com.t1.autotests.pages.BasePage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestContext;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class SetUp {

    protected WebDriver webDriver;
    protected BasePageAssertions basePageAssertions;
    protected WebDriverWait wait;
    protected BasePage basePage;


    @BeforeClass(alwaysRun = true)
    public void setUp(ITestContext context) {
        WebDriverManager.chromedriver().setup();
        webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
        wait = new WebDriverWait(webDriver, 5);
        basePage = new BasePage(webDriver, wait);
        basePageAssertions = new BasePageAssertions();
    }

    @AfterClass(alwaysRun = true)
    public void tearDown() {
        webDriver.quit();
    }
}
