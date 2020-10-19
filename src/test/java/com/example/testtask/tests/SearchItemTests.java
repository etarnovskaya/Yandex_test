package com.example.testtask.tests;

import com.example.testtask.model.Item;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchItemTests extends TestBase{

    @Test
    public void testItem() throws InterruptedException {
        app.getMainPage().goToMarket();
        app.getMainPage().switchToNextTab();
        app.getMarketHeader().selectComputersDepartment();
        app.getMarketItem().filterItem(new Item()
                .setItemType("planshety")
                .setPriceFrom("20000")
                .setPriceTo("35000")
                .setBrand("Apple"));

        Thread.sleep(2000);

        String itemName = app.getMarketItem().getItemNameFromListByOrder(2);

        app.getMarketHeader().searchItemFromSearchBox(itemName);
        Thread.sleep(2000);

        String foundItemName = app.getMarketItem().getItemNameFromListByOrder(1);

        Assert.assertEquals(foundItemName, itemName);
    }

}
