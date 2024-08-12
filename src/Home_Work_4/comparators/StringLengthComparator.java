package Home_Work_4.comparators;

import java.util.Comparator;

public class StringLengthComparator implements Comparator<String> {
    /**
     * @param o1 первая строка
     * @param o2 вторая строка
     */
    @Override
    public int compare(String o1, String o2) {
        return o1.length() - o2.length();
    }
}
