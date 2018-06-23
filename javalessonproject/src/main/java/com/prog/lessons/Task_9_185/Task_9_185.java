package com.prog.lessons.Task_9_185;

import java.util.Stack;

public class Task_9_185 {
    //Строка содержит арифметическое выражение. Проверить правильно ли в нем расставлены круглые скобки
    //а) ответом должно служить да или нет
    //в) если имеются лишние правые скобки, то выдать индекс первой такой скобки
    // если имеются лишние левые то указать количество таких скобок

    public  boolean isParenthesisMatch(String str) { // static убрать. не забывай ctrl + alt + l
        Stack<Character> stack = new Stack<>();
        char c;
        int n =0;
        for (int i = 0; i < str.length(); i++) {
            c = str.charAt(i);

            if (c == '('){
                n++;
                stack.push(c);
                }
            else if (c == ')')
                if (stack.empty()){
                    System.out.println("Индекс лишней закрывающейся скобки" + str.indexOf(c,i));
                    return false;
            }
                else if (stack.peek() == '('){
                    n--;
                    stack.pop();
            }

                else
                    return false;
            if ((i==str.length()-1) && n>0) // (почему две && пишут знаешь??? ) если первое выражение false, то второе проверятся не будет.
                System.out.println("Лишние открывающиеся скобки в количестве: " + n + " штук");
        }

        return stack.empty();

    }


            //System.out.println(isParenthesisMatch("(a+b)(a-b) = (a-b)(a+b)")); // тест сам просится))

        }


