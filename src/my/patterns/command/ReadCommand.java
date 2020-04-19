package my.patterns.command;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Stack;

public class ReadCommand extends Command {

    public ReadCommand(File file, Stack<Command> commands) {
        super(file, commands);
    }

    @Override
    public boolean execute(){
        try(BufferedReader br = new BufferedReader(new FileReader(file))) {
            String s ="";
            while ((s = br.readLine()) != null){
                System.out.println(s);
            }
            return true;
        }catch (IOException e){
            e.printStackTrace();
        }
        return false;
    }
}
