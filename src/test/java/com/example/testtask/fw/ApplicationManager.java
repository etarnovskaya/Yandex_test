package com.example.testtask.fw;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.BrowserType;

public class ApplicationManager {
    WebDriver wd;
    MainPageHelper mainPage;
    MarketHeaderHelper marketHeader;
    MarketItemHelper marketItem;
    String browser;

    public ApplicationManager(String browser) {
        this.browser = browser;
    }

    public void init() {
        if(browser.equals(BrowserType.CHROME)){
           wd = new ChromeDriver();
        } else if(browser.equals(BrowserType.FIREFOX)){
            wd = new FirefoxDriver();
        } else if(browser.equals(BrowserType.IE)){
            wd = new InternetExplorerDriver();
        }

        wd.manage().window().maximize();
        openSite("https://yandex.ru/");

        mainPage = new MainPageHelper(wd);
        marketHeader = new MarketHeaderHelper(wd);
        marketItem = new MarketItemHelper(wd);
    }

    public void stop() {
        wd.quit();
    }


    public void openSite(String url) {
        wd.navigate().to(url);
    }


    public MainPageHelper getMainPage() {
        return mainPage;
    }

    public MarketHeaderHelper getMarketHeader() {
        return marketHeader;
    }

    public MarketItemHelper getMarketItem() {
        return marketItem;
    }
}
