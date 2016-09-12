package InitializationLab2;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

/**
 * Created by abijah on 9/11/16.
 */
public class ThingContainer {

    //instance variable for ThingContainer's colrfulthing array called arrayOfColorfulthings
    public  ColorfulThing[] arrayOfColorfulThings;

    // constructor with integer supplied as argument
    //provides data to the object of the class as you create it
    // we declare it public so that other classes can use it
    public ThingContainer(int arraySize ){

        arrayOfColorfulThings = new ColorfulThing[arraySize]; //creating a new  array called arrayOfColorfulThings
// that takes an integer of arraysize.
        //assigning the parameter value
    }

    public void addColorfulThing(ColorfulThing color) { //this the method

        for (int i = 0; i < arrayOfColorfulThings.length; i++) { // for loop runs through the array length

            if (arrayOfColorfulThings[i] == null) {
                arrayOfColorfulThings[i] = color;
                return;
            }


        }
        System.out.println("ThingContainer is full");
    }


public ColorfulThing pop (){  //ColorfulThing is the type. Pop will return a type of Colorfulthing.
    for (int i = arrayOfColorfulThings.length -1 ; i > 0; i-- ){//for loop starts at the last element in the array and decrements.
        if (arrayOfColorfulThings[i] != null ){// if statement to say if my  array of colorfulThings [postion] is not equal to null
            ColorfulThing toReturn = arrayOfColorfulThings[i];//creating a new type of colorfulthing called toRetun which is equal to the colorful thing in position i of my array
            arrayOfColorfulThings[i]= null; //then i want the position in the array of colorful things to be equal to null.

            return toReturn;
        }
        }
        return null; // if the array is empty then return null..
    }

public ColorfulThing remove (ColorfulThing.Color color){//New method for the colorfulThing type called removed, that takes the argument of an enum color
    for (int i = 0; i < arrayOfColorfulThings.length; i++ ){//for loop starts at zero and increments through the array of colorfulthings
        if(arrayOfColorfulThings[i].getColor() == color){//If the ColorfulThing type - arrayofColorfulThings position i which uses enum type getColor to get the color in that
            // position and compare it to the color entered int the argument.
            ColorfulThing Return = arrayOfColorfulThings[i];//creating a new type of ColorfulThing called Return which is equal to the colorful thing in position i of my array
            arrayOfColorfulThings[i]=null;//then i want the position in the array of colorful things to be equal to null.
            return Return;
            }

    }
        return null;// if it does not contain a ColorfulThing of that color
}

public ColorfulThing remove (ColorfulThing c1 ) {

    for (int i = 0; i < arrayOfColorfulThings.length; i++) {
        if (arrayOfColorfulThings[i] == c1) {
            ColorfulThing Return = arrayOfColorfulThings[i];
            arrayOfColorfulThings[i] = null;
            return Return;
        }
    }
    return null;
}
    public ColorfulThing[] getArrayOfColorfulThings() {

        return arrayOfColorfulThings;
    }




    public void printThings(){

        System.out.println(Arrays.toString(this.getArrayOfColorfulThings()) );

    }

}
