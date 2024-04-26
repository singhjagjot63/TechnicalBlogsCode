package com.singleton.pattern;

import java.lang.constant.Constable;
import java.lang.reflect.Constructor;

public class LoveCheck {
    public static void main(String[] args) throws Exception {
        Pyar pyar = Pyar.INSTANCE;
        System.out.println(pyar.hashCode());
        Constructor<Pyar> constructor = Pyar.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        Pyar pyar1 = constructor.newInstance();
        System.out.println(pyar1);
    }
}
