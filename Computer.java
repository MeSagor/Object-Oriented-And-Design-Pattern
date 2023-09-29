public class Computer implements Music, Video{
    @Override
    public void playMusic() {
        System.out.println("Play a Music");
    }

    @Override
    public void playVideo() {
        System.out.println("Sum the two numbers");
    }

    @Override
    public void deleteMedia() {
        System.out.println("Delete the media");
    }
}
