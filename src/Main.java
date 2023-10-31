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
        int propertyCounter = 0;

        while (itemRaw.hasNextLine()){
            if(itemRaw.nextLine().isEmpty()){
                if(itemRaw.nextLine().isEmpty()){
                    itemArray.add(new Item());
                }
            }
        }
    }
}