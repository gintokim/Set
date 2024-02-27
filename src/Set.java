//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.HashSet;

public class Set {
    private HashSet<Integer> set;

    public Set() {
        this.set = new HashSet<>();
    }

    // Метод для добавления элемента в множество
    public void add(int element) {
        set.add(element);
    }

    // Метод для удаления элемента из множества
    public void remove(int element) {
        set.remove(element);
    }

    // Метод для проверки, содержится ли элемент в множестве
    public boolean contains(int element) {
        return set.contains(element);
    }

    // Метод для получения размера множества
    public int size() {
        return set.size();
    }

    // Метод для вывода элементов множества
    public void display() {
        System.out.print("Set: ");
        for (int element : set) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Создаем множество
        Set mySet = new Set();

        // Добавляем элементы в множество
        mySet.add(1);
        mySet.add(2);
        mySet.add(3);

        // Выводим содержимое множества
        mySet.display();

        // Проверяем наличие элемента в множестве
        System.out.println("Contains 2: " + mySet.contains(2));

        // Удаляем элемент из множества
        mySet.remove(2);

        // Выводим обновленное содержимое множества
        mySet.display();

        // Проверяем размер множества
        System.out.println("Size of set: " + mySet.size());
    }
}