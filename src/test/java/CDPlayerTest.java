import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CDPlayerTest {

    CDPlayer cdPlayer;

    @Before
    public void before(){
        cdPlayer = new CDPlayer(6);
    }

    @Test
    public void cdPlayerHasCapacity(){
        assertEquals(6, cdPlayer.getCapacity());
    }

    @Test
    public void cdPlayerCanPlay(){
        assertEquals("I'm playing CD 1", cdPlayer.play("CD 1"));
    }



}
