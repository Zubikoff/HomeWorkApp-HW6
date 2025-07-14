package lesson_13;

import java.util.*;
import java.util.stream.Stream;

public class SetOfWords {
    public static void main(String[] args) {
        //FIRST task
        List<String> words = new ArrayList<>();
        words.add("Minsk");
        words.add("London");
        words.add("Moscow");
        words.add("Minsk");
        words.add("Berlin");
        words.add("Dublin");
        words.add("Canberra");
        words.add("Paris");
        words.add("Paris");
        words.add("Mogilev");
        words.add("Coconut");
        words.add("Apple");
        words.add("Orange");
        words.add("Lemon");
        words.add("Strawberry");
        words.add("London");
        words.add("Minsk");
        words.add("Banana");

        //initial list of words
        System.out.println("A list of words:");
        System.out.println(words);

        //list of words filtered from duplicates
        //List<String> uniqueWords = words.stream().distinct().toList();
        HashSet<String> uniqueWords = new HashSet<>(words);
        System.out.println("A list of words (distinct):");
        System.out.println(uniqueWords);

        //list of words without duplicates with counter for each word
        HashMap<String, Integer> wordsMap = new HashMap<>();
        for (String word: words) {
            if (wordsMap.get(word) != null) { wordsMap.put(word, wordsMap.get(word)+1); }
            else { wordsMap.put(word, 1); }
        }
        System.out.println("A list of words with counter for each word:");
        System.out.println(wordsMap);

        //SECOND task
        System.out.println("========================================================================================");
        PhoneDirectory phoneDirectory = new PhoneDirectory();
        phoneDirectory.add("Zubarik", "222222222");
        phoneDirectory.add("Nubarik", "333333333");
        phoneDirectory.add("Kubarik", "444444444");
        phoneDirectory.add("Dubarik", "555555555");
        phoneDirectory.add("Dubarik", "555555555"); //intentional
        phoneDirectory.add("Zubarik", "555555555");
        System.out.println("Phone number(s) of Nubarik: " + phoneDirectory.get("Nubarik"));
        System.out.println("Phone number(s) of Zubarik: " + phoneDirectory.get("Zubarik"));
        System.out.println("Phone number(s) of Kavubarik: " + phoneDirectory.get("Kavubarik"));
        System.out.println("All entries in the phone directory: ");
        phoneDirectory.printAll();
    }
}
