package pakcage1;

public class Util {
    public static String ordinal(int id) {
        switch (id % 10) {
            case 1:
                return id + "st";
            case 2:
                return id + "nd";
            case 3:
                return id + "rd";
            default:
                return id + "th";
        }
    }
}
