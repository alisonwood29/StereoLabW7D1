import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RecordPlayerTest {

    RecordPlayer recordPlayer;

    @Before
    public void before() {
        recordPlayer = new RecordPlayer(5);
    }

    @Test
    public void recordPlayerHasSpeed(){
        assertEquals(5, recordPlayer.getSpeed());
    }

    @Test
    public void canPlay(){
        assertEquals("I'm playing this record", recordPlayer.play("this record"));
    }



}
