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

    public void listExpenses(){
        if(expenses.isEmpty()){
            System.out.println("No recorded.");
            return;
        }
        System.out.println("---- Expense list ----");
        for (Object e : expenses){
            System.out.println(e);
        }
    }

    public void totalExpense(){
        double total = expenses.stream().mapToDouble(Expense::getAmount).sum();
        System.out.println("Total: " + total);
    }
}
