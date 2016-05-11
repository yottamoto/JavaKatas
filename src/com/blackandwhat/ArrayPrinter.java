package com.blackandwhat;

/**
 * Created by cca on 10.05.2016.
 */
public class ArrayPrinter {

    public static void main(String[] args) {
        Integer[] array=new Integer[]{2,4,5,2};
        System.out.println(printArray(array));
    }

    public static String printArray(Object array[]) {
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < array.length - 1; i++) {
            output.append(array[i]);
            output.append(",");
        }
        output.append(array[array.length -1].toString());
        return output.toString();
    }
}
