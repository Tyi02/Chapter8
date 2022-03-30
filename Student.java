package com.CSCI185;

public class Student extends Person
{
    private int studentNumber;
    public Student ()
    {
        super (); //Person()
        // this tells the child program to look at the parent class.
        studentNumber = 0; //Indicating no number yet
    }


    public Student (String initialName, int initialStudentNumber)
    {
        super (initialName); //Person(initalName)
        studentNumber = initialStudentNumber;
    }


    public void reset (String newName, int newStudentNumber)
    {
        setName (newName);
        studentNumber = newStudentNumber;
    }


    public int getStudentNumber ()
    {
        return studentNumber;
    }


    public void setStudentNumber (int newStudentNumber)
    {
        studentNumber = newStudentNumber;
    }


    public void writeOutput ()
    {
        super.writeOutput();
        System.out.println ("Student Number: " + studentNumber);
    }


    public boolean equals (Student otherStudent)
    {
        return this.hasSameName (otherStudent) &&
            (this.studentNumber == otherStudent.studentNumber);
    }

    public boolean equals (Object otherObject)
    {
        boolean isEqual = false;
        if ((otherObject != null) && //null means that it has no value
                (otherObject instanceof Student))
        {
            Student otherStudent = (Student) otherObject;
            isEqual = this.hasSameName (otherStudent) &&
                    (this.studentNumber ==
                            otherStudent.studentNumber);
        }


        return isEqual;
    }

    //toString method
    public String toString ()
    {
        return "Name: "+this.getName()+
                "\nSN: "+this.studentNumber;  //   "\n" means new line
    }
}