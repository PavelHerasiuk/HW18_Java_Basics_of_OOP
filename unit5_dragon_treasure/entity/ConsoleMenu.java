package by.epam.unit5.entity;


import by.epam.unit5.action.ConsoleMenuAction;

public class ConsoleMenu {
    private ConsoleMenuAction consoleMenuAction = new ConsoleMenuAction();

    public void startConsoleMenu(){
        int choice;
        boolean isStopped = false;
        consoleMenuAction.printOptions();
        while (!isStopped) {
            System.out.println("Please enter the number of the operation. \nYour choice: ");
            choice = consoleMenuAction.makeChoice();
            isStopped = consoleMenuAction.processingOperation(choice);
        }
    }
}