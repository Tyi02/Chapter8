package com.CSCI185;
/*
	1.	Give a complete definition of a class called TitledPerson -> based on person class
	1.	Has additional String Variable called title-> holds the persons title (mr., ms, mrs, dr, hnr)
	2.	2 Constructors (1 default, 1 to set name and title)
	3.	Accessor and Mutator method for title
	4.	writeOutput method (override the one from person)
	5.	Equals method that will compare title and name
 */
public class TitledPerson extends Person
{
    private String title;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public TitledPerson()
   {
       super ();
       title = "No Title yet.";
   }

   public TitledPerson(String initialName, String newTitle)
   {
       super(initialName);
       title = newTitle;

   }

   public void writeOutput()
   {
//       System.out.println("Name: "+getName()+", "+title);
       //works also ^^
       super.writeOutput();
       System.out.println("Title: "+title);
   }

   public boolean equals(TitledPerson other)
   {
       return this.hasSameName(other) &&
       this.title.equals(other.title);
   }
}
