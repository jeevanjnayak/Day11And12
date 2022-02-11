package com.company.Day11And12;

import java.util.ArrayList;
import java.util.Scanner;

class Stock{
    String stockName;
    int noOfShares;
    int sharePrice;

    public void setStockName(String stockName) {
        this.stockName = stockName;
    }
    public void setNoOfShares(int noOfShares) {
        this.noOfShares = noOfShares;
    }
    public void setSharePrice(int sharePrice) {
        this.sharePrice = sharePrice;
    }
}

class StockPortfolio{
    static Scanner sc=new Scanner(System.in);
    static ArrayList<Stock> portfolio = new ArrayList<>();
    static int counter=0;
    static int totalValue;

    public static void addStock() {
        Stock stockInfo=new Stock();

        System.out.println("Enter Stock detail you want to purchase");
        System.out.println("Enter a Name of Sock: ");
        stockInfo.setStockName(sc.next());
        System.out.println("Enter Number of Shares you want to purchase: ");
        stockInfo.setNoOfShares(sc.nextInt());
        System.out.println("Enter Share Price: ");
        stockInfo.setSharePrice(sc.nextInt());

        portfolio.add(stockInfo);
        System.out.println();
        System.out.println("Stock Added");
        counter++;
    }
    public static void addNoOfStock() {
        System.out.println("Enter a Number of Stock you want to add");
        int noOfstock=sc.nextInt();
        for(int i=0;i<=noOfstock;i++) {
            addStock();
        }
    }
    public static void totalValue() {
        for (Stock stock : portfolio) {
            totalValue+=stock.sharePrice*stock.noOfShares;
        }
        System.out.println(totalValue);
    }
}
public class StockManagement {
    static StockPortfolio stocks = new StockPortfolio();
    public static void main(String[] args) {

        int choice=0;
        while (choice < 4) {
            Scanner sc = new Scanner(System.in);
            System.out.println("""
                    Enter your choice\s
                    1: Add Stock\s
                    2: Add Multiple of Stocks\s
                    3: Display Total value of Stocks\s
                    0: Exit\s""");
            choice = sc.nextInt();

            switch (choice) {
                case 1 -> stocks.addStock();
                case 2 -> stocks.addNoOfStock();
                case 3 -> {
                    System.out.println("Total value of your stocks is : ");
                    stocks.totalValue();
                }
                default -> choice = 4;
            }
        }
    }
}
