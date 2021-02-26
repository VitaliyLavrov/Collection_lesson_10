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
        strList.add("киек");        strList.add("клик");        strList.add("клок");        strList.add("лицо");
        strList.add("цикл");        strList.add("ялик");        strList.add("кило");        strList.add("клио");
        strList.add("ялик");        strList.add("клок");        strList.add("лицо");        strList.add("цикл");
        strList.add("киек");        strList.add("клик");        strList.add("клок");        strList.add("лицо");
        strList.add("цикл");        strList.add("ялик");        strList.add("кило");        strList.add("клио");
        strList.add("ялик");        strList.add("клок");        strList.add("лицо");        strList.add("цикл");



        Map<String, Integer> strMap = new HashMap<>();

        for (int i = 0; i < strList.size(); i++) {
            if (strMap.get(strList.get(i)) == null) {
                strMap.put(strList.get(i), 1);
            } else
                strMap.replace(strList.get(i), (strMap.get(strList.get(i))) + 1);

        }
        // Найти и вывести список уникальных слов, из которых состоит массив (дубликаты не считаем).
        // Посчитать, сколько раз встречается каждое слово.

        System.out.println("слова"+ "\t повторения");
        for (Map.Entry<String, Integer> entry : strMap.entrySet()) {
            System.out.println(entry.getKey() +"\t\t"+ entry.getValue());
        }

    }
}
