package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

/**
  Создание пользовательского профайла
 */


public class Main {
    public static String login;
    static Profile person = new Profile();
    static Scanner writeInfo = new Scanner(System.in);
    /*
     Оставил статик у Profile и Scanner, так как придобавлении в main
     перестают вызываться методы, используемые вне main
     */


    public static void main(String[] args) {
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
                writeInfo.nextLine();
                switch (num) {
                    case 1:
                        createProfile();
                        break;
                    case 2:
                        System.out.println("Введите логин");
                        String check = writeInfo.nextLine();
                        if (check.equals(loginCheckout())) {
                            showProfile();
                        }
                        else {
                            System.out.println("Такого логина не существует");
                            break;
                        }
                        break;
                    case 3:
                        System.out.println("Введите логин удаляемого профиля");
                        String deleteLogin = writeInfo.nextLine();
                        if (deleteLogin.equals(loginCheckout())) {
                            person = null;
                            System.out.println("Удаление завершено");
                        } else {
                            System.out.println("Учетной записи с таким логином + " +
                                    "не существует");
                        }
                        break;
                    default:
                        break;
                }
            } while (num != 0);
        }
    }

    static void createProfile(){
        System.out.println("Введите новый логин:");
        String profileLogin = writeInfo.nextLine();
        person.setLoginForRegistration(profileLogin);
        System.out.println();

        System.out.println("Введите фамилию:");
        String profileSurname = writeInfo.nextLine();
        person.setSurname(profileSurname);
        System.out.println();

        System.out.println("Введите имя:");
        String profileName = writeInfo.nextLine();
        person.setName(profileName);
        System.out.println();

        System.out.println("Введите отчество:");
        String profilePatronymic = writeInfo.nextLine();
        person.setPatronymic(profilePatronymic);
        System.out.println();

        System.out.println("Введите электронную почту:");
        String profileEmail = writeInfo.nextLine();
        person.setEmail(profileEmail);
        System.out.println();

        System.out.println("Введите дату рождения:");
        String profileDateOfBirth = writeInfo.nextLine();
        person.setDateOfBirth(profileDateOfBirth);
        System.out.println();

        System.out.println("Введите место жительства:");
        String profilePlaceOfLiving = writeInfo.nextLine();
        person.setPlaceOfLiving(profilePlaceOfLiving);
        System.out.println();

        System.out.println("Введите серию паспорта:");
        String profilePassportSeria = writeInfo.nextLine();
        person.setPassportSeria(profilePassportSeria);
        System.out.println();

        System.out.println("Введите номер паспорта:");
        String profilePassportNumber = writeInfo.nextLine();
        person.setPassportNumber(profilePassportNumber);
        System.out.println();

        System.out.println("Кто выдал паспорт:");
        String profileWhoGavePassport = writeInfo.nextLine();
        person.setWhoGavePassport(profileWhoGavePassport);
        System.out.println();

        System.out.println("Введите номер телефона:");
        String profilePhoneNumber = writeInfo.nextLine();
        person.setPhoneNumber(profilePhoneNumber);
        System.out.println();

        System.out.println("Введите сайт своего адреса:");
        String profileSiteAdress = writeInfo.nextLine();
        person.setSiteAdress(profileSiteAdress);
        System.out.println();

        System.out.println("Введите место работы:");
        String profileWorkingPlace = writeInfo.nextLine();
        person.setWorkingPlace(profileWorkingPlace);
        System.out.println();

        System.out.println("Введите должность:");
        String profilePosition = writeInfo.nextLine();
        person.setPosition(profilePosition);
        System.out.println();

        System.out.println("Введите краткую информацию о себе:");
        String profileShortInfoAboutYou = writeInfo.nextLine();
        person.setShortInfoAboutYou(profileShortInfoAboutYou);
        System.out.println();

        System.out.println("Выберите один из предложенных аватаров: 1. /--/, 2. |00|, 3.|--|, 4. |..|");
        int choose = writeInfo.nextInt();
        writeInfo.nextLine();
        switch (choose){
            case 1:
                person.setAvatar("/--/");
                break;
            case 2:
                person.setAvatar("|00|");
                break;
            case 3:
                person.setAvatar("|--|");
                break;
            case 4:
                person.setAvatar("|..|");
                break;
        }
    }

    static void showProfile(){

        System.out.println(person.toString());
    }

    static String loginCheckout(){

        return person.getLoginForRegistration();
    }
}

