/**
 * @author
 * This is the class for CD. a type of digital album
 */
import java.util.ArrayList;

public class CD implements DigitalAlbum{
    
    private ArrayList<String> songs;
    private int currentIndex;

    /**
     * This method constructs the CD
     * @param song1
     * @param song2
     * @param song3
     * @param song4
     * @param song5
     */
    public CD(String song1, String song2, String song3, String song4,
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
     * This method plays the CD from the beginning
     * @return song playing
     */
    public String playFromBeginning() {
        String ret = "";
        while(currentIndex < 5) {
            ret += "\nPlaying song " + currentIndex + ": " + songs.get(currentIndex);
            currentIndex++;
        }
        currentIndex = 0;
        return ret;
    }

    /**
     * This method plays the album from a certain point
     * @param index number
     * @return song playing
     */
    public String playSong(int num) {
        String ret = "";
        if(num < 0 || num > 5) {
            ret += "Not a valid song number";
        }
        currentIndex = num;
        while(currentIndex < 5) {
            ret += "\nPlaying: " + currentIndex + ": " + songs.get(currentIndex);
            currentIndex++;
        }
        return ret;
    }

    /**
     * This method plays the previous song
     * @return song playing
     */
    public String prevSong() {
        if(currentIndex == 0) {
            return "Skipping back and playing: " + songs.get(currentIndex);
        }
        currentIndex--;
        return "Skipping back and playing: " + songs.get(currentIndex);
    }

    /**
     * This method plays the next song
     * @return song playing
     */
    public String nextSong() {
        String ret = "";
        if(currentIndex == 5) {
            currentIndex = 0;
        }
        ret += "Playing: " + currentIndex + ": " + songs.get(currentIndex);
        currentIndex++;
        return ret;
    }

    /**
     * This method stops the CD
     * @return stopping
     */
    public String stop() {
        currentIndex = 1;
        return "Stopping CD";
    }

    /**
     * This method pauses the CD
     * @return pause
     */
    public String pause() {
        return "pausing";
    }
}
