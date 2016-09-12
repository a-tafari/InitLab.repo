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
    public void addColorThingTest() {
        ThingContainer containTest = new ThingContainer(1);
        ColorfulThing c1 = new ColorfulThing(ColorfulThing.Color.BLUE);
        ColorfulThing c2 = new ColorfulThing(ColorfulThing.Color.RED);
        containTest.addColorfulThing(c1);
        assertEquals("Value should be blue", c2, containTest.arrayOfColorfulThings[0]);

    }

    @Test
    public void removeTest() {//searches and removes the enum color
        ThingContainer removeTest = new ThingContainer(5);
        ColorfulThing c1 = new ColorfulThing(ColorfulThing.Color.BLUE);
        ColorfulThing c2 = new ColorfulThing(ColorfulThing.Color.RED);
        removeTest.addColorfulThing(c1);
        removeTest.addColorfulThing(c2);

        assertEquals("the value removed should be blue", c1, removeTest.remove(ColorfulThing.Color.BLUE));


    }

    @Test
    public void removeO() {//searches and removes the object c1
        ThingContainer removeO = new ThingContainer(5);
        ColorfulThing c1 = new ColorfulThing(ColorfulThing.Color.BLACK);
        ColorfulThing c2 = new ColorfulThing(ColorfulThing.Color.RED);
        removeO.addColorfulThing(c1);
        removeO.addColorfulThing(c2);

        assertEquals("the value removed should be black", c1, removeO.remove(c1));


    }
}





