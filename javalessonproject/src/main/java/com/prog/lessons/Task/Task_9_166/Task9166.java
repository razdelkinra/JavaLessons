package com.prog.lessons.Task.Task_9_166;

public class Task9166 {
    //Дано предложение. Поменять местами его первое и последнее слово

    public String swapwords(String str){

     // писать метод, а не main, тренируйся в придумывании названий методов на английском

        String tmp;
        String[] words = str.split(" ");
        tmp = words[0];
        words[0] = words[words.length - 1];
        words[words.length - 1] = tmp;

        StringBuilder rezult = new StringBuilder();
        for (String s : words) {
            rezult.append(s + " ");
        }
        String st = rezult.toString();
        System.out.println(st);

        return st;
    }
}
