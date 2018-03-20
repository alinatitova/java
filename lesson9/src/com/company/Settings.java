package com.company;

import java.io.Serializable;

public class Settings implements Serializable {
    public int posX;
    public int posY;
    public boolean fullScreen;
@Override
    public String toString (){
    return String.format ("%d, %d, %b", posX, posY, fullScreen);//%d - целое число, %b - типа булеан, %s - строка

}

}
