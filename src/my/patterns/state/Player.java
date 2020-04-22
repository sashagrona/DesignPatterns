package my.patterns.state;

import java.util.ArrayList;
import java.util.List;

public class Player {
    private State state;
    private boolean playing;
    private List<String> playlist;
    private int currentSong = 0;

    public Player() {
        this.state = new ReadyState(this);
        this.playing = true;
        this.playlist = new ArrayList<>();
        this.playlist.add("Stairway to Heaven");
        this.playlist.add("Nothing Else Matters");
        this.playlist.add("Snuff");
    }
    public String startPlaying(){
        return "Now playing: " + playlist.get(currentSong);
    }
    public String nextSong(){
        currentSong++;
        if (currentSong > playlist.size()-1){
            currentSong = 0;
        }
        return startPlaying();
    }

    public String previousSong(){
        currentSong--;
        if (currentSong < 0){
            currentSong = playlist.size() -1;
        }
        return startPlaying();
    }

    public State getState() {
        return state;
    }

    public void changeState(State state) {
        this.state = state;
    }

    public boolean isPlaying() {
        return playing;
    }

    public void setPlaying(boolean playing) {
        this.playing = playing;
    }
}
