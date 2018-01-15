public class Stereo {

    public String name;
    public Radio radio;
    public CDPlayer cdPlayer;
    public RecordPlayer recordPlayer;

    public Stereo(String name, Radio radio, CDPlayer cdPlayer, RecordPlayer recordPlayer){
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}
