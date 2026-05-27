package rvt.todouzdevums.beidzotvecoizdariju;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class todoCSV {
    private ArrayList<String> todoList;
    private final String filePath = "src/main/java/rvt/todouzdevums/beidzotvecoizdariju/todo.csv";
    private final String valueRegex= "^[A-Za-z0-9 ]{3,}$";


    public todoCSV() {
        this.todoList = new ArrayList<>();
    }

    public void print() {
        for (int i = 0; i < todoList.size(); i++) {
            System.out.println(todoList.get(i).replace(",", " "));
        }
    }

    private void updateFile() {
        try (PrintWriter pw = new PrintWriter(new FileWriter(filePath, false))) {
            pw.println("id,task");
            for (int i = 0; i < todoList.size(); i++) {
                int index = i + 1;
                pw.println(index + "," + todoList.get(i));
            }
        }
        catch (IOException ioe) {
            System.out.println("Error: " + ioe);
        }
    }

    public void remove(int index) {
        todoList.remove(index - 1);
        updateFile();
    }

    public void loadFromFile() {
        String line;
        boolean isHeader = true;
        try {
            BufferedReader br = new BufferedReader(new FileReader(filePath));
            while ((line = br.readLine()) != null) {
                if (isHeader && line.equals("id,task")) {
                    isHeader = false;
                    continue;
                }
                
                if (!line.trim().isEmpty()) {
                    // Extract just the task part (everything after the comma and ID)
                    String[] parts = line.split(",", 2);
                    if (parts.length == 2) {
                        todoList.add(parts[1].trim());
                    } else {
                        todoList.add(line.trim());
                    }
                }
            }
            br.close();
        } catch (Exception e) {
           System.out.println(e);
        }
    }

    public int getLastID() {
        return todoList.size();        
    }
    
    public void add(String task) throws Exception {
        int id = getLastID() + 1;
        checkEventString(task);  // Validate BEFORE adding
        this.todoList.add(task);
        try (PrintWriter pw = new PrintWriter(new FileWriter(filePath, true))) {
            // Check if file is empty (first write), if so write header
            java.nio.file.Path path = java.nio.file.Paths.get(filePath);
            if (java.nio.file.Files.size(path) == 0) {
                pw.println("id,task");
            }
            pw.println(id + "," + task);
        }
        catch (IOException ioe) {
            System.out.println("Error: " + ioe);
        }
    }

    public boolean checkEventString(String value) throws Exception {
        if (value.matches(valueRegex)) {
            return true;
        } else {
            throw new Exception("Invalid format. Enter a normal task."); 
        }
    }
}