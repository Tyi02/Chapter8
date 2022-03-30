package com.CSCI185;

public class PercentDiscountPolicy implements DiscountPolicy
{
    private double percent;
    public PercentDiscountPolicy(double newPercent)
    {
        setPercent(newPercent);
    }
    public void setPercent(double newPercent)
    {
        percent = newPercent; // 50%
    }
    //4 items @ $5
    public double computeDiscount(int count, double itemCost)
    {
        return percent*count*itemCost;
    }
}
