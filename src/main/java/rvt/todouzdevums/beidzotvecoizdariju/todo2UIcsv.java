package rvt.todouzdevums.beidzotvecoizdariju;


import java.util.Scanner;

public class todo2UIcsv {
    private todoCSV list;
    private Scanner scanner;

    public todo2UIcsv(todoCSV theList, Scanner theScanner) {
        list = theList;
        scanner = theScanner;
    }

    public void start() {
        while (true) {
            System.out.println("Command:");
            System.out.println("stop\nlist\nadd\nremove");
            String command = scanner.nextLine();
            if (command.equals("stop")) {
                break;
            } else if (command.equals("list")) {
                list.print();
                continue;
            } else if (command.equals("add")) {
                System.out.print("To add: ");
                String item = scanner.nextLine();
                try {
                    list.add(item);
                } catch (Exception e) {
                    System.out.println("Error: " + e.getMessage());
                }
                continue;
            } else if (command.equals("remove")) {
                System.out.print("Which one is removed? ");
                int item = Integer.valueOf(scanner.nextLine());
                list.remove(item);
                continue;
            }
        }
    }
}
