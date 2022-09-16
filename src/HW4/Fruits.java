package HW4;

import java.util.*;

public class Fruits {



    public static void main(String[] args) {
        List<String> fruits = Arrays.asList ("apple", "fig", "persimmon", "kiwi", "pomegranate", "lime", "grapefruit",
                "persimmon", "apricot", "mango", "persimmon", "fig", "pomegranate", "kiwi", "lime",
                "grapefruit", "lemon", "mango", "tangerine", "lime", "pomegranate", "persimmon");

        System.out.println("Source List:");
        fruits.forEach(System.out::println);

        System.out.println("\nSummary:");
        HashMap<String, Integer> fruitsCount = new HashMap<>();
        for (String f : fruits) {
            fruitsCount.put(f, fruitsCount.getOrDefault(f, 0) + 1);
        }
        fruitsCount.entrySet().forEach(System.out::println);

        System.out.println("\nNo repeats: ");
        Set<String> unique = new HashSet<>(fruits);
        unique.forEach(System.out::println);

    }
}
