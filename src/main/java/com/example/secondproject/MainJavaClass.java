package com.example.secondproject;

public class MainJavaClass {
    public static void main(String[] args) {


        System.out.println("Hello!");
        Person a = new Person();
        a.setFirstName("John");
        a.setLastName("Alex");
        a.setPhoneNumber("646-758-9937");
        a.setEmail("johnalex@email.com");

        System.out.println(a.Whatismyname());
        System.out.println(a.WhatismyAdderess());
        //System.out.println(a.getFirstName() + "\n "+a.getLastName() + "\n"+a.getPhoneNumber() + "\n "+a.getEmail());
    }
}