package cmd;

public class AddContact implements Command {
    @Override
    public void Execute() {
        System.out.println("Adding the contact");
    }
}
