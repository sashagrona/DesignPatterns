package my.patterns.command;

import java.io.File;
import java.util.Stack;

public class DeleteCommand extends Command{

    public DeleteCommand(File file, Stack<Command> commands) {
        super(file, commands);
    }

    @Override
    public boolean execute() {
        return file.delete();
    }
}
