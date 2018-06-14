

public class DvdPlayer {

    public DvdPlayer() {

    }

    public void on() {
    System.out.println("Dvd Player On");
    }

    public void off() {
        System.out.println("Dvd Player Off");
    }

    public void insert() {
       System.out.println("Inserted DvD");
    }

    public void eject() {
        System.out.println("Ejected DvD");
    }

    public void playpause() {
       boolean play=false;
       if(play) System.out.println("Paused");
       else System.out.println("DvdPlayer Playing");
       
    }

}