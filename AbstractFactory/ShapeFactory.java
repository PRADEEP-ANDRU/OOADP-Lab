
import java.util.*;

/**
 * 
 */
public class ShapeFactory extends AbstractFactory {

    /**
     * 
     */
    public Shape getShape(String s) {
        // TODO implement here
    	if(s.equalsIgnoreCase("Circle")) {
    		return new Circle();
    	}
    	else if(s.equalsIgnoreCase("Square")) {
    		return new Square();
    	}
		return null;
    }

	public Color getColor(String c) {
		return null;
	}

}