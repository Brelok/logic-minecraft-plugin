package brelok.blacksmith;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Blacksmith {

    public static void main(String[] args) {
        Blacksmith blacksmith = new Blacksmith();

        Enchant enchantFirst = new Enchant("ProtectionIII");
        Enchant enchantSecond = new Enchant("UnbreakingI");
        List<Enchant> enchants = new ArrayList<>();
        enchants.add(enchantFirst);
        enchants.add(enchantSecond);

        ArmorImp armorImp = new ArmorImp("Good armor", enchants);

        blacksmith.unbreakingII(armorImp);

    }

    public void unbreakingII(ArmorImp armorImp) {

        List<Enchant> enchants = armorImp.getEnchants();

        Random random = new Random();
        int randomNumber = random.nextInt(100) + 1;

        if ((randomNumber >= 1) && (randomNumber <= 80)) {
            if (checkEnchants(enchants)) {

                Enchant enchant = new Enchant("UnbreakingII");
                enchants.add(enchant);
                armorImp.setEnchants(enchants);
                System.out.println(armorImp.getName() + " has new enchant: " + enchant.getEnchant());
            }
        } else {
            armorImp.destroy();
            System.out.println(armorImp.getName() + " has destroyed");
        }
    }

    public boolean checkEnchants(List<Enchant> enchants) {
        return enchants.toString().contains("UnbreakingI") && enchants.toString().contains("ProtectionIII");
    }
}


