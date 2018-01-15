public class CDPlayer extends Component {

    public int capacity;

    public CDPlayer(int capacity){
        this.capacity = capacity;
    }


    public int getCapacity() {
        return this.capacity;
    }

    public String play(String cd) {
        return super.play(cd);
    }
}
