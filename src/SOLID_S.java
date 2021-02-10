/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author siraphat
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.*;

class Journal {

    private ArrayList<String> entries = new ArrayList<>();
    private static int count = 0;

    public void addEntry(String text) {
        entries.add((++count) + " : " + text);
    }

    public void removeEntry(int index) {
        entries.remove(index);
    }

    @Override
    public String toString() {
        return String.join(System.lineSeparator(), entries);
    }

    public void saveToFile(String filename, boolean overwrite) throws FileNotFoundException {
        if (overwrite || new File(filename).exists()) {
            try (PrintStream out = new PrintStream(filename)) {
                out.println(toString());
            }
        }
    }

}

class Persistence {

    public void saveToFile(Journal journal,
            String filename,
            boolean overwrite) throws FileNotFoundException {
        if (overwrite || new File(filename).exists()) {
            try (PrintStream out = new PrintStream(filename)) {
                out.println(journal.toString());
            }
        }
    }
}

public class SOLID_S {

    public static void main(String[] args) throws Exception {
        Journal j = new Journal();
        j.addEntry("I'm lying");
        j.addEntry("I'm sleepy");
        System.out.println(j);

        Persistence p = new Persistence();
        String filename = "journal.txt";
        p.saveToFile(j, filename, true);
        Runtime.getRuntime().exec("notepad.exe " + filename);
    }
}
