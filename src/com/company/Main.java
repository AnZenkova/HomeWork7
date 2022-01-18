package com.company;

public class Main {

    public static void main(String[] args) {
        String firstName = "Ivan";
        firstName = firstName + ' ';
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        lastName = lastName + ' ';
        String fullName = lastName + firstName + middleName;
        System.out.println("ФИО сотрудника — " + fullName);
    }
}
