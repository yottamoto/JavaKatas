package com.blackandwhat;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * Created by cca on 09.05.2016.
 */
public class GetAge {

    public static void main(String[] args) {
        System.out.println(getAge(1974,04,18));
        System.out.println(getAge(2012,10,26));
        System.out.println(getAge(2012,05,10));
        System.out.println(getAge(2012,05,9));
    }

    public static int getAge(int year, int month, int day) {

        Calendar today = GregorianCalendar.getInstance();
        int age = today.get(Calendar.YEAR) - year;

        if (today.get(Calendar.MONTH) - month + 1 < 0) {
            age = age - 1;
        } else if (today.get(Calendar.MONTH) - month  + 1 == 0) {
            if (today.get(Calendar.DAY_OF_MONTH) - day  + 1 <= 0) {
                age = age -1;
            }
        }
        return age;
    }
}
