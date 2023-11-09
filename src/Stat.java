public class Stat {
    String name;
    int intValue;
    float percentValue;

    public Stat(int intValue, String name){
        this.intValue=intValue;
        this.name=name;
    }

    public Stat(float percentValue,String name){
        this.percentValue=percentValue;
        this.name=name;
    }
}
