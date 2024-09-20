package Home_Work_6;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class UniqueWordsRegistr {
    public static void main(String[] args) {
        String filePath = "Война и мир_книга.txt";
        String textBook = ReadFile.readFile(filePath);
            String[] words = textBook.toString().toLowerCase().split("[- ,.!?\"\':;()\n]+");
            Set<String> uniqueWords = new HashSet<>(Arrays.asList(words));

                for (String word : words){
                    if (!word.isEmpty()){
                       uniqueWords.add(word);
                    }
                }
            System.out.println("Количество уникальных слов: " + uniqueWords.size());
            }
    }