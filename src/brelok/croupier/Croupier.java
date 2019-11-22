package brelok.croupier;

import java.util.Random;

public class Croupier {

    private static int gold = 2;
    private static int red = 6;
    private static int pink = 12;
    private static int violet = 30;
    private static int blue = 50;

    private static final int boundGift = 100;
    private static final int boundItem = 9;

    public static void main(String[] args) {

        Random random = new Random();
        int randomGift = random.nextInt(boundGift) + 1; //bounds from 1 to 100

        int drawnColorGift = 0;

        if (randomGift == 1 || randomGift == 2) {
            drawnColorGift = gold;
        } else if (randomGift >= 3 && randomGift <= 8) {
            drawnColorGift = red;
        } else if (randomGift >= 9 && randomGift <= 20) {
            drawnColorGift = pink;
        } else if (randomGift >= 21 && randomGift <= 50) {
            drawnColorGift = violet;
        } else {
            drawnColorGift = blue;
        }


        int randomItem = random.nextInt(boundItem) + 1; //bounds from 1 to 10

        if (drawnColorGift == 2) {
            GoldItems goldItems = new GoldItems(randomItem);
            System.out.println("In gold present you won item number " + goldItems.getNumber());
        } else if (drawnColorGift == 6) {
            RedItems redItems = new RedItems(randomItem);
            System.out.println("In red present you won item number " + redItems.getNumber());
        } else if (drawnColorGift == 12) {
            PinkItems pinkItems = new PinkItems(randomItem);
            System.out.println("In pink present you won item number " + pinkItems.getNumber());
        } else if (drawnColorGift == 30) {
            VioletItems violetItems = new VioletItems(randomItem);
            System.out.println("In violet present you won item number " + violetItems.getNumber());
        } else {
            BlueItems blueItems = new BlueItems(randomItem);
            System.out.println("In blue present you won item number " + blueItems.getNumber());
        }
    }
}