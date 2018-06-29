package com.prog.lessons.Task.Task_9_166;

public class Task9166 {
    //Дано предложение. Поменять местами его первое и последнее слово

    public String swapWords(String str) {

        String[] words = str.split(" ");
        String tmp = words[0];
        words[0] = words[words.length - 1];
        words[words.length - 1] = tmp;
        StringBuilder result = new StringBuilder();
        for (String s : words) {
            result.append(s + " ");
        }
        return result.toString().substring(0, result.length() - 1);
    }
}
