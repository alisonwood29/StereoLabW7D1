public class Stereo {

    public String name;
    public Radio radio;
    public CDPlayer cdPlayer;
    public RecordPlayer recordPlayer;

    public Stereo(String name, Radio radio, CDPlayer cdPlayer, RecordPlayer recordPlayer){
        this.name = name;
        this.radio = radio;
        this.cdPlayer = cdPlayer;
        this.recordPlayer = recordPlayer;
    }

    public String getName() {
        return this.name;
    }

    public String tune(Radio radio) {
        return radio.tune();
    }
}
