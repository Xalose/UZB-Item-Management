public class Item {
    private String name;
    private String type;
    private String rarity;
    private int level;
    private String origin;
    private Stat[] primaryStats;
    private Stat[] bonusStats;
    private Stat[] utilityStats;
    private String trait;
    private String lore;

    public Item(){}
    public Item(String name, String type, String rarity, int level, String origin, Stat[] primaryStats, Stat[] bonusStats, Stat[] utilityStats, String trait, String lore){
        this.name=name;
        this.type=type;
        this.rarity=rarity;
        this.level=level;
        this.origin=origin;
        this.primaryStats=primaryStats;
        this.bonusStats=bonusStats;
        this.utilityStats=utilityStats;
        this.trait=trait;
        this.lore=lore;
    }
}
