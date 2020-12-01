package com.nike.data;

import org.testng.annotations.DataProvider;

public class DataProviders {
    @DataProvider(name = "searchData")
    public Object[] getSearchData() {
        return new Object[]{"Air force ", "Jordan ", "Blazer "};
    }

    @DataProvider(name = "credentials")
    public Object[][] getCredentials() {
        return new Object[][]{{"alnassiryahmed5@gmail.com", "Test1234"}, {"testuser002", "testpass002"}, {"testuser003", "testpass003"}};
    }
}
