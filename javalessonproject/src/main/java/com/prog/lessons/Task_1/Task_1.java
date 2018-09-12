package com.prog.lessons.Task_1;

public class Task_1 {
    public static Character findFirstNonRepChar(String str) {
        for (int i = 0; i < str.length(); i++) {
            Character c = str.charAt(i);
            if (str.indexOf(c) == str.lastIndexOf(c)) {
                return c;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        String s = "капейка";
        System.out.println(findFirstNonRepChar(s));
        System.out.println(s.indexOf("d"));
        System.out.println(s.lastIndexOf("d"));
    }
}
//}
//    public static char findFirstNonRepChar(String string) {
//        Map<Integer,Long> characters = string.chars().boxed()
//                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));
//        return (char)(int)characters.entrySet().stream()
//                .filter(e -> e.getValue() == 1L)
//                .findFirst()
//                .map(Map.Entry::getKey)
//                .orElseThrow(() -> new RuntimeException("No unrepeated character"));
//    }