package rvt.todouzdevums.beidzotvecoizdariju;

import java.util.Scanner;

public class maintodo {
    public static void main(String[] args) {
        todoCSV list = new todoCSV();
        list.loadFromFile();
        Scanner scanner = new Scanner(System.in);
        todo2UIcsv UI = new todo2UIcsv(list, scanner);
        UI.start();
    }
}