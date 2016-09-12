package InitializationLab2;

/**
 * Created by abijah on 9/11/16.
 */
public class InitializationLab2 {

    // main method begins program execution
    public static void main(String[] args) {

        ColorfulThing colorOne = new ColorfulThing(ColorfulThing.Color.RED); //invokes constructor
        // everytime you say new, that classes constructor gets called.
        //this is calling the colorfulThing enum ColorfulTHING.Color.color<==ie RED
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
        tc.pop();
        tc.printThings();
        tc.remove(ColorfulThing.Color.BLACK);
        tc.printThings();
        System.out.println("_______________________");

        ThingContainer tc2 = new ThingContainer(tc.getArrayOfColorfulThings());//created a new thing container that accepts an array from tc's getarrayofcolorfulthings method
        tc2.printThings();


    }// end Main



}//end class InitializationLab2
