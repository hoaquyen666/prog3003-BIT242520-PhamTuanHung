import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        TV tv = new TV();
        SoundSystem soundSystem = new SoundSystem();
        DVDPlayer dvd = new DVDPlayer();
        Lights lights = new Lights();

        HomeTheaterFacade homeTheater = new HomeTheaterFacade(tv, soundSystem, dvd, lights);
        homeTheater.watchMovie(scanner.nextInt());
    }
}
