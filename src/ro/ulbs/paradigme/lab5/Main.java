package ro.ulbs.paradigme.lab5;

import java.io.*;

public class Main {

    public static void main(String[] args) {
        String inputFile = "src/ro/ulbs/paradigme/lab5/in.txt";
        String outputFile = "src/ro/ulbs/paradigme/lab5/out.txt";

        StringBuilder modifiedTextA = new StringBuilder();
        StringBuilder modifiedTextB = new StringBuilder();
        String line;


        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile))) {
            while ((line = reader.readLine()) != null) {
                modifiedTextA.append(line).append("\n");
            }
        } catch (IOException e) {
            System.err.println("Eroare la citirea fisierului (a): " + e.getMessage());
        }

        System.out.println("Rezultatul dupa a):");
        System.out.println(modifiedTextA);

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile))) {
            while ((line = reader.readLine()) != null) {
                String modifiedLine = line.replace(".", ".\n");
                modifiedTextB.append(modifiedLine).append("\n");
            }
        } catch (IOException e) {
            System.err.println("Eroare la citirea fisierului (b): " + e.getMessage());
        }

        System.out.println("Rezultatul dupa b):");
        System.out.println(modifiedTextB);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {
            writer.write("Rezultat a):\n");
            writer.write(modifiedTextA.toString());
            writer.write("\nRezultat b):\n");
            writer.write(modifiedTextB.toString());
        } catch (IOException e) {
            System.err.println("Eroare la scrierea in fisierul out.txt: " + e.getMessage());
        }
    }
}
