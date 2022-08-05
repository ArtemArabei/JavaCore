package Lection_17.Java_Design_Patterns.Examples.Facade;

public class MediaFacade {
    private Tv tv;
    private AudioSystem audio;
    private DvdPlayer dvd;

    public MediaFacade(Tv tv, AudioSystem audio, DvdPlayer dvd) {
        this.tv = tv;
        this.audio = audio;
        this.dvd = dvd;
    }

    public void startWatching() {
        tv.powerOn();
        audio.powerOn();
        dvd.powerOn();
        dvd.connectToTv();
        dvd.startMovie();
    }

    public void stopWatching() {
        dvd.endMovie();
        dvd.powerOff();
        audio.powerOff();
        tv.powerOff();
    }
}
