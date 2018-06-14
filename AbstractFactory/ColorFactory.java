
import java.util.*;

/**
 * 
 */
public class ColorFactory extends AbstractFactory {

    
    public Color getColor(String c) {
        // TODO implement here
    	if(c.equalsIgnoreCase("Red")) {
    		return new Red();
    	}
    	else if(c.equalsIgnoreCase("Green")) {
    		return new Green();
    	}
    	return null;
    }

	public Shape getShape(String s) {
		return null;
		// TODO Auto-generated method stub
		
	}

}