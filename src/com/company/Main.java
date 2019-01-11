package com.company;

import java.util.Scanner;

/**
  Создание пользовательского профайла
 */


public class Main {
    public static String login;
    static Profile person = new Profile();
    static Scanner writeInfo = new Scanner(System.in);
    static Scanner writeInt = new Scanner(System.in);

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
                num = writeInt.nextInt();
                switch (num) {
                    case 1:
                        person.createProfile();
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


    static void showProfile(){
            System.out.println(person.toStr());
    }

    static String loginCheckout(){

        return person.loginCheckout();
    }
}

