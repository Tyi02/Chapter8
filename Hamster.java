package com.CSCI185;

public class Hamster implements Pet{
    private String name;
    public void setName(String name)
    {
        this.name =  name;
    }

    public String getName()
    {
        return name;
    }
    public Hamster(String name)
    {
        this.name = name;
    }
    public void doTrick()
    {
        System.out.println(this.name+" runs on the wheel");
    }
}
