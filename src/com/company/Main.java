package com.company;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.setPassvord("pass");
        bank.setAmount(1000);
        Scanner scanner = new Scanner(System.in);
        System.out.println("пишите пароль");
        if (scanner.nextLine().equals(bank.getPassvord())) {
            System.out.println("добро пожаловать");
            System.out.println("сколько вам нужно");
            int take = scanner.nextInt();
            if (take <= bank.getAmount()) {
                bank.setAmount(bank.getAmount() - take);
                System.out.println("У вас на счету" + " " + bank.getAmount() + " " + "денег");
            } else {
                System.out.println("У вас нет столько денег");
            }

        } else {
            System.out.println("неверный пароль");


        }
    }
}