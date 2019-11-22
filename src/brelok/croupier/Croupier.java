package brelok.croupier;

import java.util.Random;

public class Croupier {

    private static int gold = 2;
    private static int red = 6;
    private static int pink = 12;
    private static int violet = 30;
    private static int blue = 50;

    private static final int boundGift = 101;
    private static final int boundItem = 10;

    public static void main(String[] args) {

        Random randomGift = new Random();

        int drawnColorGift = 0;

        if (randomGift.nextInt(boundGift) + 1 == 1 && randomGift.nextInt(boundGift) + 1 == 2) {
            drawnColorGift = gold;
        } else if (randomGift.nextInt(boundGift) + 1 >= 3 && randomGift.nextInt(boundGift) + 1 <= 8) {
            drawnColorGift = red;
        } else if (randomGift.nextInt(boundGift) + 1 >= 9 && randomGift.nextInt(boundGift) + 1 <= 20) {
            drawnColorGift = pink;
        } else if (randomGift.nextInt(boundGift) + 1 >= 21 && randomGift.nextInt(boundGift) + 1 <= 50) {
            drawnColorGift = violet;
        } else {
            drawnColorGift = blue;
        }

        Random randomItem = new Random();

        if (drawnColorGift == 2) {
            GoldItems goldItems = new GoldItems(randomItem.nextInt(boundItem) + 1);
            System.out.println("In gold present you won item number " + goldItems.getNumber());
        } else if (drawnColorGift == 6) {
            RedItems redItems = new RedItems(randomItem.nextInt(boundItem) + 1);
            System.out.println("In red present you won item number " + redItems.getNumber());
        } else if (drawnColorGift == 12) {
            PinkItems pinkItems = new PinkItems(randomItem.nextInt(boundItem) + 1);
            System.out.println("In pink present you won item number " + pinkItems.getNumber());
        } else if (drawnColorGift == 12) {
            VioletItems violetItems = new VioletItems(randomItem.nextInt(boundItem) + 1);
            System.out.println("In violet present you won item number " + violetItems.getNumber());
        } else {
            BlueItems blueItems = new BlueItems(randomItem.nextInt(boundItem) + 1);
            System.out.println("In blue present you won item number " + blueItems.getNumber());
        }
    }
}