package com.t1.autotests;

import static com.t1.autotests.data.Constants.URL;

import com.t1.autotests.data.DataProviders;
import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.testng.annotations.Test;

@Feature("automationpractice.com Home Page")
@Story("Checking the operation of homepage components")
public class PracticeTest extends SetUp {
    @Test(description = "PracticeTest", dataProvider = "testData", dataProviderClass = DataProviders.class)
    @Description("Assertions that there are proper top menu components names")
    public void assertCatalogNames(String categoryName) {
        basePage.openSiteByUrl(URL);
        basePage.openCategoryFromTopMenu(categoryName);
        basePageAssertions.assertCategoryName(wait, categoryName);
    }
}
