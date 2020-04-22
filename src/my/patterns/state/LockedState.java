package my.patterns.state;

public class LockedState extends State {
    public LockedState(Player player) {
        super(player);
        player.setPlaying(false);
    }

    @Override
    public String onLock() {
        if (player.isPlaying()){
            player.changeState(new ReadyState(player));
            return "Stop playing";
        }
        return "Locked";
    }

    @Override
    public String onPlay() {
        player.changeState(new ReadyState(player));
        return "Ready";
    }

    @Override
    public String onNext() {
        return "Locked state";
    }

    @Override
    public String onPrevious() {
        return "Locked state";
    }
}
