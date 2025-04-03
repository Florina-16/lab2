package ro.ulbs.paradigme.lab4;

import java.util.*;

public class StudentOperations {
    public static void main(String[] args) {
        Random random=new Random();

        List<Student> studenti = new ArrayList<>();
        studenti.add(new Student("Ion Popescu", "223_1", randomNotes()));
        studenti.add(new Student("Maria Popa", "223_2", randomNotes()));
        studenti.add(new Student("Diana Oprea", "223_2", randomNotes()));
        studenti.add(new Student("Elena Dragomir", "223_3", randomNotes()));

        studenti.sort(Comparator.comparing(Student::getGrupa).thenComparing(Student::getNume));
        System.out.println("Sortare alfabetică pe grupe:");
        studenti.forEach(System.out::println);

        List<Student> integraliști = studenti.stream().filter(s -> s.getRestante() == 0).toList();
        integraliști.sort((s1, s2) -> Double.compare(s2.getMedie(), s1.getMedie()));
        System.out.println("\nIntegraliști ordonați descrescător după medie:");
        integraliști.forEach(System.out::println);

        List<Student> restantieri = studenti.stream().filter(s -> s.getRestante() > 0).toList();
        restantieri.sort(Comparator.comparingInt(Student::getRestante));
        System.out.println("\nRestanțieri ordonați după numărul de restanțe:");
        restantieri.forEach(System.out::println);
    }

    private static int[] randomNotes() {
        Random random = new Random();
        return random.ints(5, 4, 11).toArray();
    }
}
