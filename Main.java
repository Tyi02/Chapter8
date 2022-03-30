package com.CSCI185;

public class Main {

    public static void main(String[] args) {
        Person p1 = new Person("John");
        Student s1 = new Student("Robert",12345);
        Student s2= new Student("John", 23232);

        p1.writeOutput();
        s1.writeOutput();

        Undergraduate u1 = new Undergraduate("Terry", 1234, 1);
        u1.writeOutput();

        System.out.println("Printing out info for S1: ");
        System.out.println(s1);




//        if(p1.hasSameName(s2))
//        {
//            System.out.println("They have the same name");
//        }
//        p1.writeOutput();
//        System.out.println("------------");
//        s1.writeOutput();
//        p1.writeOutput();
//        System.out.println("---------------------");
//        s1.writeOutput();
//        System.out.println(s1.getName());
   }
}
