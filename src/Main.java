import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        final String[] columnHeaders ={"Name","Type","Level","Rarity","Origin","Lore","Primary Stat 1","Primary Stat 2","Main Attack Damage","Raw Main Attack Damage","Spell Damage","Raw Spell Damage","Health Regen","Mana Regen","Walk Speed","Health","Attack Speed","Instinct","Resilience","Strength","Dexterity","Wisdom","Life Steal","Mana Steal","Spell Cost","Healing","Magic Cooldowns","Fortune","Travel Speed","Recovery","Travel Spell Cost","Bracing","Grace","Jump Height","Destroying","Traits","Base DPS","Melee DPS","Spell DPS"};
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
        for (int i=0;i<itemRaw.size();i++){
            System.out.println(Arrays.toString(itemRaw.get(i).toArray()));
            System.out.println("-------------------------");
        }
        */


    }
}