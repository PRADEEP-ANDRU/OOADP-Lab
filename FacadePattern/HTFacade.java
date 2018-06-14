
public class HTFacade {

	Amplifier amp;
	DvdPlayer dvd;
	Lights lig;
	PopcornMaker pom;
	Screen scr;
	Projector pro;
	Speakers spe;
    public HTFacade(Amplifier amp,DvdPlayer dvd,Lights lig,PopcornMaker pom,Projector pro,
    		Screen scr,Speakers spe) {
    	this.amp=amp;
    	this.dvd=dvd;
    	this.lig=lig;
    	this.pom=pom;
    	this.pro=pro;
    	this.scr=scr;
    	this.spe=spe;
    	
    }

    public void watchMovie(String mov) {
        amp.on();
        dvd.insert();
        spe.setVolume(85);
        lig.on();
        lig.dim(40);
        scr.pulldown();
        pro.on();
        dvd.playpause();
        pom.on();
        pom.pop();
        System.out.println("Playing Movie: "+mov);
        
    }

    public void endMovie() {
    	 amp.off();
         dvd.eject();
         lig.off();
         scr.pullup();
         pro.off();
         pom.off();
    }

}