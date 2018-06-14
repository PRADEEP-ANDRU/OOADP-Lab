
public class Client {

    public static void main(String[] args) {
    	Amplifier amp =new Amplifier();
    	DvdPlayer dvd =new DvdPlayer();
    	Lights lig=new Lights();
    	PopcornMaker pom=new PopcornMaker();
    	Screen scr=new Screen();
    	Projector pro=new Projector();
    	Speakers spe=new Speakers();
    	HTFacade htf=new HTFacade(amp,dvd,lig,pom,pro,scr,spe);
    	htf.watchMovie("Fanaa");
    	//htf.endMovie();	
    }

}