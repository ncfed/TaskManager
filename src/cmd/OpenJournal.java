package cmd;

import interfaces.Command;

public class OpenJournal implements Command {
    @Override
    public void Execute() {
        System.out.println("Opening the journal");
    }
}
