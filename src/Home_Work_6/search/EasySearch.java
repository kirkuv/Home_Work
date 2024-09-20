package Home_Work_6.search;

import Home_Work_6.api.ISearchEngine;

public class EasySearch implements ISearchEngine {
    @Override
    public long search(String text, String word) {
        long count = 0;
        int index = 0;

        while ((index = text.indexOf(word, index)) != -1) {
            boolean startWith = index == 0 || (!Character.isLetterOrDigit(text.charAt(index-1)) && text.charAt(index-1)!='-');
            boolean endWith = index + word.length() == text.length() || !Character.isLetterOrDigit(text.charAt(index+ word.length()));

            if (startWith && endWith) {
                count++;

            }
            index += word.length();
        }
        return count;
    }

}
