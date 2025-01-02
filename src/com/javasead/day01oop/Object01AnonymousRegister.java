package com.javasead.day01oop;

import java.nio.file.attribute.UserPrincipal;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class Object01AnonymousRegister {
    public static void main(String[] args) {
        // 键入
        Scanner sc = new Scanner(System.in);

        System.out.println("User：");
        String name = sc.nextLine();
        System.out.println("Phone Number：");
        String phoneNum = sc.nextLine();

        String password = "";
        String confirm = "";

        while (true) {
            System.out.println("Login Password：");
            password = sc.nextLine();
            System.out.println("Confirm Password：");
            confirm = sc.nextLine();
            // 判断两次密码是否一致
            if (password.equals(confirm)) {
                break; // 一致则推出判断
            } else {
                System.out.println("" +
                        "Login Password and Confirm Password don't match, please re-enter.");
            }
        }

        System.out.println("Email:");
        String email = sc.nextLine();
        System.out.println("Sex:");
        String sex = sc.nextLine();
        System.out.println("Birth Date:");
        String birthDate = sc.nextLine();

        // 存储用户对象的集合
        ArrayList<Object01AnonymousUser> userAL = new ArrayList<>();
        // 使用匿名对象作为参数
        userAL.add(new Object01AnonymousUser(name, phoneNum, password, confirm, email, sex, birthDate));

        for (Object01AnonymousUser user : userAL) {
            System.out.println(user.getName() + " , ");
            System.out.println(user.getPhoneNum() + " , ");
            System.out.println(user.getPassword() + " , ");
            System.out.println(user.getConfirm() + " , ");
            System.out.println(user.getEmail() + " , ");
            System.out.println(user.getSex() + " , ");
            System.out.println(user.getBirthdate() + "\n");
        }
    }
}
