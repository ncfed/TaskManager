package cmd;

import interfaces.Command;

public class EditTask implements Command {
    @Override
    public void Execute() {
        System.out.println("Editing the task");
    }
}
