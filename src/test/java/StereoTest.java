import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StereoTest {

    Stereo stereo;
    Radio radio;
    CDPlayer cdPlayer;
    RecordPlayer recordPlayer;

    @Before
    public void before(){
        stereo = new Stereo("Boom Blaster", radio, cdPlayer, recordPlayer );
    }

    @Test
    public void stereoHasName(){
        assertEquals("Boom Blaster", stereo.getName());
    }
}
