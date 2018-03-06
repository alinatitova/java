package com.company;

public class BankService {
    public static void confirmPin(String pin) throws Exception {
        if (pin.equals("12345") == false) {
            throw new Exception("Неверный пароль");
        }
    }

    public static int balance = 100000;

    public static int getBalance() {
        return balance;
    }

    public static void getCash(int sum) throws Exception {
        if (sum > balance) {
            throw new Exception("Недостаточно средств");
        }
        balance -= sum; //то же, что и balance = balance - sum
    }
}
