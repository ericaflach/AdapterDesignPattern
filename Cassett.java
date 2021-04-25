/**
 * @author Erica Flach
 * This is the class for cassett, a type of analog album
 */
import java.util.ArrayList;

public class Cassett implements AnalogAlbum{
    
    private ArrayList<String> songs;
    private int currentIndex;

    /**
     * This method constructs the Cassett
     * @param song1
     * @param song2
     * @param song3
     * @param song4
     * @param song5
     */
    public Cassett(String song1, String song2, String song3, String song4,
    String song5) {
        currentIndex = 0;
        songs = new ArrayList<>();
        songs.add(song1);
        songs.add(song2);
        songs.add(song3);
        songs.add(song4);
        songs.add(song5);
    }

    /**
     * This method plays the cassett tape
     * @return song playing
     */
    public String play() {
        String ret = "";
        if(currentIndex < 5) {
            ret += "Playing song " + currentIndex + ": " + songs.get(currentIndex);
            currentIndex++;
        }
        else {
            ret +="At the end of the cassett you need to rewind";
        }
        return ret;
    }

    /**
     * This method rewinds the cassett tape
     * @return rewinding to ...
     */
    public String rewind() {
        if (currentIndex == 1) {
            return "Fully Re-wound";
        }

        currentIndex--;
        return "Rewinding to song " + currentIndex;
    }

    /**
     * This method fast forwards the cassett tape
     * @return fast forwarded to ...
     */
    public String ffwd() {
        currentIndex++;

        if (currentIndex == 5) {
            return "Fowarded to the end of the cassett";
        }
        else if (currentIndex == 6) {
            return "At the end of the cassett you need to rewind";
        }

        return "Forwarding to song " + currentIndex;
    }

    /**
     * This method pauses the cassett
     * @return pausing
     */
    public String pause() {
        return "Pausing " + currentIndex;
    }

    /**
     * This method stops and ejects the cassett
     * @return stopping and ejecting the casett
     */
    public String stopEject() {
        return "Stopping cassett and ejecting";
    }
}
