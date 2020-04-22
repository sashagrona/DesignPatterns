package my.patterns.state;

public class PlayState extends State {
    public PlayState(Player player) {
        super(player);
    }

    @Override
    public String onLock() {
        player.changeState(new LockedState(player));
        return "Stop playing";
    }

    @Override
    public String onPlay() {
        player.changeState(new ReadyState(player));
        return "Paused";
    }

    @Override
    public String onNext() {
        return player.nextSong();
    }

    @Override
    public String onPrevious() {
        return player.previousSong();
    }
}
