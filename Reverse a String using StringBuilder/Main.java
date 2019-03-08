package com.example;

public class Main {

    public static void main(String[] args) {

        String xoxo = "cimin :inemin";
        String xoxo2 = "anub repus itse anitnelav :letfip";
        System.out.println(ceZiciMaVale(xoxo));
        System.out.println(ceZiciMaVale(xoxo2));

    }

    public static String ceZiciMaVale(String str) {
        StringBuilder stringBuilder = new StringBuilder();

        char[] strToChar = str.toCharArray();

        for (int i = strToChar.length - 1; i >= 0; i--) {
            stringBuilder.append(strToChar[i]);
        }

        return stringBuilder.toString();
    }
}
