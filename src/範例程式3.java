import java.util.*;

public class UtilExample {
    public static void main(String[] args) {
        Random random = new Random();
        List<Integer> numbers = new ArrayList<>();

        // Generate random numbers
        for (int i = 0; i < 10; i++) {
            numbers.add(random.nextInt(100)); // Random number between 0 and 99
        }

        // Print unsorted list
        System.out.println("Unsorted List: " + numbers);

        // Sort the list
        Collections.sort(numbers);

        // Print sorted list
        System.out.println("Sorted List: " + numbers);
    }
}
