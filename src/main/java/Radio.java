public class Radio extends Component{

    public String tune(String channel) {
        return "Tuned to " + channel;
    }

    public String play(String channel){
        return super.play(channel);
    }
}
