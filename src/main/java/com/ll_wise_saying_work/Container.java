package com.ll_wise_saying_work;

import java.util.Scanner;

public class Container {
    public static Scanner sc;

    public static void init() {
        sc = new Scanner(System.in);
    }
    public static void close() {
        sc.close();
    }
    public static Scanner getScanner () {
        return sc;
    }
}