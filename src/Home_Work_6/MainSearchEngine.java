package Home_Work_6;

import Home_Work_6.api.ISearchEngine;
import Home_Work_6.search.EasySearch;

public class MainSearchEngine {
    public static void main(String[] args) {
        String filePath = "Война и мир_книга.txt";
        String textBook = ReadFile.readFile(filePath);
        ISearchEngine iSearchEngine = new EasySearch();
        System.out.println("война - "+iSearchEngine.search(textBook," война "));
        System.out.println("и - "+iSearchEngine.search(textBook, " и "));
        iSearchEngine.search(textBook,"мир");
    }
}
