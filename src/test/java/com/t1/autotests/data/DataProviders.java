package com.t1.autotests.data;

import org.testng.annotations.DataProvider;

public class DataProviders {

    @DataProvider
    public static Object [][] testData() {
        return new Object[][] {{"Women"}, {"Dresses"}, {"T-shirts"}};
    }
}
