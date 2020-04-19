package my.patterns.command;

import java.io.*;
import java.util.Date;
import java.util.Stack;

public class UpdateCommand extends Command {

    public UpdateCommand(File file, Stack<Command> commands) {
        super(file, commands);
    }

    @Override
    public boolean execute() {

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file, true))) {
            bw.write("UPDATE " + new Date());
            bw.newLine();
            return true;
        } catch (IOException e) {
            e.printStackTrace();
        }

        return false;
    }
}
