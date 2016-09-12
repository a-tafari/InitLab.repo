package InitializationLab2;

/**
 * Created by abijah on 9/11/16.
 */
public class InitializationLab2 {
    public static void main(String[] args) {

        ColorfulThing colorOne = new ColorfulThing(ColorfulThing.Color.RED);
        ColorfulThing colorTwo = new ColorfulThing(ColorfulThing.Color.BLUE);
        ColorfulThing colorThree = new ColorfulThing(ColorfulThing.Color.YELLOW);
        ColorfulThing colorFour = new ColorfulThing(ColorfulThing.Color.GREEN);
        ColorfulThing colorFive = new ColorfulThing(ColorfulThing.Color.BLACK);
        ColorfulThing colorSix = new ColorfulThing(ColorfulThing.Color.BROWN);




        ThingContainer tc = new ThingContainer(6);
        tc.addColorfulThing(colorOne);
        tc.addColorfulThing(colorTwo);
        tc.addColorfulThing(colorThree);
        tc.addColorfulThing(colorFour);
        tc.addColorfulThing(colorFive);
        tc.addColorfulThing(colorSix);
        tc.printThings();
    }



}
