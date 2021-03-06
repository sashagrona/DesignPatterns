package my.patterns.state;

public class ReadyState extends State {
    public ReadyState(Player player) {
        super(player);
    }

    @Override
    public String onLock() {
        player.changeState(new LockedState(player));
        return "Locked";
    }

    @Override
    public String onPlay() {
        player.changeState(new PlayState(player));
        return null;
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
