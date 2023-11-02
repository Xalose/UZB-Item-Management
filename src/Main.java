import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        final String[] columnHeaders ={"Name","Type","Level","Rarity","Origin","Lore","Primary Stat 1","Primary Stat 2","Main Attack Damage","Raw Main Attack Damage","Spell Damage","Raw Spell Damage","Health Regen","Mana Regen","Walk Speed","Health","Attack Speed","Instinct","Resilience","Strength","Dexterity","Wisdom","Life Steal","Mana Steal","Spell Cost","Healing","Magic Cooldowns","Fortune","Travel Speed","Recovery","Travel Spell Cost","Bracing","Grace","Jump Height","Destroying","Traits","Base DPS","Melee DPS","Spell DPS"};
        Scanner itemRaw = new Scanner(new File("src/raw.txt"));
        Stack<String> propertyStack = new Stack<String>();
        ArrayList<Item> itemArray = new ArrayList<>();
        String currentLine = "";
        Item currentItem;
        int step=0;

        while (itemRaw.hasNextLine()){
            currentItem=itemArray.getLast();
            currentLine=itemRaw.nextLine();
            if (currentLine.isEmpty()){
                step++;
            } else {
                switch (step) {
                    case 1:
                        // item name
                        currentItem.setName(currentLine);
                        break;
                    case 2:
                        // item rarity
                        currentItem.setRarity(currentLine.substring(0,currentLine.indexOf(" ")));
                        currentLine = currentLine.substring(currentLine.indexOf(" "));
                        // item type
                        currentItem.setType(currentLine.substring(0,currentLine.indexOf(" ")));
                        currentLine = currentLine.substring(currentLine.indexOf("-"));
                        // item level
                        currentItem.setLevel(Integer.parseInt(currentLine.substring(9)));
                        break;
                    case 3:
                        // item origin
                        currentItem.setOrigin(currentLine);
                        break;
                    case 4:
                        // primary stat 1
                        currentItem.prim
                    case 6:
                        // item lore
                        if (currentItem.getLore().isEmpty()){
                            currentItem.setLore(currentLine);
                        } else {
                            currentItem.appendLore(currentLine);
                        }
                        break;
                    case 7:

                }
            }
        }
    }
}