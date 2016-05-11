package com.blackandwhat;

import com.sun.deploy.util.StringUtils;

import java.math.BigDecimal;

/**
 * Created by cca on 10.05.2016.
 */
public class NoBoringZeros {

    public static void main(String[] args) {
        System.out.println(noBoringZeros(1450));
    }

    public static int noBoringZeros(int n) {
        String nString = Integer.toString(n);

        nString = nString.replaceAll("[0]*$", "");
        return Integer.parseInt(nString);

    }
}
