import cmd.*;

import java.util.Scanner;

public class UserInterface {

    Boolean cmd_ok = false;
    String str_menu = "1 - Open task journal\n" + "2 - Save task journal\n" + "3 - Show scheduler\n" +
            "4 - Add task\n" + "5 - Edit task\n" + "6 - Delete task\n" + "7 - Add contact\n" +
            "8 - Delete contact\n" + "9 - Exit\n\n" + "Please, choose the action (1-9): ";
    String input = "";

    public void ShowMenu() {
        System.out.print(str_menu);
    }

    public void ReadCommand() {
        Scanner scanner = new Scanner(System.in);
        do {
            input = scanner.nextLine();
            switch (input) {
                case "1":
                    cmd_ok = true;
                    OpenJournal cmd_OpenJournal = new OpenJournal();
                    cmd_OpenJournal.Execute();
                    break;
                case "2":
                    cmd_ok = true;
                    SaveJournal cmd_SaveJournal = new SaveJournal();
                    cmd_SaveJournal.Execute();
                    break;
                case "3":
                    cmd_ok = true;
                    ShowSheduler cmd_ShowSheduler = new ShowSheduler();
                    cmd_ShowSheduler.Execute();
                    break;
                case "4":
                    cmd_ok = true;
                    AddTask cmd_AddTask = new AddTask();
                    cmd_AddTask.Execute();
                    break;
                case "5":
                    cmd_ok = true;
                    EditTask cmd_EditTask = new EditTask();
                    cmd_EditTask.Execute();
                    break;
                case "6":
                    cmd_ok = true;
                    DeleteTask cmd_DeleteTask = new DeleteTask();
                    cmd_DeleteTask.Execute();
                    break;
                case "7":
                    cmd_ok = true;
                    AddContact cmd_AddContact = new AddContact();
                    cmd_AddContact.Execute();
                    break;
                case "8":
                    cmd_ok = true;
                    DeleteContact cmd_DeleteContact = new DeleteContact();
                    cmd_DeleteContact.Execute();
                    break;
                case "9":
                    cmd_ok = true;
                    Exit cmd_Exit = new Exit();
                    cmd_Exit.Execute();
                    break;
                default:
                    System.out.print("Illegal command. Please, try again (1-9): ");
                    cmd_ok = false;
                    break;
            }
        } while (!cmd_ok);
    }
}
