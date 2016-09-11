package leczner.jon.InitializationLab1;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by jonathanleczner on 9/10/16.
 */
public class ColorfulThingTest {
    protected ColorfulThing blueThing = new ColorfulThing(ColorfulThing.Color.BLUE);
    protected ColorfulThing redThing = new ColorfulThing(ColorfulThing.Color.RED);

    @Test
    public void getColorTest() {
        assertEquals(ColorfulThing.Color.BLUE, blueThing.getColor());
        assertFalse(blueThing.getColor() == ColorfulThing.Color.RED);
        assertEquals(ColorfulThing.Color.RED, redThing.getColor());
        assertFalse(redThing.getColor() == ColorfulThing.Color.BLUE);
    }

}
