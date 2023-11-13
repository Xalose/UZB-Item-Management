import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        final String[] columnHeaders = {"Name","Type","Level","Rarity","Origin","Lore","Primary Stat 1","Primary Stat 2","Main Attack Damage","Raw Main Attack Damage","Spell Damage","Raw Spell Damage","Health Regen","Mana Regen","Walk Speed","Health","Attack Speed","Instinct","Resilience","Strength","Dexterity","Wisdom","Life Steal","Mana Steal","Spell Cost","Healing","Magic Cooldowns","Fortune","Travel Speed","Recovery","Travel Spell Cost","Bracing","Grace","Jump Height","Destroying","Traits","Base DPS","Melee DPS","Spell DPS"};
        final ArrayList<String> traits = new ArrayList<>(Arrays.asList(new String[]{"Ethereal", "Oracle's Fortitude", "Gravitomancy", "Thermal Restoration", "Decide", "Hearth's Healing", "Feather Falling", "Multishot", "Riptide", "Blessing of the Ocean", "Fire Resistance", "Divine Intervention", "Non-Dimensional", "Riftsinger", "Arcane Edge", "Soldier's Grip", "Aerodynamic", "Lightweight", "Harmonious Ring", "Void's Suppression", "Growth's Touch", "Spirit's Touch", "Spatiality's Touch", "Structure's Touch", "Temporality's Touch", "Gravitation's Touch", "Chaos' Touch", "Antithesis' Touch", "Entrophy's Touch", "Power's Touch", "Unity's Touch"}));
        Scanner input = new Scanner(new File("src/raw.txt"));
        FileWriter output = new FileWriter("src/output.csv");
        ArrayList<ArrayList<String>> itemRaw = new ArrayList<ArrayList<String>>();
        String currentLine;
        boolean prevLineEmpty = false;
        boolean endOfItem = true;

        while (input.hasNextLine()){
            currentLine = input.nextLine();
            if (endOfItem){
                itemRaw.add(new ArrayList<String>());
                endOfItem=false;
            }
            if (currentLine.isEmpty() && prevLineEmpty){
                endOfItem = true;
                prevLineEmpty=false;
            } else if (currentLine.isEmpty()){
                prevLineEmpty = true;
                itemRaw.getLast().add(currentLine);
            } else {
                prevLineEmpty = false;
                itemRaw.getLast().add(currentLine);
            }
        }

        /*
        for (ArrayList<String> strings : itemRaw) {
            System.out.println(Arrays.toString(strings.toArray()));
            System.out.println("-------------------------");
        }
        */

        for (ArrayList<String> currentItem : itemRaw) {
            System.out.println(currentItem.toString());

            int index = 0;  // 0 name
            String itemName = currentItem.get(index);

            index++;        //1 rarity type - level
            String itemRarity = currentItem.get(index).substring(0, currentItem.get(index).indexOf(" "));
            String itemType = currentItem.get(index).substring(currentItem.get(index).indexOf(" ") + 1, currentItem.get(index).indexOf("-") - 1);
            String itemLevel = currentItem.get(index).substring(currentItem.get(index).lastIndexOf(" ") + 1);

            index++;        //2 origin
            String itemOrigin = currentItem.get(index);

            index++;        //3 primary stat 1 (screw you uz booze)
            String itemPrimary1 = "";
            if (!currentItem.get(index).isEmpty()) {
                itemPrimary1 = currentItem.get(index);
            }

            index++;        //4 primary stat 2 (if any)
            String itemPrimary2 = "";
            if (!currentItem.get(index).isEmpty()) {
                itemPrimary2 = currentItem.get(index);
            }

            index++;        //5 trait (if any)
            String itemTrait = "";
            if (traits.contains(currentItem.get(index))){
                itemTrait = currentItem.get(index);
            }

            index++;        //6 bonus stats


            String itemLore = "";
            output.write(itemName + "," + itemType + "," + itemLevel + "," + itemRarity + "," + itemOrigin + "," + itemLore + "," + itemPrimary1+","+itemPrimary2+","+itemTrait);
            output.write("\n");
        }
        System.out.println(itemRaw.size());
        output.close();
    }
}