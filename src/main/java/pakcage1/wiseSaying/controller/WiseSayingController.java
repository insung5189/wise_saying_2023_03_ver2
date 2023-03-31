package pakcage1.wiseSaying.controller;

import pakcage1.Util;
import pakcage1.wiseSaying.entity.WiseSaying;

import java.util.ArrayList;
import java.util.Scanner;

public class WiseSayingController {
    ArrayList<WiseSaying> wiseSayingList = new ArrayList<>();
    int id = 1;

    private final Scanner sc;

    public WiseSayingController(Scanner sc) {
        this.sc = sc;
    }


    public void register() {
        System.out.println("=".repeat(27));

        System.out.printf("Wise Saying : ");
        String saying = this.sc.nextLine().trim();

        System.out.printf("Author : ");
        String author = this.sc.nextLine().trim();

        wiseSayingList.add(new WiseSaying(id, author, saying));

        System.out.println(Util.ordinal(id++) + " wise saying has been registered.");
    }

    public void list() {
        if (wiseSayingList.size() > 0) {
            System.out.println("=".repeat(27));
            System.out.println("Id / Author / Wise Saying");
            System.out.println("-".repeat(30));

            for (int i = wiseSayingList.size() - 1; i >= 0; i--) {
                System.out.println(wiseSayingList.get(i).getList());
            }
        } else {
            System.out.println("There is no list in this application.");
        }
    }
}
