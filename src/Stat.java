public class Stat {
    String name;
    int intValue;
    float percentValue;

    public Stat(String name, int intValue){
        this.name=name;
        this.intValue=intValue;
    }

    public Stat(String name, float percentValue){
        this.name=name;
        this.percentValue=percentValue;
    }
}
