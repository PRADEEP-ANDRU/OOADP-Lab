
import java.util.*;

/**
 * 
 */
public class Client {

    public static void main(String[] args) {
    	AbstractFactory s=FactoryProducer.getFactory("SHAPE");
    	Shape c=s.getShape("Circle");
    	c.draw();
    	Shape sq=s.getShape("Square");
    	sq.draw();
    	AbstractFactory co=FactoryProducer.getFactory("Color");
    	Color r=co.getColor("Red");
    	r.fill();
    	Color g=co.getColor("Green");
    	g.fill();
    }

}