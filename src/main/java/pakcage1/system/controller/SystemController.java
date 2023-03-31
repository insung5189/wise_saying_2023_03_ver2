package pakcage1.system.controller;

public class SystemController {
    public void terminate () {
        System.out.println("Application has been terminated.");
    }

    public void help() {
        System.out.println("=".repeat(27));
        System.out.println("1. register");
        System.out.println("2. list");
        System.out.println("3. terminate");
    }

    public void errorInput() {
        System.out.println("Please enter the valid command. If you want to know about commands, then enter \"help\"");
    }
}
