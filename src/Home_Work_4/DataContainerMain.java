package Home_Work_4;

import Home_Work_4.comparators.IntegerComparator;
import Home_Work_4.comparators.StringAlphabeticComparator;
import Home_Work_4.comparators.StringLengthComparator;

import java.util.Arrays;

public class DataContainerMain {
    public static void main(String[] args) {
        Integer[] emptyArrayOfInteger = new Integer[0];
        Integer[] arrayOfIntegerWithNullElements = {8, 7, 45, 12, 0, null, 3, 81, 98, null, null, null};
        String[] emptyArrayOfString = new String[0];
        String[] arrayOfStringWithNullElements = {"Юля", "Рома", "Киря", null, "Хто", "Маша", null, "Женька", "Олежка", "Катя", null, "Никита"};
        Integer[] nullArray = null;

        // тестируем задания 1-9
        if (isNotNullInsteadOfArray(emptyArrayOfInteger)) {
            DataContainer<Integer> container = new DataContainer<>(emptyArrayOfInteger);

            container.add(2);
            container.add(4);
            container.add(1);
            container.add(4);
            container.add(0);
            container.add(6);
            System.out.println("после добавления элементов: " + container);

            int indexForDelete = 4;
            if (container.delete(indexForDelete)) {
                System.out.println("Был удален один элемент по индексу " + indexForDelete);
                System.out.println("после удаления элемента: " + container);
            }

            Integer element = 9;
            System.out.println("добавление элемента " + element + " по индексу " + container.add(element));
            System.out.println("после добавления элемента: " + container);

            container.sort(new IntegerComparator());
            System.out.println("Отсортированная коллекция: " + Arrays.toString(container.getItems()));

            if (container.delete(Integer.valueOf(4))) {
                System.out.println("Удление одного элемента");
                System.out.println("после удаления элемента: " + container);
            }
        } else {
            System.out.println("Вы передали null!");
        }
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++");

        if (isNotNullInsteadOfArray(emptyArrayOfString)) {
            DataContainer<String> container = new DataContainer<>(emptyArrayOfString);

            container.add("Юля");
            container.add("Рома");
            container.add("Киря");
            container.add("Хто");
            container.add("Маша");
            container.add("Женька");
            container.add("Олежка");
            container.add("Катя");
            container.add("Никита");
            System.out.println("после добавления элементов: " + container);

            String element = "Киря";

            if (container.delete(element)) {
                System.out.println("удаление одного элемента");
                System.out.println("после удаления элемента: " + container);
            }

            System.out.println("Добавлен элемент '" + element + "' с индексом " + container.add(element));
            System.out.println("после добавления элемента: " + container);

            container.sort(new StringLengthComparator());
            System.out.println("Отсортированная по длине строки коллекция: " + container);

            System.out.println("Первый элемент в списке: " + container.get(0));

            if (container.delete(5)) {
                System.out.println("удаление одного элемена");
            }

            System.out.println("Добавлен элемент по индексу " + container.add(element));
        } else {
            System.out.println("передал null!");
        }
        System.out.println("-------------------------------------------");

        if (isNotNullInsteadOfArray(arrayOfIntegerWithNullElements)) {
            DataContainer<Integer> container = new DataContainer<>(arrayOfIntegerWithNullElements);

            System.out.println("до вставки элемента: " + Arrays.toString(container.getItems()));

            Integer element = 7;
            System.out.println("Добавлен элемент " + element + " по индексу " + container.add(element));
            System.out.println("после вставки элемента: " + Arrays.toString(container.getItems()));

            System.out.println("без null" + container);
        } else {
            System.out.println("передал null!");
        }
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        if (isNotNullInsteadOfArray(arrayOfStringWithNullElements)) {
            DataContainer<String> container = new DataContainer<>(arrayOfStringWithNullElements);

            System.out.println("до вставки элемента: " + Arrays.toString(container.getItems()));

            String element = "Анка";
            System.out.println("Добавлен элемент '" + element + "' по индексу " + container.add(element));
            System.out.println("после вставки элемента: " + Arrays.toString(container.getItems()));

            System.out.println("без null");

            container.sort(new StringAlphabeticComparator());
            System.out.println("Отсортированная по алфавиту коллекция: " + container);
        } else {
            System.out.println("передал null!");
        }
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        if (isNotNullInsteadOfArray(emptyArrayOfInteger)) {
            DataContainer<Integer> container = new DataContainer<>(emptyArrayOfInteger);

            System.out.println("Пустое: " + container);
        } else {
            System.out.println("передал null!");
        }
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        if (isNotNullInsteadOfArray(nullArray)) {
            DataContainer<Integer> container = new DataContainer<>(nullArray);

            System.out.println("Пустое: " + container);
        } else {
            System.out.println("передал null!");
        }
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++");
    }

    public static <T> boolean isNotNullInsteadOfArray(T[] array) {
        return array != null;
    }
}
