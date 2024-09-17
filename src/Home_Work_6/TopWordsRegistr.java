package Home_Work_6;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TopWordsRegistr {
    public static void main(String[] args) {
        String filePath = "Война и мир_книга.txt";
        int topN = 10;
        String textBook = ReadFile.readFile(filePath);

            String[] words = textBook.toString().toLowerCase().split("[- ,.!?\"\':;()\n]+");
            Map<String, Integer> wordCountMap = new HashMap<>();
            for (String word : words) {
                if (!word.isEmpty()) {
                    wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
                }
            }
            List<Map.Entry<String, Integer>> sortedWordCount = new ArrayList<>(wordCountMap.entrySet());
            sortedWordCount.sort((o1, o2) -> o2.getValue().compareTo(o1.getValue()));
            System.out.println("Топ " + topN + " слов:");
            for (int i = 0; i < Math.min(topN, sortedWordCount.size()); i++) {
                Map.Entry<String, Integer> entry = sortedWordCount.get(i);
                System.out.println(entry.getKey() + " - " + entry.getValue() + " раз");
            }
    }
}
