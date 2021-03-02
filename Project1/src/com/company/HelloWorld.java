package com.company;


import com.sun.deploy.security.SelectableSecurityManager;

public class HelloWorld {

    public static void main(String[] args) {

        boolean flag = true;
                if(flag){
                    System.out.println("value of flag is true");

                }

        System.out.println("Hello world");
        sayHello("Ivana");
        sayGoodbye("Team");

    }

    public static void sayHello(String name){
        System.out.println("Hello " +name);
    }

    public static void sayGoodbye(String name){
        System.out.println("Good Bye " +name);
    }

    private int age;

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public HelloWorld(int age) {
        this.age = age;

    }
}
