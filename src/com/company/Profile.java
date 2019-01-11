package com.company;

import java.util.Scanner;

public class Profile {

    public static String loginForRegistration;

    private String name;
    private String surname;
    private String patronymic;
    private String email;
    private String dateOfBirth;
    private String placeOfLiving;
    private String passportSeria;
    private String passportNumber;
    private String whoGavePassport;
    private String phoneNumber;
    private String siteAdress;
    private String workingPlace;
    private String position;
    private String shortInfoAboutYou;
    private String avatar;

    Scanner putText = new Scanner(System.in);


    void createProfile(){
        System.out.println("Введите новый логин:");
        loginForRegistration = putText.nextLine();
        System.out.println();

        System.out.println("Введите фамилию:");
        surname = putText.nextLine();
        System.out.println();

        System.out.println("Введите имя:");
        name = putText.nextLine();
        System.out.println();

        System.out.println("Введите отчество:");
        patronymic = putText.nextLine();
        System.out.println();

        System.out.println("Введите электронную почту:");
        email = putText.nextLine();
        System.out.println();

        System.out.println("Введите дату рождения:");
        dateOfBirth = putText.nextLine();
        System.out.println();

        System.out.println("Введите место жительства:");
        placeOfLiving = putText.nextLine();
        System.out.println();

        System.out.println("Введите серию паспорта:");
        passportSeria = putText.nextLine();
        System.out.println();

        System.out.println("Введите номер паспорта:");
        passportNumber = putText.nextLine();
        System.out.println();

        System.out.println("Кто выдал паспорт:");
        whoGavePassport = putText.nextLine();
        System.out.println();

        System.out.println("Введите номер телефона:");
        phoneNumber = putText.nextLine();
        System.out.println();

        System.out.println("Введите сайт своего адреса:");
        siteAdress = putText.nextLine();
        System.out.println();

        System.out.println("Введите место работы:");
        workingPlace = putText.nextLine();
        System.out.println();

        System.out.println("Введите должность:");
        position = putText.nextLine();
        System.out.println();

        System.out.println("Введите краткую информацию о себе:");
        shortInfoAboutYou = putText.nextLine();
        System.out.println();

        System.out.println("Выберите один из предложенных аватаров: 1. /--/, 2. |00|, 3.|--|, 4. |..|");
        int choose = putText.nextInt();
        switch (choose){
            case 1:
                avatar = "/--/";
                break;
            case 2:
                avatar = "|00|";
                break;
            case 3:
                avatar = "|--|";
                break;
            case 4:
                avatar = "|..|";
                break;
        }
    }

    String toStr(){
        String informationString = loginForRegistration + " " + name + " " +
                surname + " " + patronymic + " " + email + " " + dateOfBirth +
                " " + placeOfLiving + " " + passportSeria + " " +
                passportNumber + " " + whoGavePassport + " " + phoneNumber +
                " " + siteAdress + " " + workingPlace + " " + position + " " +
                shortInfoAboutYou + " " + avatar;

        return informationString;
    }

    String loginCheckout(){

        return loginForRegistration;
    }

}
