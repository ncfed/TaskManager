package cmd;

import interfaces.Command;

public class DeleteContact implements Command {
    @Override
    public void Execute() {
        System.out.println("Deleting the contact");
    }
}
