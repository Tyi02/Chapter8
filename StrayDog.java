package com.CSCI185;

public class StrayDog implements Pet{
    private String name;
    public void setName(String name)
    {
        this.name =  name;
    }

    public String getName()
    {
        return name;
    }

    public void doTrick()
    {
        System.out.println("Stray dog comes and licks you");
    }
}
