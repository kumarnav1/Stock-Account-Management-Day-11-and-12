package com.bl.stock_account_management;

import java.util.Scanner;

public class StockAccountMain {
    public static void main(String[] args) {

        System.out.println("Welcome to Stock Account Management System.");
        System.out.print("Enter the number of stocks you want to add : ");

        StockPortfolio stockPortfolio = new StockPortfolio();
        Scanner scanner = new Scanner(System.in);
        int numberOfStock = scanner.nextInt();

        for (int index = 0; index < numberOfStock; index++) {

            stockPortfolio.readStockData(index + 1);
        }

        stockPortfolio.calculateStock();
    }
}