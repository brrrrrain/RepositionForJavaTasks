package com.company;

import java.util.Scanner;

public class Profile {

    private String loginForRegistration;

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


    public String getLoginForRegistration() {
        return loginForRegistration;
    }

    public void setLoginForRegistration(String loginForRegistration) {
        this.loginForRegistration = loginForRegistration;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getPlaceOfLiving() {
        return placeOfLiving;
    }

    public void setPlaceOfLiving(String placeOfLiving) {
        this.placeOfLiving = placeOfLiving;
    }

    public String getPassportSeria() {
        return passportSeria;
    }

    public void setPassportSeria(String passportSeria) {
        this.passportSeria = passportSeria;
    }

    public String getPassportNumber() {
        return passportNumber;
    }

    public void setPassportNumber(String passportNumber) {
        this.passportNumber = passportNumber;
    }

    public String getWhoGavePassport() {
        return whoGavePassport;
    }

    public void setWhoGavePassport(String whoGavePassport) {
        this.whoGavePassport = whoGavePassport;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getSiteAdress() {
        return siteAdress;
    }

    public void setSiteAdress(String siteAdress) {
        this.siteAdress = siteAdress;
    }

    public String getWorkingPlace() {
        return workingPlace;
    }

    public void setWorkingPlace(String workingPlace) {
        this.workingPlace = workingPlace;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getShortInfoAboutYou() {
        return shortInfoAboutYou;
    }

    public void setShortInfoAboutYou(String shortInfoAboutYou) {
        this.shortInfoAboutYou = shortInfoAboutYou;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String toString(){
        String pageLoginForRegestration = getLoginForRegistration();
        String pageName = getName();
        String pageSurname = getSurname();
        String pagePatronymic = getPatronymic();
        String pageEmail = getEmail();
        String pageDateOfBirth = getDateOfBirth();
        String pagePlaceOfLiving = getPlaceOfLiving();
        String pagePassportSeria = getPassportSeria();
        String pagePassportNumber = getPassportNumber();
        String pageWhoGavePassport = getWhoGavePassport();
        String pagePhoneNumber = getPhoneNumber();
        String pageSiteAdress = getSiteAdress();
        String pageWorkingPlace = getWorkingPlace();
        String pagePosition = getPosition();
        String pageShortInfoAboutYou = getShortInfoAboutYou();
        String pageAvatar = getAvatar();

        String informationString = pageLoginForRegestration + " " + pageName +
                " " + pageSurname + " " + pagePatronymic + " " + pageEmail +
                " " + pageDateOfBirth + " " + pagePlaceOfLiving + " " +
                pagePassportSeria + " " + pagePassportNumber + " " +
                pageWhoGavePassport + " " + pagePhoneNumber + " " +
                pageSiteAdress + " " + pageWorkingPlace + " " + pagePosition +
                " " + pageShortInfoAboutYou + " " + pageAvatar;

        return informationString;
    }

    String loginCheckout(){

        return getLoginForRegistration();
    }

}
