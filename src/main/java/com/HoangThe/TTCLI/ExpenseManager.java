package com.HoangThe.TTCLI;

import java.util.List;
import java.util.ArrayList;

public class ExpenseManager {
    private List<Expense> expenses = new ArrayList<>();

    public void addExpense(String description, double amount){
        Expense expense = new Expense(description,amount);
        expenses.add(expense);
        System.out.println("Expense added.");
    }
}
