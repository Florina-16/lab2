package ro.ulbs.paradigme.lab4;

import java.util.Arrays;

public class Student implements Comparable<Student> {
    private String nume;
    private String grupa;
    private int[] note;

    public Student(String nume, String grupa, int[] note) {
        this.nume = nume;
        this.grupa = grupa;
        this.note = note;
    }

    public String getNume() {
        return nume;
    }

    public String getGrupa() {
        return grupa;
    }

    public double getMedie() {
        return Arrays.stream(note).average().orElse(0);
    }

    public int getRestante() {
        return (int) Arrays.stream(note).filter(n -> n < 5).count();
    }

    @Override
    public int compareTo(Student other) {
        return this.nume.compareTo(other.nume);
    }

    @Override
    public String toString() {
        return nume + " - " + grupa + " - " + Arrays.toString(note) + " - Medie: " + getMedie() + " - Restante: " + getRestante();
    }
}
