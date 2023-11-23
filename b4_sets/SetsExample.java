package b4_sets;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetsExample {
    public static void main(String[] args) {
        Set<Integer> Set1 = new HashSet<Integer>();
        Set1.add(1);
        Set1.add(3);
        Set1.add(2);
        Set1.add(9);
        Set1.add(1);
        Set1.add(5);
        System.out.println("\33[H\033[2J");
        System.out.flush();
        System.out.println(Set1);


        Set<Integer> Set2 = new HashSet<Integer>();
        Set2.add(1);
        Set2.add(3);
        Set2.add(2);
        Set2.add(9);
        Set2.add(1);
        Set2.add(5);
        System.out.println(Set2);
        Set2.clear();
        System.out.println(Set2);

        Set<Integer> Set3 = new HashSet<Integer>();
        Set3.add(1);
        Set3.add(3);
        Set3.add(2);
        Set3.add(9);
        Set3.add(1);
        Set3.add(5);
        System.out.println(Set3);
        System.out.println(Set3.contains(8));
        System.out.println(Set3.contains(9));

        Set<Integer> a = new HashSet<Integer>();

        a.addAll(Arrays.asList(
                new Integer[] { 1, 3, 2, 4, 8, 9, 0 }));

        Set<Integer> b = new HashSet<Integer>();

        b.addAll(Arrays.asList(
                new Integer[] { 1, 3, 7, 5, 4, 0, 7, 5 }));

        Set<Integer> union = new HashSet<Integer>(a);
        union.addAll(b);
        System.out.print("Union of the two Set");
        System.out.println(union);

        Set<Integer> intersection = new HashSet<Integer>(a);
        intersection.retainAll(b);
        System.out.print("Intersection of the two Set");
        System.out.println(intersection);

        Set<Integer> difference = new HashSet<Integer>(a);
        difference.removeAll(b);
        System.out.print("Difference of the two Set");
        System.out.println(difference);

        System.out.println("Size of set 1: "+Set1.size());

    }

}
