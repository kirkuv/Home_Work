package Home_Work_6.test;

import Home_Work_6.TopWords;
import Home_Work_6.UniqueWords;
import Home_Work_6.search.EasySearch;

public class Main {
    public static void main(String[] args) {
        UniqueWords.main(args);
        TopWords.main(args);
        EasySearch easySearch = new EasySearch();
        String textToSearch = "Привет как ттвои дела, то у тебя нового? Привет, Лано пока.";
        String wordToFind = "привет";
        long occurences = easySearch.search(textToSearch.toLowerCase(), wordToFind.toLowerCase());
        System.out.println("Слово '"+ wordToFind + "' встречается "+ occurences + " раз.");
    }
}
