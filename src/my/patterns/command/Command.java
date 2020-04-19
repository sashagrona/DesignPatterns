package my.patterns.command;

import java.io.File;
import java.util.Stack;

public abstract class Command {
    protected File file;
    protected Stack<Command> commands;

    public Command(File file) {
        this.file = file;
    }

    public Command(File file, Stack<Command> commands) {
        this.file = file;
        this.commands = commands;
    }

    public boolean executeWithHistory(){
        if (execute()){
            commands.push(this);
            return true;
        }
        return false;
    }

    public abstract boolean execute();
}
