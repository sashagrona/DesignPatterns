package my.patterns;

import my.patterns.command.*;

import java.io.File;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        Stack<Command> commands = new Stack<>();
        File file = new File("mine.txt");
        Command create = new CreateCommand(file, commands);
        Command update = new UpdateCommand(file, commands);
        Command read = new ReadCommand(file, commands);
        Command delete = new DeleteCommand(file, commands);
        create.executeWithHistory();
        update.executeWithHistory();
        read.executeWithHistory();
        update.executeWithHistory();
        read.executeWithHistory();
        delete.executeWithHistory();
        System.out.println(commands.size());
    }
}
