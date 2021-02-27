package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        // write your code here
        List<String> strList = new ArrayList<String>();

        //   "киек","клик","клок","лицо", "цикл", "ялик", "кило", "клио"
        strList.add("киек");
        strList.add("клик");
        strList.add("клок");
        strList.add("лицо");
        strList.add("цикл");
        strList.add("ялик");
        strList.add("кило");
        strList.add("клио");
        strList.add("ялик");
        strList.add("клок");
        strList.add("лицо");
        strList.add("цикл");
        strList.add("киек");
        strList.add("клик");
        strList.add("клок");
        strList.add("лицо");
        strList.add("цикл");
        strList.add("ялик");
        strList.add("кило");
        strList.add("клио");
        strList.add("ялик");
        strList.add("клок");
        strList.add("лицо");
        strList.add("цикл");


        Map<String, Integer> strMap = new HashMap<>();

        for (int i = 0; i < strList.size(); i++) {
            if (strMap.get(strList.get(i)) == null) {
                strMap.put(strList.get(i), 1);
            } else
                strMap.replace(strList.get(i), (strMap.get(strList.get(i))) + 1);

        }
        // Найти и вывести список уникальных слов, из которых состоит массив (дубликаты не считаем).
        // Посчитать, сколько раз встречается каждое слово.

        System.out.println("слова" + "\t повторения");
        for (Map.Entry<String, Integer> entry : strMap.entrySet()) {
            System.out.println(entry.getKey() + "\t\t" + entry.getValue());
        }


        System.out.println("\n\n\n\n\n\n");


        Phonebook phonebook = new Phonebook();

        phonebook.setNewNumber("Абрамова Екатерина Артёмовна", 145);
        phonebook.setNewNumber("Агеев Фёдор Васильевич", 2465);
        phonebook.setNewNumber("Алексеев Владимир Даниилович", 4454963);
        phonebook.setNewNumber("Алешина Ярослава Романовна", 45487963);
        phonebook.setNewNumber("Антонова Мария Ярославовна", 6587963);
        phonebook.setNewNumber("Алексеев Владимир Даниилович", 7587963);
        phonebook.setNewNumber("Алешина Ярослава Романовна", 4587963);
        phonebook.setNewNumber("Антонова Мария Ярославовна", 67897963);
        phonebook.setNewNumber("Антонова Мария Ярославовна", 127963);
        phonebook.setNewNumber("Кукушкина София Романовна", 678487963);
        phonebook.setNewNumber("Лавров Артемий Владимирович", 265487963);
        phonebook.setNewNumber("Ларионова Виктория Львовна", 365487963);
        phonebook.setNewNumber("Ларионова София Марковна", 365487963);
        phonebook.setNewNumber("Леонов Кирилл Никитич", 365487963);
        phonebook.setNewNumber("Литвинов Всеволод Александрович", 46154963);
        phonebook.setNewNumber("Макаров Тимофей Владимирович", 565487963);
        phonebook.setNewNumber("Макарова Дарья Егоровна", 665487963);
        phonebook.setNewNumber("Ларионова Виктория Львовна", 665487963);
        phonebook.setNewNumber("Литвинов Всеволод Александрович", 765487963);
        phonebook.setNewNumber("Лавров Артемий Владимирович", 865487963);
        phonebook.setNewNumber("Лавров Артемий Владимирович", 865487963);


        phonebook.getNumber("Антонова Мария Ярославовна");
    }
}
