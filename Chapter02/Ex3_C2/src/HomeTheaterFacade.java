public class HomeTheaterFacade {
    private TV tv;
    private SoundSystem ss;
    private DVDPlayer dvdp;
    private Lights l;

    public HomeTheaterFacade(TV tv, SoundSystem ss, DVDPlayer dvdp, Lights l) {
        this.tv = tv;
        this.ss = ss;
        this.dvdp = dvdp;
        this.l = l;
    }


    public void watchMovie(int number)
    {
            switch (number) {
                case 0:
                    tv.on();
                    break;

                case 1:
                    ss.on();
                    break;

                case 2:
                    dvdp.on();
                    break;

                case 4:
                    l.on();
                    break;
        }
    }
}
