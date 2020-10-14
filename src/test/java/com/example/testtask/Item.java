package com.example.testtask;

public class Item {
    private final String itemType;
    private final String priceFrom;
    private final String priceTo;
    private final String brand;

    public Item(String itemType, String priceFrom, String priceTo, String brand) {
        this.itemType = itemType;
        this.priceFrom = priceFrom;
        this.priceTo = priceTo;
        this.brand = brand;
    }

    public String getItemType() {
        return itemType;
    }

    public String getPriceFrom() {
        return priceFrom;
    }

    public String getPriceTo() {
        return priceTo;
    }

    public String getBrand() {
        return brand;
    }
}
