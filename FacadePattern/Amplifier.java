
public class Amplifier {
 Speakers s;
 DvdPlayer d;
    public Amplifier() {
    	s=new Speakers();
    	d=new DvdPlayer();
    	
    }
    public void on() {
       System.out.println("Amplifier On");
       s.on();
       d.on();
    }

    public void off() {
       System.out.println("Amplifier Off");
       s.off();
       d.off();
    }

}