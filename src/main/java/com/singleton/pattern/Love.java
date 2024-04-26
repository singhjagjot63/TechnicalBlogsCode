package com.singleton.pattern;

import java.io.Serializable;

public class Love implements Serializable {

    private static Love love;
    private Love() {
        if(love != null) {
            throw new RuntimeException("You naughty!!..Don't try to break the " +
                    "singleton pattern :) ");
        }
    }

    public static Love getLove() {
        if(love == null) {
            synchronized (Love.class) {
                love = new Love();
            }
        }
        return love;
    }

    public Object readResolve() {
        return love;
    }
}
