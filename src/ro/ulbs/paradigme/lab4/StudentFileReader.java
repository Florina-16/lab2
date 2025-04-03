package ro.ulbs.paradigme.lab4;

import java.io.*;
import java.util.*;

public class StudentFileReader {
    public static void main(String[] args) {
        String fileName="input.txt";
        Map<Student, Integer> studentsCount = new HashMap<>();

        try (BufferedReader br= new BufferedReader(new FileReader(fileName))){
            String line;
            while ((line=br.readLine())!=null){
                String[] parts = line.split(" ");
                String nume=parts[0]+" "+parts[1];
                String grupa=parts[2];
                int[] note= Arrays.stream(Arrays.copyOfRange(parts, 3, parts.length)).mapToInt(Integer::parseInt).toArray();

                Student student = new Student(nume, grupa, note);
                studentsCount.put(student, studentsCount.getOrDefault(student, 0) + 1);
            }
        }  catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Apariții studenți:");
        StudentCount.forEach((student, count) -> System.out.println(student + " - Apare de " + count + " ori"));
    }
}
