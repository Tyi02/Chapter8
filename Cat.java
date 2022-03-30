package com.CSCI185;

public class Cat implements Pet {
    private String name;
    public void setName(String name)
    {
        this.name =  name;
    }

    public String getName()
    {
        return name;
    }
public Cat (String name)
{
    this.name = name;
}
    public void doTrick() {
        System.out.println(this.name+" lays down");
    }
}