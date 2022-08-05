package Lection_17.Java_Design_Patterns.Examples.Facade;

public class MediaFacadeDemo {
    public static void main(String... args) {
        Tv tv = new Tv();
        AudioSystem audio = new AudioSystem();
        DvdPlayer dvd = new DvdPlayer();
        MediaFacade facade = new MediaFacade(tv, audio, dvd);
        System.out.println("�������� ��������:");
        facade.startWatching();
        System.out.println("\n����������� ��������:");
        facade.stopWatching();
    }
}
