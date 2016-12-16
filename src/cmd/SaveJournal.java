package cmd;

public class SaveJournal implements Command {
    @Override
    public void Execute() {
        System.out.println("Saving the journal");
    }
}
