
import java.util.*;

/**
 * 
 */
public class FactoryProducer {


    public static AbstractFactory getFactory(String f) {
        // TODO implement here
    	if(f.equalsIgnoreCase("SHAPE")) {
    		return new ShapeFactory();
    	}
    	else if(f.equalsIgnoreCase("COLOR")) {
    			return new ColorFactory();
    		}
		return null;
    }

}