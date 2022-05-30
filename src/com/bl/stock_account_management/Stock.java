package com.bl.stock_account_management;

public class Stock {

    private String stockName;
    private int numberOfShare;
    private double sharePrice;

    Stock(String stockName, int numberOfShare, double sharePrice) {

        this.stockName = stockName;
        this.numberOfShare = numberOfShare;
        this.sharePrice = sharePrice;
    }

    public String getStockName() {
        return stockName;
    }

    public int getNumberOfShare() {
        return numberOfShare;
    }

    public double getSharePrice() {
        return sharePrice;
    }
}