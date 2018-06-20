package com.prog.lessons.Task.Task_9_166;

public class Task9166 {
    //Дано предложение. Поменять местами его первое и последнее слово

    public static void main(String[] args) {

        String str = "У бурных чувст неистовый конец";
        String tmp;
        String[] words = str.split(" ");
        tmp = words[0];
        words[0] = words[words.length - 1];
        words[words.length - 1] = tmp;
        for (String word : words) {
            System.out.print(word + " ");
        }
    }
}