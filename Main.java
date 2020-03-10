package com.metanit;

import com.sun.jmx.snmp.SnmpUnknownAccContrModelException;

public class Main {

    public static int age = 22;
    public static String name = "Catalea";
    public static String country = " Chicago";


    public static void main(String[] args) {

        System.out.println("Hello World!");

        System.out.println("My name is " + name +  ", my age - " + age);

        System.out.println("I live in" + country);

        User user = new User ();
        user.setName("Max");
        user.setId(505);
        user.setAccess(true);
        System.out.println(user.getName());
        System.out.println(user.getId());
        System.out.println(user.isAccess());

    }
}
