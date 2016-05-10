package com.blackandwhat;

public class Main {

    public static String HighAndLow(String numbers) {
        int highest = Integer.MIN_VALUE;
        int lowest = Integer.MAX_VALUE;
        int number;
        for (String s :  numbers.split(" ")) {
            number = Integer.parseInt(s);
            highest = number >= highest ? number : highest;
            lowest = number <= lowest ? number : lowest;
        }
        // Code here or
        System.out.println(highest + " " + lowest);
        return highest + " " + lowest;
    }
}
