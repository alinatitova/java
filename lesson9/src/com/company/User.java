package com.company;

import java.io.Serializable;

public class User implements Serializable {
    public String name;
    public String avatar;

    @Override
    public String toString() {
        return String.format("%s, %s", name, avatar);//%d - целое число, %b - типа булеан, %s - строка


    }
}
