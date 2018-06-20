package com.prog.lessons.Task.Task_9_166;

public class Task9166 {
    //Дано предложение. Поменять местами его первое и последнее слово

    public static void main(String[] args) {  // писать метод, а не main, тренируйся в придумывании названий методов на английском

        String str = "У бурных чувст неистовый конец";
        String tmp;
        String[] words = str.split(" ");
        tmp = words[0];
        words[0] = words[words.length - 1];
        // Используй StringBuilder для формировании строки.
        // Вопрос почему его а не String? Чем отличается StringBuilder от StringBuffer?
        words[words.length - 1] = tmp;
        for (String word : words) {
            System.out.print(word + " ");
        }
         //return result;  вот на это можно будет тест написать теперь.
    }
}