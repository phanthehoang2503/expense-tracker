package com.HoangThe.TTCLI;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        ExpenseManager em = new ExpenseManager();
        Scanner sc = new Scanner(System.in);
        boolean rn = true;

        while (rn){
            System.out.println("\n=== Expense Tracker ===");
            System.out.println("1. Add Expense");
            System.out.println("2. List Expenses");
            System.out.println("3. Show Total");
            System.out.println("4. Exit");
            System.out.print("Choose option: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter description: ");
                    String desc = sc.nextLine();
                    System.out.print("Enter amount: ");
                    double amount = sc.nextDouble();
                    em.addExpense(desc, amount);
                    break;
                }
                case 2 -> {
                    em.listExpenses();
                    break;
                }
                case 3 -> {
                    em.totalExpense();
                    break;
                }
                case 4 -> {
                    rn = false;
                    break;
                }
                default -> System.out.println("Invalid option, please try again.");
            }
        }

        sc.close();
        System.out.println("================");
    }
}
