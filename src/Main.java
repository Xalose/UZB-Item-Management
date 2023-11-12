import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        final String[] columnHeaders ={"Name","Type","Level","Rarity","Origin","Lore","Primary Stat 1","Primary Stat 2","Main Attack Damage","Raw Main Attack Damage","Spell Damage","Raw Spell Damage","Health Regen","Mana Regen","Walk Speed","Health","Attack Speed","Instinct","Resilience","Strength","Dexterity","Wisdom","Life Steal","Mana Steal","Spell Cost","Healing","Magic Cooldowns","Fortune","Travel Speed","Recovery","Travel Spell Cost","Bracing","Grace","Jump Height","Destroying","Traits","Base DPS","Melee DPS","Spell DPS"};
        Scanner itemRaw = new Scanner(new File("src/raw.txt"));
        String currentLine;
        Item currentItem;
        boolean prevLineEmpty = false;
        boolean endOfItem = true;

        ArrayList<ArrayList<String>> itemArray = new ArrayList<ArrayList<String>>();

        while (itemRaw.hasNextLine()){
            currentLine = itemRaw.nextLine();
            if (endOfItem){
                itemArray.add(new ArrayList<String>());
                endOfItem=false;
            }
            if (currentLine.isEmpty() && prevLineEmpty){
                endOfItem = true;
                prevLineEmpty=false;
            } else if (currentLine.isEmpty()){
                prevLineEmpty = true;
            } else {
                prevLineEmpty = false;
                itemArray.getLast().add(currentLine);
            }
        }

        
    }
}