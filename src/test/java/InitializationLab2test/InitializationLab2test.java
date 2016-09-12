package InitializationLab2test;

import InitializationLab2.ColorfulThing;
import InitializationLab2.ThingContainer;
import org.junit.Test;
import static org.junit.Assert.*;

import static org.junit.Assert.assertSame;

/**
 * Created by abijah on 9/11/16.
 */
public class InitializationLab2test {


    @Test
    public void  addColorThingTest () {
        ThingContainer containTest = new ThingContainer(1);
        ColorfulThing c1 = new ColorfulThing(ColorfulThing.Color.BLUE);
        ColorfulThing c2 = new ColorfulThing(ColorfulThing.Color.RED);
        containTest.addColorfulThing(c1);
        assertEquals("Value should be blue", c2, containTest.arrayOfColorfulThings[0]);

    }


}




