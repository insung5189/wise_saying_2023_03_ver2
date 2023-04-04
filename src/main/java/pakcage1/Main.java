package pakcage1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Container.scanner();

        new App().run();

        Container.close();
    }
}