import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        final String[] columnHeaders = {"Name","Type","Level","Rarity","Origin","Lore","Primary Stat 1","Primary Stat 2","Main Attack Damage","Raw Main Attack Damage","Spell Damage","Raw Spell Damage","Health Regen","Mana Regen","Walk Speed","Health","Attack Speed","Instinct","Resilience","Strength","Dexterity","Wisdom","Life Steal","Mana Steal","Spell Cost","Healing","Magic Cooldowns","Fortune","Travel Speed","Recovery","Travel Spell Cost","Bracing","Grace","Jump Height","Destroying","Traits","Base DPS","Melee DPS","Spell DPS"};
        final ArrayList<String> traits = new ArrayList<>(Arrays.asList(new String[]{"Ethereal", "Oracle's Fortitude", "Gravitomancy", "Thermal Restoration", "Decide", "Hearth's Healing", "Feather Falling", "Multishot", "Riptide", "Blessing of the Ocean", "Fire Resistance", "Divine Intervention", "Non-Dimensional", "Riftsinger", "Arcane Edge", "Soldier's Grip", "Aerodynamic", "Lightweight", "Harmonious Ring", "Void's Suppression", "Growth's Touch", "Spirit's Touch", "Spatiality's Touch", "Structure's Touch", "Temporality's Touch", "Gravitation's Touch", "Chaos' Touch", "Antithesis' Touch", "Entrophy's Touch", "Power's Touch", "Unity's Touch"}));

        Scanner readRaw = new Scanner(new File("src/raw.txt"));
        ArrayList<ArrayList<String>> itemRaw = new ArrayList<>();
        ArrayList<HashMap<String, String>> items = new ArrayList<>();
        itemRaw.add(new ArrayList<>());

        while (readRaw.hasNextLine()) {
            String currentLine = readRaw.nextLine();
            if (currentLine.equals("[END]")) {
                itemRaw.add(new ArrayList<>());
            } else {
                itemRaw.getLast().add(currentLine);
            }
        }

        for (ArrayList<String> currentItem : itemRaw) {
            items.add(new HashMap<>());
            for (String currentLine : currentItem) {
                if (currentLine.split(" ")[0].matches(".*\\d+.*")) {
                    String[] attribute = currentLine.split(" ", 2);
                    items.getLast().put(attribute[1], attribute[0]);
                } else if (currentLine.matches(".*\\d+.*") && currentLine.contains("-")) {
                    currentLine = currentLine.replace(" - Level", "");
                    String[] info = currentLine.split(" ");
                    items.getLast().put("Rarity", info[0]);
                    items.getLast().put("Type", info[1]);
                    items.getLast().put("Level", info[2]);
                } else {
                    System.out.println(currentLine);
                }
            }
        }
    }
}