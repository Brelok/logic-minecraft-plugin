package brelok.blacksmith;

public class Enchant {

    private String enchant;

    public String getEnchant() {
        return enchant;
    }

    public Enchant(String enchant) {
        this.enchant = enchant;
    }

    @Override
    public String toString() {
        return enchant;
    }
}
