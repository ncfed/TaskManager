package cmd;

import interfaces.Command;

public class DeleteTask implements Command {

    @Override
    public void Execute() {
        System.out.println("Deleting the task");
    }

}
