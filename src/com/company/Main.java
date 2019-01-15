package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

/**
  Создание пользовательского профайла
 */


public class Main {
    public static String login;

    public static void main(String[] args) {
        System.out.println("Введите логин");
        Scanner writeInfo = new Scanner(System.in);
        Profile person = new Profile();
        Main.login = writeInfo.nextLine();
        if (login.equals(loginCheckout(person))) {
            showProfile(person);
        } else {
            int num;
            System.out.println("Такого логина не существует");
            do {
                System.out.println("Введите 1 для создания профайла/" +
                        "2 для проверки пользователя по логину/" +
                        "3 для удаления учетной записи/" +
                        "любую другую цифру для выхода из программы/");
                num = writeInfo.nextInt();
                writeInfo.nextLine();
                switch (num) {
                    case 1:
                        createProfile(person, writeInfo);
                        break;
                    case 2:
                        System.out.println("Введите логин");
                        String check = writeInfo.nextLine();
                        if (check.equals(loginCheckout(person))) {
                            showProfile(person);
                        }
                        else {
                            System.out.println("Такого логина не существует");
                            break;
                        }
                        break;
                    case 3:
                        System.out.println("Введите логин удаляемого профиля");
                        String deleteLogin = writeInfo.nextLine();
                        if (deleteLogin.equals(loginCheckout(person))) {
                            person = null;
                            System.out.println("Удаление завершено");
                        } else {
                            System.out.println("Учетной записи с таким логином + " +
                                    "не существует");
                        }
                        break;
                }
            } while ((num >= 1) && (num <= 3));
        }
    }

    static void createProfile(Profile personality, Scanner writeInfoCreation){
        System.out.println("Введите новый логин:");
        String profileLogin = writeInfoCreation.nextLine();
        personality.setLoginForRegistration(profileLogin);
        System.out.println();

        System.out.println("Введите фамилию:");
        String profileSurname = writeInfoCreation.nextLine();
        personality.setSurname(profileSurname);
        System.out.println();

        System.out.println("Введите имя:");
        String profileName = writeInfoCreation.nextLine();
        personality.setName(profileName);
        System.out.println();

        System.out.println("Введите отчество:");
        String profilePatronymic = writeInfoCreation.nextLine();
        personality.setPatronymic(profilePatronymic);
        System.out.println();

        System.out.println("Введите электронную почту:");
        String profileEmail = writeInfoCreation.nextLine();
        personality.setEmail(profileEmail);
        System.out.println();

        System.out.println("Введите дату рождения:");
        String profileDateOfBirth = writeInfoCreation.nextLine();
        personality.setDateOfBirth(profileDateOfBirth);
        System.out.println();

        System.out.println("Введите место жительства:");
        String profilePlaceOfLiving = writeInfoCreation.nextLine();
        personality.setPlaceOfLiving(profilePlaceOfLiving);
        System.out.println();

        System.out.println("Введите серию паспорта:");
        String profilePassportSeria = writeInfoCreation.nextLine();
        personality.setPassportSeria(profilePassportSeria);
        System.out.println();

        System.out.println("Введите номер паспорта:");
        String profilePassportNumber = writeInfoCreation.nextLine();
        personality.setPassportNumber(profilePassportNumber);
        System.out.println();

        System.out.println("Кто выдал паспорт:");
        String profileWhoGavePassport = writeInfoCreation.nextLine();
        personality.setWhoGavePassport(profileWhoGavePassport);
        System.out.println();

        System.out.println("Введите номер телефона:");
        String profilePhoneNumber = writeInfoCreation.nextLine();
        personality.setPhoneNumber(profilePhoneNumber);
        System.out.println();

        System.out.println("Введите сайт своего адреса:");
        String profileSiteAdress = writeInfoCreation.nextLine();
        personality.setSiteAdress(profileSiteAdress);
        System.out.println();

        System.out.println("Введите место работы:");
        String profileWorkingPlace = writeInfoCreation.nextLine();
        personality.setWorkingPlace(profileWorkingPlace);
        System.out.println();

        System.out.println("Введите должность:");
        String profilePosition = writeInfoCreation.nextLine();
        personality.setPosition(profilePosition);
        System.out.println();

        System.out.println("Введите краткую информацию о себе:");
        String profileShortInfoAboutYou = writeInfoCreation.nextLine();
        personality.setShortInfoAboutYou(profileShortInfoAboutYou);
        System.out.println();

        System.out.println("Выберите один из предложенных аватаров: 1. /--/, 2. |00|, 3.|--|, 4. |..|");
        int choose = writeInfoCreation.nextInt();
        writeInfoCreation.nextLine();
        switch (choose){
            case 1:
                personality.setAvatar("/--/");
                break;
            case 2:
                personality.setAvatar("|00|");
                break;
            case 3:
                personality.setAvatar("|--|");
                break;
            case 4:
                personality.setAvatar("|..|");
                break;
        }
    }

    static void showProfile(Profile personality){

        System.out.println(personality.toString());
    }

    static String loginCheckout(Profile personality){

        return personality.getLoginForRegistration();
    }
}

