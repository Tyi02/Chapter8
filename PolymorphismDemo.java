package com.CSCI185;

public class PolymorphismDemo {
    public static void main(String[] args) {
//        Student george = new Student();
//        Person bob = new Student();
//        Student[] classmates = new Student[3];
//        classmates[0] = new Student("George", 12345);
//        classmates[1] = new Student("Juan", 45678);
//        classmates[2] = new Student("Terry", 420420);
//
//
//        //for each loop
//        for(Student classmate :classmates)
//        {
//            classmate.writeOutput();
//        }
        Person[] people = new Person[4];
        people[0] = new Person("George");
        people[1] = new Student("Terry", 12345);
        people[2] = new Undergraduate("Frank", 56789,2);
        people[3] = new TitledPerson("John", "Dr.");

        for(Person p:people)
        //this loop goes through the array and does each method
            // EX: for people[2] it runs the person mehtod and the Undergraduate method
        {
            p.writeOutput();
        }

    }
}
