package rvt.studentregsistem;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class student_reg_output {

    private final String path = "src/main/java/rvt/studentregsistem/regdata.csv";


    public void printTable(String[] args) throws IOException {

        List<String> lines = Files.readAllLines(Paths.get(path));

        List<String[]> rows = new ArrayList<>();

        for (String line : lines) {

            rows.add(line.split(","));

        }

        if (rows.isEmpty()) return;

        int columnCount = rows.get(0).length;
        int[] columnWidths = new int[columnCount];


        for (String[] row : rows) {
            for (int i = 0; i < columnCount; i++) {

                columnWidths[i] = Math.max(columnWidths[i], row[i].trim().length());
                
            }
        }

        printBorder(columnWidths);

        for (int i = 0; i < rows.size(); i++) {
            printRow(rows.get(i), columnWidths);

            if (i == 0) {
                printBorder(columnWidths);
            }
        }

        printBorder(columnWidths);
    }

    private void printBorder(int[] widths) {

        System.out.print("+");
        for (int width : widths) {
            System.out.print("-".repeat(width + 2) + "+");

        }
        System.out.println();
    }

    private void printRow(String[] row, int[] widths) {

        System.out.print("|");
        for (int i = 0; i < widths.length; i++) {
            System.out.print(" " + padRight(row[i].trim(), widths[i]) + " |");

        }
        System.out.println();
    }

    private String padRight(String text, int length) {

        return String.format("%-" + length + "s", text);

    }
}