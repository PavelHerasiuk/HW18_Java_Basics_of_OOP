package by.epam.unit5.payment;

/*
 * 2. Создать объект класса Текстовый файл, используя классы Файл, Директория.
 * Методы: создать, переименовать, вывести на консоль содержимое, дополнить, удалить.
 */

public class Main {
    public static void main(String[] args) {
        Directory directory = new Directory("Java");
        String fileName = "Books on java.";
        TextFile tFile = new TextFile(directory, fileName);
        String line1 = "There are different books in this file.";
        tFile.addText(line1);

        System.out.println("Text file created: \"" + tFile.getFileName() + "\"");

        tFile.changeName("Books on java course one");
        System.out.println("The file name is changed to \"" + tFile.getFileName() + "\"");

        System.out.println("\nTest: print content.");
        tFile.printContent();

        System.out.println("\nTest: add content and print.");
        String line2 = "Also check out the latest Java SE9 edition.";
        tFile.addText(line2);
        tFile.printContent();

        System.out.println("\nTest: print the contents of a directory.");
        for (File file : directory.getFiles()) {
            System.out.println(file);
        }

        System.out.println("\nTest: create a new text file and print the contents of the directory.");
        File tFile2 = new TextFile(directory, "Java For Beginners");
        for (TextFile file : directory.getFiles()) {
            System.out.println(file);
        }

        System.out.println("\nTest: deleting a text file and print the contents of the directory.");
        directory.removeFile("Books on java course one");
        for (TextFile file : directory.getFiles()) {
            System.out.println(file);
        }
    }
}