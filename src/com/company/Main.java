package com.company;

import java.util.Scanner;

/**
  Создание пользовательского профайла
 */


public class Main {

    public static String login;
    public static String loginForRegistration;
    public static String name;
    public static String surname;
    public static String patronymic;
    public static String email;
    public static String dateOfBirth;
    public static String placeOfLiving;
    public static String passportSeria;
    public static String passportNumber;
    public static String whoGavePassport;
    public static String phoneNumber;
    public static String siteAdress;
    public static String workingPlace;
    public static String position;
    public static String shortInfoAboutYou;
    public static String avatar;

    public static void main(String[] args) {
        Scanner writeInfo = new Scanner(System.in);
        Main person = new Main();
        System.out.println("Введите логин");
        Main.login = writeInfo.nextLine();
        if (login.equals(loginCheckout())) {
            showProfile();
        } else {
            int num;
            System.out.println("Такого логина не существует");
            do {
                System.out.println("Введите 1 для создания профайла/" +
                        "2 для проверки пользователя по логину/" +
                        "3 для удаления учетной записи/" +
                        "0 для выхода из программы/");
                num = writeInfo.nextInt();
                switch (num) {
                    case 1:
                        person.createProfile();
                        break;
                    case 2:
                        Scanner forLogin = new Scanner(System.in);
                        System.out.println("Введите логин");
                        String check = forLogin.nextLine();
                        if (check.equals(loginCheckout())) {
                            showProfile();
                        } else {
                            System.out.println("Такого логина не существует");
                            break;
                        }
                        break;
                    case 3:
                        Scanner del = new Scanner(System.in);
                        System.out.println("Введите логин удаляемого профиля");
                        String deleteLogin = del.nextLine();
                        if (deleteLogin.equals(loginCheckout())) {
                            person = null;
                            System.gc();
                            System.out.println("Удаление завершено");
                        } else {
                            System.out.println("Учетной записи с таким логином" +
                                    "не существует");
                        }
                        break;
                    case 0:
                        break;
                }
            } while (num != 0);
        }
    }

    static void createProfile(){
        Scanner profileData = new Scanner(System.in);
        System.out.println("Введите новый логин:");
        Main.loginForRegistration = profileData.nextLine();
        System.out.println();

        System.out.println("Введите фамилию:");
        Main.surname = profileData.nextLine();
        System.out.println();

        System.out.println("Введите имя:");
        Main.name = profileData.nextLine();
        System.out.println();

        System.out.println("Введите отчество:");
        Main.patronymic = profileData.nextLine();
        System.out.println();

        System.out.println("Введите электронную почту:");
        Main.email = profileData.nextLine();
        System.out.println();

        System.out.println("Введите дату рождения:");
        Main.dateOfBirth = profileData.nextLine();
        System.out.println();

        System.out.println("Введите место жительства:");
        Main.placeOfLiving = profileData.nextLine();
        System.out.println();

        System.out.println("Введите серию паспорта:");
        Main.passportSeria = profileData.nextLine();
        System.out.println();

        System.out.println("Введите номер паспорта:");
        Main.passportNumber = profileData.nextLine();
        System.out.println();

        System.out.println("Кто выдал паспорт:");
        Main.whoGavePassport = profileData.nextLine();
        System.out.println();

        System.out.println("Введите номер телефона:");
        Main.phoneNumber = profileData.nextLine();
        System.out.println();

        System.out.println("Введите сайт своего адреса:");
        Main.siteAdress = profileData.nextLine();
        System.out.println();

        System.out.println("Введите место работы:");
        Main.workingPlace = profileData.nextLine();
        System.out.println();

        System.out.println("Введите должность:");
        Main.position = profileData.nextLine();
        System.out.println();

        System.out.println("Введите краткую информацию о себе:");
        Main.shortInfoAboutYou = profileData.nextLine();
        System.out.println();

        System.out.println("Выберите один из предложенных аватаров: 1. /--/, 2. |00|, 3.|--|, 4. |..|");
        int choose = profileData.nextInt();
        switch (choose){
            case 1:
                Main.avatar = "/--/";
                break;
            case 2:
                Main.avatar = "|00|";
                break;
            case 3:
                Main.avatar = "|--|";
                break;
            case 4:
                Main.avatar = "|..|";
                break;
        }
    }

    static void showProfile(){
        System.out.println(loginForRegistration);
        System.out.println(surname);
        System.out.println(name);
        System.out.println(patronymic);
        System.out.println(email);
        System.out.println(dateOfBirth);
        System.out.println(placeOfLiving);
        System.out.println(passportSeria);
        System.out.println(passportNumber);
        System.out.println(whoGavePassport);
        System.out.println(phoneNumber);
        System.out.println(siteAdress);
        System.out.println(workingPlace);
        System.out.println(position);
        System.out.println(shortInfoAboutYou);
        System.out.println(avatar);
    }

    static String loginCheckout(){

        return loginForRegistration;
    }

}

