package cmd;

import interfaces.Command;
import journal.*;

public class ShowSheduler implements Command {


    @Override
    public void Execute() {
        System.out.println("Showing the sheduler");

    }

}
