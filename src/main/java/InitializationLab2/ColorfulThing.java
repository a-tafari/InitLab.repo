package InitializationLab2;

/**
 * Created by abijah on 9/11/16.
 */
public class ColorfulThing {


    private Color color;

    public ColorfulThing(Color color){
        this.color = color;
    }

    public Color getColor(){

        return color;

    }

    public enum Color {

        BLUE, GREEN, YELLOW , RED, BLACK, BROWN
    }

    @Override
    public String toString(){
        return color.toString();
    }
}


