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
    }
}
