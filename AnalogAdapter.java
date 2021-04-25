/**
 * @author Erica Flach
 * This class is the analog adapter which is the adaptor for CD
 */
public class AnalogAdapter implements AnalogAlbum{
    
    private DigitalAlbum album;

    /**
     * Thus method constructs the analog adapter
     * @param album
     */
    public AnalogAdapter(DigitalAlbum album) {
        this.album = album;
    }

    /**
     * This method plays the album
     * @return next song
     */
    public String play() {
        return album.nextSong();
    }

    /**
     * This method rewinds the album
     * @return previous song
     */
    public String rewind() {
        return album.prevSong();
    }

    /**
     * This method fast forwards the album
     * @return next song
     */
    public String ffwd() {
        return album.nextSong();
    }

    /**
     * This method pauses the album
     * @return pause
     */
    public String pause() {
        return album.pause();
    }

    /**
     * This method stops the album
     * @return stop
     */
    public String stopEject() {
        return album.stop();
    }
}
