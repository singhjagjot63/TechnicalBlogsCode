package com.singleton.pattern;

public class Money {
    private static Money money = new Money();
    public static Money getMoney() {
        return money;
    }
}
