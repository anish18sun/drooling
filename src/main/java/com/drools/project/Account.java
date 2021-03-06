package com.drools.project;

public class Account {

  private String name;
  private double balance;

  public Account() {
    this.name = "Anish";
    this.balance = 345.00;
  }

  public Account(String name, double balance) {
    this.name = name;
    this.balance = balance;
  }

  public String getName() { return name; }

  public void setName(String name) { this.name = name; }

  public double getBalance() { return balance; }

  public void setBalance(double balance) { this.balance = balance; }
}
