package module11.homework;
import java.util.HashSet;
import java.util.Set;

public class hwTask1 {
    public static <T> Set<T> union(Set<T> set1, Set<T> set2) {
        // Create a new HashSet based on the first set to preserve originals
        Set<T> unionSet = new HashSet<>(set1);
        // addAll efficiently adds all elements from the second set
        unionSet.addAll(set2);
        return unionSet;
    }

    /**
     * Returns a new set containing only the elements common to both sets (intersection).
     */
    public static <T> Set<T> intersect(Set<T> set1, Set<T> set2) {
        // Create a new HashSet based on the first set
        Set<T> intersectionSet = new HashSet<>(set1);
        // retainAll keeps only the elements that are also in the second set
        intersectionSet.retainAll(set2);
        return intersectionSet;
    }

    public static void main(String[] args) {
        // 1. Create two pre-filled sets
        Set<Integer> firstSet = new HashSet<>();
        firstSet.add(1);
        firstSet.add(2);
        firstSet.add(3);
        firstSet.add(4);

        Set<Integer> secondSet = new HashSet<>();
        secondSet.add(3);
        secondSet.add(4);
        secondSet.add(5);
        secondSet.add(6);

        System.out.println("First Set: " + firstSet);
        System.out.println("Second Set: " + secondSet);

        // 2. Test the union operation
        Set<Integer> unionResult = union(firstSet, secondSet);
        System.out.println("Union of sets: " + unionResult); // Expected: [1, 2, 3, 4, 5, 6]

        // 3. Test the intersection operation
        Set<Integer> intersectResult = intersect(firstSet, secondSet);
        System.out.println("Intersection of sets: " + intersectResult); // Expected: [3, 4]
    }
}

