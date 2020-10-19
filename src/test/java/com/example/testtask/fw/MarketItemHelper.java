package com.example.testtask.fw;

import com.example.testtask.model.Item;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MarketItemHelper extends HelperBase{

    public MarketItemHelper(WebDriver wd) {
        super(wd);
    }

    public void filterItem(Item item) {
        click(By.cssSelector("[href^='/catalog--"+ item.getItemType() +"']"));


        type(By.cssSelector("#glpricefrom"), item.getPriceFrom());
        type(By.cssSelector("#glpriceto"), item.getPriceTo());
        // click(By.cssSelector("[name$=Apple]"));
        click(By.xpath("//span[text()='" + item.getBrand() + "']"));
    }

    public String getItemNameFromListByOrder(int number) {
        return wd.findElement(By.xpath("//*[@data-autotest-id='product-snippet']["+number+"]//h3")).getText();
    }
}
