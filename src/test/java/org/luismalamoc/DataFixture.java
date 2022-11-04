package org.luismalamoc;

public class DataFixture {

    public static Integer[] getUnorderedIntegers(){
        return new Integer[]{ 10, 55, -5, 34, 7, 22, 19 };
    }
    public static String[] getUnorderedStrings(){
        return new String[]{ "Sylvanas", "Arthas", "Illian", "Thrall", "Jaina" };
    }
    public static Integer[] getOrderedIntegers(){
        return new Integer[]{ -5, 7, 10, 19, 22, 34, 55 };
    }
    public static String[] getOrderedStrings(){
        return new String[]{ "Arthas", "Illian", "Jaina", "Sylvanas", "Thrall"  };
    }
}
