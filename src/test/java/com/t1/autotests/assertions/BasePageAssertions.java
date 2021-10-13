package com.t1.autotests.assertions;

import static org.assertj.core.api.Assertions.assertThat;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePageAssertions {

    public void assertCategoryName(WebDriverWait wait, String expected) {
        assertThat(wait.until(ExpectedConditions.elementToBeClickable(
            By.className("cat-name"))).getText().trim().equalsIgnoreCase(expected));
    }
}
