package pakcage1;

import java.util.Scanner;

public class Container {
    public static Scanner sc;

    public Container(Scanner sc) {
        this.sc = sc;
    }
    public static void scanner () {
       sc = new Scanner(System.in);
    }
    public static void close () {
        sc.close();
    }
    public static Scanner getScanner () {
        return sc;
    }



}
