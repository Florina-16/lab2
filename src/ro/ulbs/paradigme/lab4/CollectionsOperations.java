package ro.ulbs.paradigme.lab4;

import java.util.*;

public class CollectionsOperations {
    public static void main(String[] args) {
        Random rand = new Random();
        List<Integer> x = new ArrayList<>();
        List<Integer> y = new ArrayList<>();

        for (int i = 0; i < 5; i++) x.add(rand.nextInt(11));
        for (int i = 0; i < 7; i++) y.add(rand.nextInt(11));

        Collections.sort(x);
        Collections.sort(y);
        System.out.println("Lista x ordonata:" + x);
        System.out.println("Lista y ordonata:" + y);

        List<Integer> xPlusy = new ArrayList<>(x);
        xPlusy.addAll(y);
        Collections.sort(xPlusy);
        System.out.println("x + y ordonat:" + xPlusy);

        Set<Integer> zSet = new TreeSet<>(x);
        zSet.retainAll(y);
        System.out.println("Elemente comune: " + zSet);

        List<Integer> xMinusy = new ArrayList<>(x);
        xMinusy.removeAll(y);
        System.out.println("x - y: " + xMinusy);

        int p = 5;
        List<Integer> xPlusYLimitedByP = new ArrayList<>();
        for (int num : xPlusy) {
            if (num <= p) {
                xPlusYLimitedByP.add(num);
            }
        }
        System.out.println("xPlusYLimitedByp(<"+p+"): " + xPlusYLimitedByP);
    }
}

