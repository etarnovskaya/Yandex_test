package com.example.testtask.fw;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MarketHeaderHelper extends HelperBase{

    public MarketHeaderHelper(WebDriver wd) {
        super(wd);
    }

    public void selectComputersDepartment() throws InterruptedException {
        Thread.sleep(3000);
        click(By.cssSelector("[href*='kompiuternaia-tekhnika']"));
    }
    public void searchItemFromSearchBox(String itemName) {
        type(By.cssSelector("#header-search"), itemName);
        click(By.cssSelector("[type=submit]"));
    }
}
