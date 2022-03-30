package com.CSCI185;

public class BogoPolicy implements DiscountPolicy
{
    //4 items at $5
    public double computeDiscount(int count, double itemCost)
    {
        return (count/2)*itemCost;
    }
}
