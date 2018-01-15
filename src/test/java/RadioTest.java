import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RadioTest {

    Radio radio;

    @Before
    public void before(){
        radio = new Radio();
    }

    @Test
    public void canTune(){
        assertEquals("Tuned", radio.tune());
    }

    @Test
    public void canPlay(){
        assertEquals("I'm playing Radio 1", radio.play("Radio 1"));
    }
}
