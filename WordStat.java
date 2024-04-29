package midterm.luka_mkervalishvili_1.task4;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class WordStat {
    public static void main(String[] args) {
        List<String> fantasyFormatData = DreamGenerator.fantasy;

        Set<String> uniqueWords = new HashSet<>(fantasyFormatData);
        System.out.println("Set of unique words:");
        for (String word : uniqueWords) {
            System.out.println(word);
        }

        Map<Integer, Integer> wordLengthCountMap = new HashMap<>();
        for (String word : fantasyFormatData) {
            int length = word.length();
            wordLengthCountMap.put(length, wordLengthCountMap.getOrDefault(length, 0) + 1);
        }

        System.out.println("\nMap of word lengths and their counts:");
        for (Map.Entry<Integer, Integer> entry : wordLengthCountMap.entrySet()) {
            System.out.println("Length: " + entry.getKey() + ", Count: " + entry.getValue());
        }
    }
}
