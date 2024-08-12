package Home_Work_4;

import java.util.Arrays;
import java.util.Comparator;

public class DataContainer<T> {
    private T[] data;
/**
 * передается массив определенного типа данных
 */
    public DataContainer(T[] data) {
        this.data = Arrays.copyOf(data, data.length);
    }
    /**
     * Добавление нового элемента
     * @param item элемент кот нужно добавить
     * @return индекс элемента или -1, если передали null
     */
    public int add(T item) {
        int index = -1;

        if (item != null) {
            boolean paste = false;

            for (int i = 0; i < data.length; i++) {
                if (data[i] == null) {
                    data[i] = item;
                    index = i;
                    paste = true;
                    break;
                }
            }
            if (!paste) {
                data = Arrays.copyOf(data,data.length + 1);
                data[data.length -1] = item;
                index = data.length - 1;
            }
        }

        return index;
    }
    /**
     * Метод возвращает элемент по индексу
     * @param index индекс элемента
     * @return сам элемент
     */
    public T get(int index) {
        if (index < data.length && index >= 0) {
            return data[index];
        }
        return null;
    }
    /**
     * возвращает массив объекто
     * @return сам массив
     */
    public T[] getItems() {
        return data;
    }
    /**
     * удаляет элемент по его индексу
     * @param index индекс элемента
     * @return true, если передан правильный индекс и удалилили. false, если передан неправильный индекс
     */
    public boolean delete(int index) {
        if (index < data.length && index >= 0) {
            T[] newData = Arrays.copyOf(data,data.length - 1);

            for (int i = 0; i < index; i++) {
                newData[i] = data[i];
            }

            for (int i = index; i < newData.length; i++) {
                newData[i] = data[i+1];
            }

            data = Arrays.copyOf(newData,newData.length);

            return true;
        }
        return false;
    }

    /**
     * удаляет элемент по его значению
     * @param item объект, который нужно удалить
     * @return true если получилось удалить, false если передали null или элемент с таким значением не был найден
     */
    public boolean delete(T item) {
        if (item != null) {
            for (int i = 0; i < data.length; i++) {
                if (data[i].equals(item)) {
                    return delete(i);
                }
            }
        }

        return false;
    }
    /**
     * метод который перемещает все null в конец
     * @param container null которые нужно переместить в конец
     * @return количество null
     */
    private int moveNullElement(DataContainer<T> container) {
        // Перемещаем все null-элементы в конец массива
        for (int i = 0; i < container.getItems().length - 1; i++) {
            for (int j = i + 1; j < container.getItems().length; j++) {
                if (container.get(i) == null) {
                    T tmp = container.get(i);
                    container.getItems()[i] = container.get(j);
                    container.getItems()[j] = tmp;
                }
            }
        }
        int countOfNullElements = 0;
        // Считаем сколько в массиве null (для меньшего количества проверок при сортировке)
        for (T item : container.getItems()) {
            if (item == null) {
                countOfNullElements++;
            }
        }
        return countOfNullElements;
    }

    /**
     * Осртировка
     * @param comparator объект класса, реализующего интерфейс Comparator, критерии сортировки
     */
    public void sort(Comparator<T> comparator) {
        int countOfNullElements = this.moveNullElement(this);

        for (int i = 0; i < data.length - (1 + countOfNullElements); i++) {
            for (int j = i + 1; j < data.length - countOfNullElements; j++) {
                if (comparator.compare(data[i],data[j]) > 0) {
                    T tmp = data[i];
                    data[i] = data[j];
                    data[j] = tmp;
                }
            }
        }
    }
    /**
     * Метод переопределяет метод toString() класса Object для печати, пропуская элементы кот содержат null
     * @return для печати без null
     */
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder("[");

        for (int i = 0; i < data.length; i++) {
            if (data[i] != null) {
                builder.append(data[i].toString());
                if (i < data.length -1) {
                    builder.append(", ");
                }
            }
        }
        if(data.length != 0 && data[data.length -1] == null) {
            builder = new StringBuilder(builder.substring(0, builder.length() - 2));
        }
        builder.append("]");
        return builder.toString();
    }

}