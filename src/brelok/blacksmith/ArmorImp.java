package brelok.blacksmith;

import java.util.List;

public class ArmorImp implements Armor {

    private String name;
    private List <Enchant> enchants;

    public ArmorImp(String name, List<Enchant> enchants) {
        this.name = name;
        this.enchants = enchants;
    }

    public ArmorImp() {
    }

    public String getName() {
        return name;
    }

    public List<Enchant> getEnchants() {
        return enchants;
    }

    public void setEnchants(List<Enchant> enchants) {
        this.enchants = enchants;
    }

    @Override
    public void destroy() {

    }
}
