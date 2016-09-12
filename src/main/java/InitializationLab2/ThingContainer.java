package InitializationLab2;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

/**
 * Created by abijah on 9/11/16.
 */
public class ThingContainer {

    public  ColorfulThing[] arrayOfColorfulThings;

    public ThingContainer(int arraySize ){

        arrayOfColorfulThings = new ColorfulThing[arraySize];

    }

    public void addColorfulThing(ColorfulThing color){

        for (int i =0 ; i < arrayOfColorfulThings.length; i++){
            if ( arrayOfColorfulThings[i]== null){
                arrayOfColorfulThings[i] = color;
                return;
            }


        }
        System.out.println("ThingContainer is full");



    }

    public ColorfulThing[] getArrayOfColorfulThings() {
        return arrayOfColorfulThings;
    }




    public void printThings(){

        System.out.println(Arrays.toString(this.getArrayOfColorfulThings()) );

    }

}
