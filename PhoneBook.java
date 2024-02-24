/*
Формат сдачи: ссылка на подписанный git-проект.

Задание

Реализуйте структуру телефонной книги с помощью HashMap.
Программа также должна учитывать, что в во входной структуре будут 
повторяющиеся имена с разными телефонами, их необходимо считать, 
как одного человека с разными телефонами. Вывод должен быть отсортирован 
по убыванию числа телефонов.
 */

import java.util.ArrayList;
import java.util.HashMap;

class PhoneBook {
    private static HashMap<String, ArrayList<Integer>> phoneBook = new HashMap<>();

    public void add(String name, Integer phoneNum) {
        if (phoneBook.containsKey(name)) {
            // box - временное хранилище номеров телефонов.
            ArrayList<Integer> box = new ArrayList<>();
            box.addAll(phoneBook.get(name));
            box.add(phoneNum);
            phoneBook.put(name, box);
        } else {
            ArrayList<Integer> box = new ArrayList<>();
            box.add(phoneNum);
            phoneBook.put(name, box);
        }
    }

    public void getPhoneBook() {
        int max = 0;

        // Поиск максимального количества номеров у одного человека
        for (String key : phoneBook.keySet()) {
            if (phoneBook.get(key).size() > max) {
                max = phoneBook.get(key).size();
            }
        }

        // Вывод справочника по убыванию числа телефонов
        int count = max;
        System.out.println("Вывод справочника по убыванию числа телефонов");
        while (count > 0) {
            for (String key : phoneBook.keySet()) {
                if (phoneBook.get(key).size() == count) {
                    System.out.println("Имя: " + key + ", Телефон: " + phoneBook.get(key));
                }
            }
            count--;
        }
    }
}
