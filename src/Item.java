public class Item {
    private String name;
    private String type;
    private String rarity;
    private int level;
    private String origin;
    private Stat[] primaryStats;
    private int primaryLast;
    private Stat[] bonusStats;
    private int bonusLast;
    private Stat[] utilityStats;
    private int utilityLast;
    private String trait;
    private String lore;

    public Item(){
        primaryStats=new Stat[2];
        bonusStats=new Stat[8];
        utilityStats=new Stat[5];
    }
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

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public String getRarity() {
        return rarity;
    }

    public int getLevel() {
        return level;
    }

    public String getOrigin() {
        return origin;
    }

    public Stat[] getPrimaryStats() {
        return primaryStats;
    }

    public Stat[] getBonusStats() {
        return bonusStats;
    }

    public Stat[] getUtilityStats() {
        return utilityStats;
    }

    public String getTrait() {
        return trait;
    }

    public String getLore() {
        return lore;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setRarity(String rarity) {
        this.rarity = rarity;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public void setPrimaryStats(Stat[] primaryStats) {
        this.primaryStats = primaryStats;
    }

    public void setBonusStats(Stat[] bonusStats) {
        this.bonusStats = bonusStats;
    }

    public void setUtilityStats(Stat[] utilityStats) {
        this.utilityStats = utilityStats;
    }

    public void setTrait(String trait) {
        this.trait = trait;
    }

    public void setLore(String lore) {
        this.lore = lore;
    }

    public void insertPrimaryStats(int intValue, String name){
        primaryStats[primaryLast] = new Stat(intValue,name);
        primaryLast++;
    }

    public void insertPrimaryStats(float floatValue, String name){
        primaryStats[primaryLast] = new Stat(floatValue,name);
        primaryLast++;
    }

    public void insertBonusStats(int intValue, String name){
        bonusStats[bonusLast] = new Stat(intValue,name);
        bonusLast++;
    }

    public void insertBonusStats( float floatValue, String name){
        bonusStats[bonusLast] = new Stat(floatValue, name);
        bonusLast++;
    }

    public void insertUtilityStats(int intValue, String name){
        utilityStats[utilityLast] = new Stat(intValue,name);
        utilityLast++;
    }

    public void insertUtilityStats(float floatValue, String name){
        utilityStats[utilityLast] = new Stat(floatValue, name);
        utilityLast++;
    }

    public void appendLore(String lore){
        this.lore=this.lore+lore;
    }
}
