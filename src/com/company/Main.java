package com.company;

import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + ' ' + firstName + ' ' + middleName;
        System.out.println("ФИО сотрудника — " + fullName);
        String fullName1 = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullName1);
        fullName = fullName.replace(" ", "; ");
        System.out.println("Данные ФИО сотрудника для административного отдела — " + fullName);
        String fullName2 = "Иванов Семён Семёнович";
        if (fullName2.contains("ё")) {
            fullName2 = fullName2.replace("ё", "е");
        }
        System.out.println("Данные ФИО сотрудника — " + fullName2);
        // 5 задание
        String fullName3 = "Ivanov Ivan Ivanovich";
        char[] arr = fullName3.toCharArray();
        int a = 0;
        for (int i = 0; i < fullName3.length(); i++) {
            if (arr[i] == ' ') {
                String s = fullName3.substring(a, i);
                System.out.println(s);
                if (a == 0) {
                        lastName = s;
                } else {
                        firstName = s;
                }
                a = i;
            }
            middleName = fullName3.substring(a,fullName3.length());
        }
        System.out.println("Имя сотрудника —" + firstName);
        System.out.println("Фамилия сотрудника — " + lastName);
        System.out.println("Отчество сотрудника —" + middleName);
    }
}
