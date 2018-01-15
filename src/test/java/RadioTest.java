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
        assertEquals("Tuned to Radio 1", radio.tune("Radio 1"));
    }

    @Test
    public void canPlay(){
        assertEquals("I'm playing Radio 1", radio.play("Radio 1"));
    }
}
