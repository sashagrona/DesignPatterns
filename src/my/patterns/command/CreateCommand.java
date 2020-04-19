package my.patterns.command;

import java.io.File;
import java.io.IOException;
import java.util.Stack;

public class CreateCommand extends Command {

    public CreateCommand(File file, Stack<Command> commands) {
        super(file, commands);
    }

    @Override
    public boolean execute(){
        try {
            return file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }
}
