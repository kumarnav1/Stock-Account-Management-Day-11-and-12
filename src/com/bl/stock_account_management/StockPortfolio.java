package com.bl.stock_account_management;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StockPortfolio {

    double totalValue = 0;

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
        for (Stock indexOfObj : arrayStocksList) {

            valueOfEachStock = indexOfObj.getNumberOfShare() * indexOfObj.getSharePrice();
            totalValue += valueOfEachStock;
            System.out.println("Value of stock \"" + indexOfObj.getStockName() + "\" is : $" + valueOfEachStock);
        }

        System.out.println("\n \tTotal value        : $" + totalValue);
    }

    int debit() {

        double withdrawAmount;
        System.out.print("Enter the amount you want to withdraw : ");
        withdrawAmount = scanner.nextDouble();

        if (totalValue - withdrawAmount <= 0)
            System.out.println("Insufficient balance. Debit amount exceeded account balance. \n ");
        else if (withdrawAmount == 0) {
            System.out.println("Enter amount grater than zero to withdraw the amount. \n");
            return 1;
        } else {
            System.out.print("The amount of $" + withdrawAmount + " will be deducted form your Account. \n Press Y to proceed or N to cancel the process : ");
            char tempChar = scanner.next().charAt(0);
            if ((tempChar == 'Y') || (tempChar == 'y')) {
                totalValue = totalValue - withdrawAmount;
                System.out.println("\n Amount of $" + withdrawAmount + " withdrawn from the Account. Report Dispute if you haven't initiated the payment. \n Thank you !!");
                System.out.println("Remaining Balance is : $" + totalValue);
            } else {
                System.out.println("Withdrawal process has been terminated, you're being redirected to main menu.\n");
                return 1;
            }
        }
        return 1;
    }
}