/**
 * @author Erica Flach
 * This is the interface for a digital album
 */
public interface DigitalAlbum {
    
    public String playFromBeginning();
    public String playSong(int num);
    public String prevSong();
    public String nextSong();
    public String stop();
    public String pause();
}
