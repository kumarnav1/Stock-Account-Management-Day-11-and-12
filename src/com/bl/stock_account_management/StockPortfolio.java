package com.bl.stock_account_management;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StockPortfolio {

    List<Stock> arrayStocksList = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    Stock stock;

    void readStockData(int stockNumber) {

        System.out.println(" \n Enter the details for stock " + stockNumber);
        System.out.print("Enter the Stock Name :");
        String stockName = scanner.nextLine();

        System.out.print("Enter the Number of share : ");
        int numberOfShare = scanner.nextInt();

        System.out.print("Enter the Share price : ");
        double sharePrice = scanner.nextDouble();
        scanner.nextLine();

        stock = new Stock(stockName, numberOfShare, sharePrice);
        arrayStocksList.add(stock);

        System.out.println("Stock details are added for the stock " + stockNumber + "\n");
    }

    void calculateStock() {

        double valueOfEachStock;
        double totalValue = 0;
        for (Stock indexOfObj : arrayStocksList) {

            valueOfEachStock = indexOfObj.getNumberOfShare() * indexOfObj.getSharePrice();
            totalValue += valueOfEachStock;
            System.out.println("Value of stock \"" + indexOfObj.getStockName() + "\" is : " + valueOfEachStock);
        }

        System.out.println("\n \tTotal value        : " + totalValue);
    }
}