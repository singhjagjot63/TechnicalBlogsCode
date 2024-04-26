package com.singleton.pattern;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class CheckAuthenticity {
    public static void main(String[] args) throws Exception {
        System.out.println(Love.getLove().hashCode());
        System.out.println(Love.getLove().hashCode());
        System.out.println(Money.getMoney().hashCode());
        System.out.println(Money.getMoney().hashCode());

        //Breaking Singleton Design Pattern

        System.out.println(Love.getLove().hashCode());

        Constructor<Love> constructor = Love.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        Love loveObject = constructor.newInstance();
        System.out.println(loveObject.hashCode());

        Love loveObj = Love.getLove();
        System.out.println(loveObj.hashCode());
        ObjectOutputStream objectOutputStream = new ObjectOutputStream
                (new FileOutputStream("sample.ob"));
        objectOutputStream.writeObject(loveObj);

        System.out.println("Serialization is done");

        ObjectInputStream objectInputStream = new ObjectInputStream
                (new FileInputStream("sample.ob"));
        Love love1 = (Love) objectInputStream.readObject();
        System.out.println(love1.hashCode());

    }
}
